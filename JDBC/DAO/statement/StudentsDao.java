package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsDao {

	
	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "Salman@2002");
		
		Statement stmt =c.createStatement();
		stmt.executeUpdate("insert into students (name,age)values('Ruturaj',23);");
	}
	
	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "Salman@2002");
		
		Statement stmt =c.createStatement();
		stmt.executeUpdate("update students set name = 'rutu' where name = 'Ruturaj';");
//		c.close();
		
	}
	
	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "Salman@2002");
		
		Statement stmt =c.createStatement();
		stmt.executeUpdate("delete from  students where name = 'salman';");
//		c.close();
	}
	
	public void getData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk197?useSSL = false", "root", "Salman@2002");
		
		Statement stm = c.createStatement();
		ResultSet rs = stm.executeQuery("select * from students");
		while(rs.next()) {
			System.out.println("id: "+rs.getInt(1)+" name: "+rs.getString(2)+" age: "+rs.getInt(3)+"\n");
		}
//		c.close();
	}
}
