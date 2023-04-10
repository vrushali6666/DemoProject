package com.miniproject2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	public void getRegistration() throws SQLException {
		String firstName;
		String lastName;
		String uname;
		String pword;
		String Yourcity;
		String emailaddress;
		String mobile;
		System.out.println("***************************Welcome to Registration************************* ");
		System.out.println("Enter the first name");
		Scanner scanner = new Scanner(System.in);
		String firstname = scanner.next();
		System.out.println("Enter the last name");
		String lastname = scanner.next();
		System.out.println("Enter the username");
		String username = scanner.next();
		System.out.println("Enter the password");
		String password = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the mailId");
		String email = scanner.next();
		System.out.println("Enter the mobile number");
		String mobilephone = scanner.next();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnection();
			preparedStatement = connection.prepareStatement(
					"insert into registration (firstName,lastName,username,password,city,email,mobilephone) values (?,?,?,?,?,?,?)");
			preparedStatement.setString(1, firstname);
			preparedStatement.setString(2, lastname);
			preparedStatement.setString(3, username);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, city);
			preparedStatement.setString(6, email);
			preparedStatement.setString(7, mobilephone);
			int c = preparedStatement.executeUpdate();
			System.out.println("You have successfully registered....." + c);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			preparedStatement.close();
		}
	}
}
