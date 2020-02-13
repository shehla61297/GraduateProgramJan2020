package com.mastek.hrapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.hrapp.services.EmployeeService;

@SpringBootTest
class HrappApplicationTests {
	
	@Autowired //spring will provide the object using IOC, dependency Injection technique
	EmployeeService empSvc;
	
	@Autowired
	EmployeeService empSvc1;

	@Test
	void testEmployeeServiceExampleMethod() {
		empSvc.exampleMethod();
		empSvc1.exampleMethod();
	}

}
