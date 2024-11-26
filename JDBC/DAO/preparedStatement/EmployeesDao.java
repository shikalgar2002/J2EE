package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeesDao {
	
	public void insertData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?usessl=false","root","Salman@2002");
		Scanner sc = new Scanner(System.in);
		PreparedStatement stmt = c.prepareStatement("insert into employees (name,salary) values(?,?)");
		System.out.println("Enter the name");
		stmt.setString(1, sc.nextLine());
		System.out.println("Enter salary");
		stmt.setFloat(2, sc.nextFloat());
		stmt.executeUpdate();
	}

	public void updateData() throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl=false", "root", "Salman@2002");

		PreparedStatement stm = c.prepareStatement("update employees set name = ? where name = ?;");
		System.out.println("Enter old name:");
		stm.setString(2, sc.nextLine());
		System.out.println("Enter new name:");
		stm.setString(1, sc.nextLine());
		stm.executeUpdate();
		
	}
	
	public void deleteData() throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "Salman@2002");

		PreparedStatement stm = c.prepareStatement("delete from employees where id = ?;");
		System.out.println("Enter id of employee which you want to remove:");
		stm.setInt(1, sc.nextInt());
		stm.executeUpdate();
	}
	
	public void getData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSl = false", "root", "Salman@2002");

		PreparedStatement stm = c.prepareStatement("select * from employees;");
		ResultSet rs = stm.executeQuery();

		while (rs.next()) {
			System.out.println(
					"id: " + rs.getInt(1) + " name: " + rs.getString(2) + " salary: " + rs.getDouble(3) + "\n");
		}
		
		
	}
	
}
