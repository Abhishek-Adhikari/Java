// package com.gces.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudentTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Choose the user you want to delete: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();  
		scan.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		
		String query = "DELETE FROM student WHERE `student`.`id` = ?";
		PreparedStatement stm = con.prepareStatement(query);
		stm.setInt(1, id);
 
		int rows = stm.executeUpdate();
		System.out.println("Number of rows affected = " + rows);
		con.close();
	}
}
