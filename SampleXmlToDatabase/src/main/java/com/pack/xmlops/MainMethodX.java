package com.pack.xmlops;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pack.xmlops.DatabaseOperations;
import com.pack.xmlops.Employee;

public class MainMethodX {

	public static void main(String[] args) {
		System.out.println("Started....");
		File xmlFile=new File("D:\\Employee.xml");
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(Employee.class);             
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
		     
		   // System.out.println(employee);
		    DatabaseOperations.addGivenEmployee(employee);
		}
		catch (JAXBException e)
		{
		    e.printStackTrace();
		}
	}

}
