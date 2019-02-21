package com.pack.crud;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Started....");
		DatabaseOperations.addNewEmployee();
		
			List<Employee> employees=	DatabaseOperations.viewEmployees();
	for(Employee employee:employees) {
		System.out.println(employee.toString());
	}
	DatabaseOperations.updateEmployee(3001);
	//DatabaseOperations.deleteEmployee(3001);
System.exit(0);
	}

}
