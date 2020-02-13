package com.mastek.hrapp.apis;


import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.hrapp.entities.Employee;

 
@Path("/hrapp/")// url pattern to access the current API interface
public interface EmployeeAPI {
	
	
	//http://localhost:7777/hrappp/employees/list
	@GET // we do support http Method: GET
	@Path("/employees/list") //URL path to access this method
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats whuch the method supports
	public Iterable<Employee> listAllEmployees();
	

	@GET //http method
	@Path("/employees/find/{empno}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public Employee findByEmpno(@PathParam("empno") int empno);
	
	@POST // http method Post used to send data in requests
	@Path("/employees/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee registerNewEmployee(@BeanParam Employee newEmployee);
	
}
