package com.controller;

import java.util.Scanner;

import com.service.EmployeesService;

public class EmployeesController {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		EmployeesService es = new EmployeesService();
		System.out.println("Employee Controller!");
		int choice = 0;

		
			while (choice != 5) {

				System.out.println("choose:");
				System.out.println("1. insert");
				System.out.println("2. update");
				System.out.println("3. delete");
				System.out.println("4. fetch");
				System.out.println("5. exit");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					es.inserData();
					System.out.println("Data inserted!\n");
					break;
				case 2:
					es.updateData();
					System.out.println("Data updated!\n");
					break;
				case 3:
					es.deleteData();
					System.out.println("Data deleted!\n");
					break;
				case 4:
					es.getData();
					break;
				case 5:
					System.out.println("Exit!");
					break;
				default:
					System.out.println("Invalid!\n");
				}
				
				
			}
		} 
	}


