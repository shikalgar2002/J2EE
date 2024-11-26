package com.service;
import com.dao.StudentsDao;
public class StudentService {

	public void insertData() throws Exception{
		StudentsDao sd = new StudentsDao();
		System.out.println("service..");
		sd.insertData();
		
	}
	
	public void updateData() throws Exception{
		StudentsDao sd = new StudentsDao();
		System.out.println("service..");
		sd.updateData();
		
	}
	
	public void deleteData() throws Exception{
		StudentsDao sd = new StudentsDao();
		System.out.println("service..");
		sd.deleteData();
		
	}
	
	public void getData() throws Exception{
		StudentsDao sd = new StudentsDao();
		System.out.println("service..");
		sd.getData();
		
	}
}
