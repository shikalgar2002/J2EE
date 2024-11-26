package com.controller;
import com.service.StudentService;
import java.util.Scanner;

public class StudentsController {

	public static void main(String[] args) throws Exception {
		Scanner sc  = new Scanner(System.in);
		StudentService ss = new StudentService();
		System.out.println("Controller..");
		int choice = 0;
		
		while (choice!=5) {
			System.out.println("choose:");
			System.out.println("1. insert");
			System.out.println("2. update");
			System.out.println("3. delete");
			System.out.println("4. fetch");
			System.out.println("5. exit");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				ss.insertData();
				System.out.println("Data inserted!\n");
				break;
			case 2:
				ss.updateData();
				System.out.println("Data updated!\n");
				break;
			case 3:
				ss.deleteData();
				System.out.println("Data deleted!\n");
				break;
			case 4:
				ss.getData();
				break;
			case 5:
				System.out.println("exit!!!\n");
				break;
			default:
				System.out.println("invalid choice!\n");
			}
			
		}
		}
	}


