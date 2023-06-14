package com.learning.services;

import com.learning.model.*;

public class ShowDepartmentInfo {
    public void ShowDepartmentMsg (SuperDepartment dept) {
    	System.out.println("Welcome to "+ dept.departmentName());
    	System.out.println(dept.getTodaysWork());
    	System.out.println(dept.getWorkDeadline());
    	System.out.println(dept.isTodayAHoliday());
    }
}
