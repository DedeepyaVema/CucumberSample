package com.pack.xmlops;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@Entity
@Table(name="employeedata")
@XmlRootElement(name="employee")
public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="empId")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	
	@Column(name="EmpFirstName")
	private String empFName;
	
	@Column(name="EmpLastName")
	private String empLName;
	
	@Column(name="PrimaryTechnology")
	private String technology;
	
	@Column(name="ExpInYears")
	private float experience;

	@XmlElement(name="id")	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@XmlElement(name="firstname")	
	public String getEmpFName() {
		return empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	@XmlElement(name="lastName")	
	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	@XmlElement(name="technology")	
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@XmlElement(name="experience")	
	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	
	@Override
	public String toString() {
		return "Employee details: [empId=" + empId + ", empFName=" + empFName + ", empLName=" + empLName + ", technology="
				+ technology + ", experience=" + experience + "]";
	}

}
