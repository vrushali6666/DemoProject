package com.miniproject2;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) throws SQLException {
		System.out.println("*******Welcome to E-Commerce Based Application*******");
		System.out.println("1. User Registration");
		System.out.println("2. User Login");
		System.out.println("Enter Your Choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			Registration registration = new Registration();
			registration.getRegistration();
		} else if (choice == 2) {
			Login login = new Login();
			login.getLogin();
		} 
	}
}
