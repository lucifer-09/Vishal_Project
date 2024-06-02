package com.vishal.model;

public class Employee {
	
	private int id;
    private String EmpName;
    
    public Employee() {
		
	}
    
    public Employee(int id, String EmpName) {
    	super();
    	this.id = id;
    	this.EmpName= EmpName;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", empName=" + EmpName + "]";
	}
    

}
