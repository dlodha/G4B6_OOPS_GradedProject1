package com.learning.main;
import com.learning.model.*;
import com.learning.services.ShowDepartmentInfo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment("Admin Department",
                                                    "Complete your documents Submission",
                                                    "Complete by EOD");
		HrDepartment hr = new HrDepartment("Hr Department",
				                           "Fill today’s timesheet and mark your attendance",
				                           "Complete by EOD",
				                           "team Lunch");
		TechDepartment tech = new TechDepartment("Tech Department",
				                                 "Complete coding of module 1",
				                                 "Complete by EOD",
				                                 "core Java");
		

		ShowDepartmentInfo showDeptMsg = new ShowDepartmentInfo();
		showDeptMsg.ShowDepartmentMsg(admin);
		System.out.println("");
		showDeptMsg.ShowDepartmentMsg(hr);
		System.out.println(hr.doActivity() + "\n");
		showDeptMsg.ShowDepartmentMsg(tech);
		System.out.println(tech.getTechStackInformation());
		
	}

}
