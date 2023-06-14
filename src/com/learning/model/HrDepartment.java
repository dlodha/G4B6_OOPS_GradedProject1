package com.learning.model;

public class HrDepartment extends SuperDepartment{
	private String activity;
	
	public HrDepartment(String name,String todaysWork,String workDeadline,String activity) {
		super(name,todaysWork,workDeadline);
		this.activity= activity;
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
	public String doActivity () {
		return this.activity;
	}
		
}
