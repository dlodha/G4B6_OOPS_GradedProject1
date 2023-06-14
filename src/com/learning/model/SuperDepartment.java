package com.learning.model;

import com.learning.interfaces.IDepartment;

public class SuperDepartment implements IDepartment {
	protected String departmentName;
	protected String todaysWork;
	protected String workDeadline;
	private String holiday = "Today is not a holiday";
	
	public SuperDepartment() {}
	public SuperDepartment(String departmentName,String todaysWork,String workDeadline) {
		this.departmentName= departmentName;
		this.todaysWork= todaysWork;
		this.workDeadline= workDeadline;
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
	public String isTodayAHoliday() {
		 return this.holiday;
	}
}
