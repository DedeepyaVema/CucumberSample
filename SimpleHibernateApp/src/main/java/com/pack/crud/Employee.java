package com.pack.crud;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;



@Entity
@Table(name="employeedata")
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

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFName() {
		return empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

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
