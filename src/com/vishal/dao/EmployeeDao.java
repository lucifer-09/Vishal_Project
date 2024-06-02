package com.vishal.dao;

import com.vishal.model.Employee;

public class EmployeeDao {
	
	private static Employee employees[]= new Employee[50];
	static {
		employees[0] = new Employee(11,"vishal");
		employees[1] = new Employee(12,"Rushikesh");
		employees[2] = new Employee(13,"Yash");
		employees[3] = new Employee(14,"Samiksha");
	}
	
	public boolean saveEmployee(Employee employee) {
		
			employees[4] = employee;
			
			return false;
		
		
	}
	
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	
	public Employee findEmployeeById(int id) {
	    for (Employee employee : employees) {
	        if (employee != null && employee.getId() == id) {
	            return employee;
	        }
	    }
	    return null; // Employee not found
	}

	public boolean removeEmployeeById(int id) {
	    for (int i = 0; i < employees.length; i++) {
	        if (employees[i] != null && employees[i].getId() == id) {
	            employees[i] = null; // Delete the employee
	            return true; // Employee removed successfully
	        }
	    }
	    return false; // Employee not found
	}

	

	
	
}
