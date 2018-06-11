package model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Materia;

public class AlunoNotasDAO {
	private Connection conn; //não pode ter getters ou setters
			
	public AlunoNotasDAO() throws SQLException{
		//construtor abre a conexão
		conn = ConnectionFactory.getConection();
	}
	
	//SQLException, pode não achar banco, pode estar ocupada etc
	public void deleteAlunoNotas() throws SQLException{
		String sql = "DROP TABLE AlunoNota";
		//parse do comando SQL
		PreparedStatement ps = conn.prepareStatement(sql);
		// execute não retorna resultado, executeQuery(usado em SELECT) retorna
		ps.execute();
	}
	
	//create table	
	public void createAlunoNotas() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS AlunoNota ( "
					+ "id serial CONSTRAINT key PRIMARY KEY,"
					+ "id_aluno     int REFERENCES Aluno(id), "
					+ "id_materia   int REFERENCES Materia(id), "
					+ "nota int );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void deletarNotasAluno(int id) throws SQLException{
		String sql = "DELETE from AlunoNota WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();						
	}
	
	public void alterarNota(int id_aluno, int nota, int id_materia) throws SQLException{
		String sql = "UPDATE AlunoNota SET nota=? WHERE id_aluno=? and id_materia=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, nota);
		ps.setInt(2, id_aluno);
		ps.setInt(3, id_materia);
		ps.execute();						
	}
	
	//select
	public void listar(int id_aluno) throws SQLException{
		String sql = "SELECT a.*,b.nome as Materia FROM AlunoNota a join Materia b on a.id_materia=b.id where id_aluno=?;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ps.setInt(1, id_aluno);
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Matéria: ");
			System.out.println(rs.getObject("Materia"));
			System.out.print("Nota: ");
			if(rs.getObject("nota").equals(0)) {
				System.out.println("Matéria não cursada");
			}
			else
			System.out.println(rs.getObject("nota"));
			System.out.println();
		}
		ps.execute();
	}
	
	public void listarSemestre(int id_aluno, int semestre) throws SQLException{
		String sql = "SELECT a.*,b.nome as Materia, b.semestre FROM AlunoNota a join Materia b on a.id_materia=b.id  where id_aluno=? and b.semestre=?;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ps.setInt(1, id_aluno);
		ps.setInt(2, semestre);
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Matéria: ");
			System.out.println(rs.getObject("Materia"));
			System.out.print("Nota: ");
			System.out.println(rs.getObject("nota"));
			System.out.println();
		}
		ps.execute();
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}
	
	public void insert(int id_aluno, int id_materia) throws SQLException{
		String sql = "INSERT INTO AlunoNota (id_aluno, id_materia, nota) VALUES (?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		//setString para varchar; setInt para int, etc
		ps.setInt(1, id_aluno); 
		ps.setInt(2, id_materia);
		ps.setInt(3, 0);
		ps.execute();
	}
	
	public void setNotas(int id_aluno, int nota, int id_materia) throws SQLException{
		String sql = "UPDATE AlunoNota SET nota=? WHERE id_aluno=? and id_materia=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(2, id_aluno);
		ps.setInt(1, nota);
		ps.setInt(3, id_materia);
		ps.execute();						
	}
	
	public void alunosMatriculadosNaMateria(int id_materia, int id_professor) throws SQLException {
		String sql = "SELECT a.*,b.id_professor, c.nome as nomealuno FROM AlunoNota a join Materia b on a.id_materia=b.id join Aluno c on a.id_aluno=c.id where b.id_professor=? and id_materia=?;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id_professor);
		ps.setInt(2, id_materia);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Matrícula : ");
			System.out.println(rs.getObject("id_aluno"));
			System.out.print("Nome : ");
			System.out.println(rs.getObject("nomealuno"));
			System.out.print("Nota atual: ");
			System.out.println(rs.getObject("nota"));
		}
		ps.execute();
	}
	
}
