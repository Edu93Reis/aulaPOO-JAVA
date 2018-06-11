package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/db_escola", //ip//porta//nomebanco
				"felipe", //user
				"felipe"); //senha
	}

}
