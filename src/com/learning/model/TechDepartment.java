package com.learning.model;

public class TechDepartment extends SuperDepartment {
	private String techStackInformation;
	
	public TechDepartment(String name,String todaysWork,String workDeadline,String techStackInformation) {
		super(name,todaysWork,workDeadline);
		this.techStackInformation= techStackInformation;
		
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
	public String getTechStackInformation () {
		return this.techStackInformation;
	}

}
