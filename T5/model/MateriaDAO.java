package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Materia;

public class MateriaDAO {
	Connection conn;
	
	public MateriaDAO() throws SQLException{
		conn = ConnectionFactory.getConection();
	}

	public void createMateria() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS Materia ("
					+ "id serial PRIMARY KEY,"
				    + " nome varchar,"
					+ " carga int,"
				    + " semestre int,"
				    + " id_curso integer REFERENCES Curso(id),"
					+ " id_professor integer REFERENCES Professor(id) );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void insert(Materia m, int idcurso) throws SQLException{
		String sql = "INSERT INTO Materia (nome, carga, semestre, id_curso)" + " VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		//setString para varchar; setInt para int, etc
		ps.setString(1, m.getNome()); 
		ps.setInt(2, m.getCargaHoraria());
		ps.setInt(3, m.getSemestre());
		ps.setInt(4, idcurso);
		ps.execute();
	}
	
	public void listar() throws SQLException{
		String sql = "SELECT a.*,b.nome as NomeProfessor FROM Materia a left join Professor b on a.id_professor=b.id;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Código da Matéria: ");
			System.out.println(rs.getObject("id"));
			System.out.print("Nome da Matéria: ");
			System.out.println(rs.getObject("nome"));
			System.out.print("Carga Horária da Matéria: ");
			System.out.println(rs.getObject("carga"));
			System.out.print("Semestre da Matéria:");
			System.out.println(rs.getObject("semestre"));
			System.out.print("Curso: ");
			System.out.println(rs.getObject("id_curso"));
			System.out.print("Professor: ");
			System.out.println(rs.getObject("NomeProfessor"));
			System.out.println();
		}
		ps.execute();
	}
	
	public void alterarProfessor(int id_professor, int id_matricula) throws SQLException{
		String sql = "UPDATE Materia SET id_professor=? WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id_professor);
		ps.setInt(2, id_matricula);
		ps.execute();						
	}
	
	public void listarMateriasMatriculadas(int semestre, int id_curso) throws SQLException{
		String sql = "SELECT a.*,b.nome as NomeProfessor FROM Materia a left join Professor b on a.id_professor=b.id where semestre=? and curso=?;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, semestre);
		ps.setInt(2, id_curso);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Nome da Matéria: ");
			System.out.println(rs.getObject("nome"));
			System.out.print("Carga Horária da Matéria: ");
			System.out.println(rs.getObject("carga"));
			System.out.print("Professor: ");
			System.out.println(rs.getObject("NomeProfessor"));
			System.out.println();
			System.out.println("Nota:");
		}
		ps.execute();
	}
	public void listarMateriasdoProf(int id_prof) throws SQLException{
		String sql = "SELECT * FROM Materia where id_professor=?;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id_prof);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Código: ");
			System.out.println(rs.getObject("id"));
			System.out.print("Nome da Matéria: ");
			System.out.println(rs.getObject("nome"));
		}
		ps.execute();
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}

}
