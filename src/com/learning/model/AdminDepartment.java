package com.learning.model;

public class AdminDepartment extends SuperDepartment{
	
	public AdminDepartment(String name,String todaysWork,String workDeadline) {
		super(name,todaysWork,workDeadline);
	}
		
	public String departmentName() {
		return this.departmentName;
	}
	public String getTodaysWork () {
		return this.todaysWork;
	}
	public String getWorkDeadline () {
		return this.workDeadline;
	}	
}
