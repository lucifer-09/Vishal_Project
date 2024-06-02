package com.vishal.view;

import java.util.Scanner;

import com.vishal.model.Employee;
import com.vishal.service.EmployeeService;
import com.vishal.service.employeeServices;

public class EmployeeView {
	
	private Scanner scanner = new Scanner(System.in);
	private EmployeeService employeeService = new EmployeeService();
	public EmployeeView() {
		mainOptions();
	}

	private void mainOptions() {
		System.out.println("Employee Management System");
		System.out.println("1.Add Employee");
		System.out.println("2.Show AllEmployees");
		System.out.println("3.Search Employee");
		System.out.println("4.Remove Employee");
		System.out.println("Enter Choice=");
		int choice = scanner.nextInt();
		doChoice(choice);
	}

	private void doChoice(int choice) {
		switch(choice) {
		case 1:{
			addEmployee();     //to add the employee 
			mainOptions();
		}
		case 2:{
			getAllEmployees();   // show all the employees added in the array
			mainOptions();
		}
		case 3: {
			findEmployeeById(choice);
		    mainOptions();
		    break;
		}
		case 4: {
		   
		    mainOptions();
		    break;
		}

//		case 3:{
//		
//			findEmployeeById();
//			mainOptions();
//		}
//		case 4:{
//			removeEmployee();
//			mainOptions();
//		}
		case 5:{
			System.out.println("Thank you for using visit again....");
	        System.exit(0);	
		}
		default:{
			System.out.println("Wrong input !! Enter the number again.");
		}
		}
		
		
	}
	
	

//	private boolean removeEmployeeById(int removeId) {
//
//		return false;
//	}

	private Employee findEmployeeById(int searchId) {
		System.out.println("Enter Employee ID to search:");
	    int searchId1 = scanner.nextInt();
	    Employee foundEmployee = findEmployeeById(searchId1);
	    if (foundEmployee != null) {
	        System.out.println("Employee found: " + foundEmployee);
	    } else {
	        System.out.println("Employee not found with ID: " + searchId1);
	    }
		return null;
	}

	private void getAllEmployees() {
		Employee employees[] = employeeService.getAllEmployees();
		for(Employee e: employees) {
			if(e!=null) {
				System.out.println(e);
			}
		}
		
	}
	private void addEmployee() {
		
		boolean flag = true;
		do {
			System.out.println("***Employee Entry Section***");
			System.out.println("Create an ID");
			int id = scanner.nextInt();
			
			System.out.println("Enter the Employee Name");
			scanner.nextLine();
			
			String EmpName = scanner.nextLine();
			
			System.out.println(id+":"+EmpName);
			Employee employee = new Employee(id,EmpName);
			
			employeeService.saveEmployee(employee);
			
			System.out.println("Do you want to Add More  y/n");
			String ans = scanner.next();
			if(ans.equalsIgnoreCase("Y")) {
				
			}
			else {
				flag =false;
			}
		}while(flag);	
		
	}
	
	
	
}
