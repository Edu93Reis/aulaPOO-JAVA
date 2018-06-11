package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Curso;
import controller.pessoas.Aluno;
import controller.pessoas.Professor;

public class CursoDAO {
	static Connection conn;
	
	public CursoDAO() throws SQLException{
		conn = ConnectionFactory.getConection();
	}

	public void createCurso() throws SQLException{
		String sql = "CREATE TABLE IF NOT EXISTS Curso ("
					+ "id serial PRIMARY KEY,"
				    + "nome varchar UNIQUE);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
	
	public void insert(Curso c) throws SQLException{
		String sql = "INSERT INTO Curso (nome)" + " VALUES (?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		//setString para varchar; setInt para int, etc
		ps.setString(1, c.getNome()); 
		ps.execute();
	}
	
	public static void listar() throws SQLException{
		String sql = "SELECT * FROM Curso;";						
		PreparedStatement ps = conn.prepareStatement(sql);
		//sempre que for select usar executeQuery() --> faz a execução para salvar no rs
		ResultSet rs = ps.executeQuery(); 
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("nome"));
		}
		ps.execute();
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}
}