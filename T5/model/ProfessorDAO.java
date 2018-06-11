package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.pessoas.Aluno;
import controller.pessoas.Professor;

public class ProfessorDAO {
	static Connection conn;
	
	public ProfessorDAO() throws SQLException{
		conn = ConnectionFactory.getConection();
	}

	public void createProfessor() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS Professor ("
					+ "id serial PRIMARY KEY,"
				    + " usuario varchar(10) UNIQUE,"
				    + " senha varchar(10),"
					+ " nome varchar(50),"
				    + " endereço varchar(50),"
					+ " documento int);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void insert(Professor p) throws SQLException{
		String sql = "INSERT INTO Professor (usuario, senha, nome, endereço, documento)" + " VALUES (?,?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		//setString para varchar; setInt para int, etc
		ps.setString(1, p.getUsuario()); 
		ps.setString(2, p.getSenha());
		ps.setString(3, p.getNome());
		ps.setString(4, p.getEndereço());
		ps.setInt(5, p.getDocumento());
		ps.execute();
	}
	
	public static void listar() throws SQLException{
		String sql = "SELECT * FROM Professor;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.print("Matrícula: ");
			System.out.println(rs.getObject("id"));
			System.out.print("Nome: ");
			System.out.println(rs.getObject("nome"));
			System.out.println();
		}
		ps.execute();
	}
	
	public Professor user(String usuario, String senha) throws SQLException{
		String sql = "SELECT * FROM Professor where usuario=? and senha=?; ";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, usuario);
		ps.setString(2, senha);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery();
		rs.next();
		try {
			return new Professor(rs.getInt("id"),rs.getString("usuario"),rs.getString("senha"),rs.getString("nome"),rs.getString("endereço"), rs.getInt("documento"));
		}
		catch(SQLException x) {
			System.out.println("Usuário/Senha inválidos");
			return null;
		}
			
	}
	
	public int returnUser(String usuario) throws SQLException{
		String sql = "SELECT * FROM Professor where usuario=?; ";						
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, usuario);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery();
			rs.next();
			try {
				return rs.getInt("id");

			}
			catch(SQLException x) {
				System.out.println("Usuário inválido");
				return 0;
			}
			
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}

}