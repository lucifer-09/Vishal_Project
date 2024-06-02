package com.vishal.service;
import com.vishal.dao.EmployeeDao;
import com.vishal.model.Employee;

public class EmployeeService {
	
	private EmployeeDao dao = new EmployeeDao();
	public boolean saveEmployee(Employee employee){
		
		System.out.println(employee);
		
		boolean ans = verifyEmployee(employee);
			if(ans) {
				dao.saveEmployee(employee);
			}
			return false;
		}
	
	private boolean verifyEmployee(Employee employee) {
		String pattern = "[a-zA-Z]{1,20}";
		String empName = employee.getEmpName();
		if(empName.matches(pattern)) {
			return true;
		}
		return false;
	}
	public Employee[] getAllEmployees() {
		
		return dao.getAllEmployees();
	}
	
	
	public Employee findEmployeeById(int id) {
	    return dao.findEmployeeById(id);
	}

	public boolean removeEmployeeById(int id) {
	    return dao.removeEmployeeById(id);
	}

	
}

//package com.vishal.service;
//
//import com.vishal.dao.EmployeeDao;
//import com.vishal.model.Employee; // Importing Employee class
//
//public class EmployeeService {
//	
//	private EmployeeDao dao = new EmployeeDao();
//	
//	public boolean saveEmployee(Employee employee) {
//		System.out.println(employee);
//		boolean ans = verifyEmployee(employee);
//		if (ans) {
//			dao.saveEmployee(employee);
//			return true; // Return true if employee is saved successfully
//		}
//		return false; // Return false if employee verification fails
//	}
//	
//	private boolean verifyEmployee(Employee employee) {
//		String pattern = "[a-zA-Z]{1,20}";
//		String empName = employee.getEmpName();
//		if (empName.matches(pattern)) {
//			return true; // Employee name matches the pattern
//		}
//		return false; // Employee name does not match the pattern
//	}
//	
//	public Employee[] getAllEmployees() {
//		return dao.getAllEmployees();
//	}
//}
