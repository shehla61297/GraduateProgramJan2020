//location of the java class in the project structure
package com.mastek.training.hrapp;

import java.io.Serializable;
import java.io.StringReader;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;

import org.bson.Document;



//final keyword at class level
//if class is declared as final, we cannot subclass/inherit/extend the class
public class Employee implements Serializable{
					//Serializable as marker interface to manage serialization
					//using ObjectOutput/InputStream classes 

	private int empno;
	private String name;
	private double unitDaySalary;
	private Designations designation;
	private transient Grades grade; //transient keyword will denote the serializer to skip this 
									//field while storing using binary files.
	
	public static final int MAX_PAID_DAYS=90;
	public static final int MIN_DAY_RATE=10;
	public static final int MAX_DAY_RATE=999999;
	public static final int DEFAULT_ZERO=0;
	public static final int MAX_EMPNO=999999;
	
	//blocks
	//static Block: executes at classloading time for each class
	
	static {//we use static block to initialize all the static members of the class
		System.out.println("Employee static block called");
	}
	//instance Block: executed before the constructor is called for any object of the class 
	//we use the instance block to initialize the default value
	{
		setEmpno(999);
		setName("Example");
		setUnitDaySalary(MIN_DAY_RATE);
		setDesignation(Designations.OTHER);
		System.out.println("Employee Instance Block Called");
	}
	//default constructor: a class constructor without any arguments
	//constructor is a method which helps developer to create a usuable object for simulations
	//public <ClassName>
	//Method/constructor OverLoading: We define same method/constructor 
	//with different number/type of parameter to allow multiple forms of the same method
	
	public Employee() {
		System.out.println("Employee Default Constructor Called");
		
		System.out.println(
		"eno"+getEmpno()+",Name"+getName()+ ",day-Salary"+getUnitDaySalary()+",designation:"+getDesignation());
	}
	
	public Employee (int empno) {
		this.setEmpno(empno);
System.out.println("Employee Default Constructor Called with Empno");
		
		System.out.println(
		"eno"+getEmpno()+",Name"+getName()+ ",day-Salary"+getUnitDaySalary()+",designation:"+getDesignation());
		
	}
public Employee(int empno, String name, double unitDaySalary, Designations designation) {
	this.setEmpno(empno);
	this.setName(name);
	this.setUnitDaySalary(unitDaySalary);
	this.setDesignation(designation);
	System.out.println("Employee Master Constructor Called");
	
	System.out.println(
	"eno"+getEmpno()+",Name"+getName()+ ",day-Salary"+getUnitDaySalary()+",designation:"+getDesignation());
	
}
//this is an internal method called by the Garbage Collector before deleting the object
//you can notify to collect the garbage using System.gc();
public void finalize() {
	setEmpno(1002);
	setName("remove");
	setUnitDaySalary(233);
	setDesignation(Designations.DEVELOPER);
	setGrade(Grades.G6);
	System.out.println("Employee Object Finalized");
	

}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		if(empno>DEFAULT_ZERO && empno < 999999) {
		this.empno = empno;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitDaySalary() {
		return unitDaySalary;
	}
	public void setUnitDaySalary(double unitDaySalary) {
		if(unitDaySalary >MIN_DAY_RATE && unitDaySalary<MAX_DAY_RATE) {
			this.unitDaySalary = unitDaySalary;
		}
	}
	public Designations getDesignation() {
		return designation;
	}
	public void setDesignation(Designations designation) {
		this.designation = designation;
	}
	public Grades getGrade() {
		return grade;
	}
	public void setGrade(Grades grade) {
		this.grade = grade;
	}
	//final keyword on methods 
	//final method  cannot be overridden in the the derived class
	public double getNetSalary(int NoOfDays) throws Exception {
		if(NoOfDays<DEFAULT_ZERO) {
			//raise an exception on business conditions
			throw new Exception("Invalid Input for Days:"+NoOfDays);
			//throw new RuntimeException("Invalid Input for Days: "+NoOfDays);
			//raise an unchecked exception on business conditions
		}
		if(NoOfDays<DEFAULT_ZERO || NoOfDays>MAX_PAID_DAYS) {
			NoOfDays=DEFAULT_ZERO;
		}
		return getUnitDaySalary()*NoOfDays;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", unitDaySalary=" + unitDaySalary + ", designation="
				+ designation + ", grade=" + grade + "]";
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
	
	public static String getJSONString(Employee emp) {
		JsonObjectBuilder jsonBuilder = new JsonObjectBuilder();
		jsonBuilder.add("empno", emp.getEmpno());
		jsonBuilder.add("name", emp.getName());
		jsonBuilder.add("day-salary", emp.getUnitDaySalary());
		jsonBuilder.add("designation", emp.getDesignation().toString());
		jsonBuilder.add("grade", emp.getGrade().toString());
		
		String jsonEmp = jsonBuilder.build().toString();
		System.out.println(jsonEmp);
		return jsonEmp;
		
		
		
	}
	
	public static Employee parseJSONString(String empJSON) {
		JsonReader reader = new JsonReader(new StringReader(empJSON));
		JsonObject empJSONObject = reader.readObject();
		
		Employee emp = new Employee();
		emp.setEmpno(empJSONObject.getIntValue("empno"));
		emp.setName(empJSONObject.getStringValue("name"));
		emp.setUnitDaySalary(empJSONObject.getIntValue("day-salary"));
		emp.setGrade(Grades.valueOf(empJSONObject.getStringValue("grade")));
		emp.setDesignation(Designations.valueOf(empJSONObject.getStringValue("designation")));
		
		System.out.println("From JSoN: "+empJSON);
		System.out.println("To Emp:"+emp);
		
		reader.close();
		return emp;
	}
	public static Document getEmployeeMongoDocument(Employee emp) {
		Document docEmp = new Document();
		docEmp.put("empno", emp.getEmpno());
		docEmp.put("name", emp.getName());
		docEmp.put("day-salary", emp.getUnitDaySalary());
		docEmp.put("grade",	emp.getGrade().toString());
		docEmp.put("designation", emp.getDesignation().toString());
		
		return docEmp;
		
	}
	
	public static Employee getEmployeeFromMongoDocument(Document empDoc) {
		Employee emp = new Employee();
		try {
			emp.setEmpno(empDoc.getInteger("empno"));
			emp.setName(empDoc.getString("name"));
			emp.setUnitDaySalary(empDoc.getDouble("day-salary"));
			emp.setGrade(Grades.valueOf(empDoc.getString("grade")));
			emp.setDesignation(Designations.valueOf(empDoc.getString("designation")));
		}
		catch(Exception ex) {
			emp=null;
		}
		return emp;
	}


	
	}

	
	
	
	


