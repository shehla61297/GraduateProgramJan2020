package com.mastek.training.hrapp.dao;

import java.util.Collection;

import com.mastek.training.hrapp.Employee;

public interface DataAccessObject<D> {
	
	public D add(D newD);
	public Collection<Employee> listAll();
	public D find(int key);
	public D remove(int key);

}
