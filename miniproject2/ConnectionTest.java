package com.miniproject2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "Test@1234");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
