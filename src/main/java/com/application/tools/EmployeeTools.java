package com.application.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTools {

    @Tool(description = "Get the employee's remaining leave balance using employee ID")
    public String checkLeaveBalance(String employeeId) {

        System.out.println(
                "Executing checkLeaveBalance for: " + employeeId
        );

        if ("EMP001".equalsIgnoreCase(employeeId)) {
            return "EMP001 has 12 leaves remaining.";
        }

        if ("EMP002".equalsIgnoreCase(employeeId)) {
            return "EMP002 has 8 leaves remaining.";
        }

        return employeeId + " has 5 leaves remaining.";
    }

    @Tool(description = "Get the employee's name using employee ID")
    public String getEmployeeName(String employeeId) {

        System.out.println(
                "Executing getEmployeeName for: " + employeeId
        );

        if ("EMP001".equalsIgnoreCase(employeeId)) {
            return "EMP001 belongs to Basavaraj.";
        }

        if ("EMP002".equalsIgnoreCase(employeeId)) {
            return "EMP002 belongs to Arun.";
        }

        return "Employee name is Unknown.";
    }

    @Tool(description = "Get the employee's department using employee ID")
    public String getEmployeeDepartment(String employeeId) {

        System.out.println(
                "Executing getEmployeeDepartment for: " + employeeId
        );

        if ("EMP001".equalsIgnoreCase(employeeId)) {
            return "EMP001 works in the Engineering department.";
        }

        if ("EMP002".equalsIgnoreCase(employeeId)) {
            return "EMP002 works in the Finance department.";
        }

        return "Department is Unknown.";
    }
}
