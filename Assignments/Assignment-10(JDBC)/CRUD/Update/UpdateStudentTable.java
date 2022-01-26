// package com.gces.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudentTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter id of the user to be edited:");
		int id = scan.nextInt();

		System.out.println("Enter name");
		String name = scan.next();

		System.out.println("Enter address");
		String address = scan.next();

		System.out.println("Enter roll");
		int roll = scan.nextInt();

		scan.close();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

		String query = "UPDATE student SET `name` = ?, `address` = ?, `roll` = ?) WHERE `student`.`id` = ?";

		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setString(2, address);
		st.setInt(3, roll);
		st.setInt(4, id);

		int rows = st.executeUpdate(query);

		System.out.println("Number of rows affected =" + rows);

		con.close();
	}
}
