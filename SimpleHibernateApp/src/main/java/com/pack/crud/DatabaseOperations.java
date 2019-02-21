package com.pack.crud;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DatabaseOperations {

	static Session sessionObject;
	static SessionFactory sessionFactoryObject;
	
	public final static Logger logger=Logger.getLogger(DatabaseOperations.class);
	
	public static SessionFactory createSessionFactory() {
		Configuration configurationObject=new Configuration();
		configurationObject.configure("hibernate.cfg.xml");
		configurationObject.addAnnotatedClass(com.pack.crud.Employee.class);
		ServiceRegistry serviceRegistryObject= new StandardServiceRegistryBuilder().applySettings(configurationObject.getProperties()).build();
		sessionFactoryObject=configurationObject.buildSessionFactory(serviceRegistryObject);
		return sessionFactoryObject;
	}
	
	public static void addNewEmployee() {
		int count=0;
		Employee empObject=null;
		try {
			System.out.println("Inside addEmployee");
			sessionObject=createSessionFactory().openSession();
			System.out.println("Inside addEmployee---->> 2");
			sessionObject.beginTransaction();
			//for(int i=3000;i<=3005; i++) {
				//count++;
				empObject= new Employee();
				//empObject.setEmpId(3001);
				empObject.setEmpFName("Deepali");
				empObject.setEmpLName("Singh");
				empObject.setTechnology("Java");
				empObject.setExperience(3.04f);
				sessionObject.save(empObject);
				//}
				
				sessionObject.getTransaction().commit();
				logger.info("Successfully created employee data record");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println();
			if(null != sessionObject.getTransaction()) {
                logger.info("Transaction rolled back");
                sessionObject.getTransaction().rollback();
		}
	}
	
	}
	
	public static List<Employee> viewEmployees() {
		List employeeList=new ArrayList();
		try {
			
			sessionObject=createSessionFactory().openSession();
			sessionObject.beginTransaction();
			employeeList=sessionObject.createQuery("select emp from EmployeeData emp").list();
			
		}catch(Exception e) {
			if(null != sessionObject.getTransaction()) {
                logger.info("Transaction rolled back");
                sessionObject.getTransaction().rollback();
			}
		}
		
		return employeeList;
	}
	
	public static void updateEmployee(int empId) {
		try {
		sessionObject=createSessionFactory().openSession();
		sessionObject.beginTransaction();
		Employee newEmp=sessionObject.get(Employee.class, empId);
		newEmp.setExperience(10.9f);
		newEmp.setTechnology("Java, Spring & Hibernate");
		sessionObject.getTransaction().commit();
		logger.info("updated employee successfully");
		}catch(Exception e) {
			
			if(null != sessionObject.getTransaction()) {
                logger.info("Transaction rolled back");
                sessionObject.getTransaction().rollback();
			}
		}	
	}
	
	
	public static void deleteEmployee(int empId) {
		try {
		sessionObject=createSessionFactory().openSession();
		sessionObject.beginTransaction();
		Employee employee= sessionObject.load(Employee.class, empId);
		sessionObject.delete(employee);
		sessionObject.getTransaction().commit();
		logger.info("Successfully deleted the student");
		}catch(Exception e) {
			
			if(null != sessionObject.getTransaction()) {
                logger.info("Transaction rolled back");
                sessionObject.getTransaction().rollback();
			}
		}
	}
	

	}
