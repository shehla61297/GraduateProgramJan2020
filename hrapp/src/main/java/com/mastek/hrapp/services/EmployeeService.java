package com.mastek.hrapp.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.hrapp.apis.EmployeeAPI;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.entities.Employee;

@Component //marking the class as bean to be created 
@Scope("singleton") //singleton: One object used across test cases, prototype: one object per request
public class EmployeeService implements EmployeeAPI{
	
	@Autowired
	EmployeeJPADAO empDAO;
	String exampleProperty;
	
	public EmployeeService() {
	System.out.println("Employee Service Created");
	}
	
	@PostConstruct // Initialization methods of the class
	public void initializeService() {
		System.out.println("Employee Service Initialized");
	}
	@PreDestroy //calls before the shutting down the application
	public void terminateService() {
		System.out.println("Employee Service Terminated");
	}
	public void exampleMethod() {
		System.out.println("Connect to "+getExampleProperty()+" for business data");
	}
	public String getExampleProperty() {
		return exampleProperty;
	}
	@Value("Spring Example Data Source")// initialize the property with the simple value 
	public void setExampleProperty(String exampleProperty) {
		System.out.println("Example Property Set: "+exampleProperty);
		this.exampleProperty = exampleProperty;
	}

	@Override
	public Iterable<Employee> listAllEmployees() {
		System.out.println("Listing all Employees");
		return empDAO.findAll();
	}

	@Override
	public Employee findByEmpno(int empno) {
		return empDAO.findById(empno).get();
	}

	@Override
	public Employee registerNewEmployee(Employee newEmployee) {
		newEmployee = empDAO.save(newEmployee);
		return newEmployee;
	}
}