package com.mastek.hrapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //declares the entity ti ve transformed to XML/JSON
@Entity //declares the class as entity, to be managed by JPA
@Table(name="JPA_Employees") //declare the table name associated with this class
public class Employee {
	
	int empno;
	
	@FormParam("name")
	String name;
	
	@FormParam("salary")
	double salary;
	
	@FormParam("designation")
	Designation designation;
	
	public Employee() {
		
	}
	
	@Id //marking the property as primary key 
	@Column(name="employee_number") //using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO) //Auto Numbering configuration as per DB
	public int getEmpno() {
		return empno;
	}



	public void setEmpno(int empno) {
		this.empno = empno;
	}


	@Column(name="employee_name",length=50,nullable=false)
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	@Enumerated(EnumType.STRING)
	public Designation getDesignation() {
		return designation;
	}



	public void setDesignation(Designation designation) {
		this.designation = designation;
	}



	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		return true;
	}
	
}
// @Transient : to mark the property get method not to be stored in DB table.
	
