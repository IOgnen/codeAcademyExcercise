package org.main.studentDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig {

	private static String jdbcURL = "jdbc:postgresql://localhost:5432/students";
	private static String jdbcUsername = "postgres";
	private static String jdbcPassword = "postgres";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return connection;
	}
	
}
