package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.pessoas.Aluno;
import controller.pessoas.Professor;

public class AlunoDAO {
	static Connection conn;
	
	public AlunoDAO() throws SQLException{
		conn = ConnectionFactory.getConection();
	}

	public void createAluno() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS Aluno ("
					+ "id serial PRIMARY KEY,"
				    + " usuario varchar(10) UNIQUE,"
				    + " senha varchar(10),"
					+ " nome varchar(50),"
				    + " endereço varchar(50),"
					+ " documento int,"
				    + " semestre varchar(10), "
				    + " id_curso integer REFERENCES Curso(id)  ) ;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void insert(Aluno a) throws SQLException{
		String sql = "INSERT INTO Aluno (usuario, senha, nome, endereço, documento, semestre, id_curso)" + " VALUES (?,?,?,?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		//setString para varchar; setInt para int, etc
		ps.setString(1, a.getUsuario()); 
		ps.setString(2, a.getSenha());
		ps.setString(3, a.getNome());
		ps.setString(4, a.getEndereço());
		ps.setInt(5, a.getDocumento());
		ps.setInt(6, a.getSemestre());
		ps.setInt(7, a.getCurso());
		ps.execute();
	}
	
	public static void listar() throws SQLException{
		String sql = "SELECT a.*,b.nome as NomeCurso FROM Aluno a join Curso b on a.id_curso=b.id;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Matrícula: ");
			System.out.println(rs.getObject("id"));
			System.out.print("Nome: ");
			System.out.println(rs.getObject("nome"));
			System.out.print("Curso: ");
			System.out.println(rs.getObject("NomeCurso"));
			System.out.print("Semestre:");
			System.out.println(rs.getObject("semestre"));
		}
		ps.execute();
	}
	
	public Aluno user(String usuario, String senha) throws SQLException{
		String sql = "SELECT * FROM Aluno where usuario=? and senha=?; ";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, usuario);
		ps.setString(2, senha);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery();
			rs.next();
			try {
				return new Aluno(rs.getInt("id"),rs.getString("usuario"),rs.getString("senha"),rs.getString("nome"),rs.getString("endereço"), rs.getInt("documento"),rs.getInt("semestre"), rs.getInt("id_curso"));

			}
			catch(SQLException x) {
				System.out.println("Usuário/Senha inválidos");
				return null;
			}
			
	}
	
	public Aluno user2(String usuario) throws SQLException{
		String sql = "SELECT * FROM Aluno where usuario=?; ";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, usuario);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery();
			rs.next();
			//try {
				return new Aluno(rs.getInt("id"),rs.getString("usuario"),rs.getString("senha"),rs.getString("nome"),rs.getString("endereço"), rs.getInt("documento"),rs.getInt("semestre"), rs.getInt("id_curso"));

			//}
			//catch(SQLException x) {
				//System.out.println("Aluno inválido");
				//return null;
		//	}
			
	}
	
	public void delete(int matricula) throws SQLException{
		String sql = "DELETE from Aluno WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, matricula);
		ps.execute();						
	}
	
	public void alterarSemestre(int semestre, int matricula) throws SQLException{
		String sql = "UPDATE aluno SET semestre=? WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, semestre);
		ps.setInt(2, matricula);
		ps.execute();						
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}
	

}