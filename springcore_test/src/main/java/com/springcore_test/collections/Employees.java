package com.springcore_test.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
	private String empName;
	//for multiple employee's phone numbers
	private List<String> empPhoneNumbers;
	//for multiple employee's address
	private Set<String> empAddresses;
	//how many courses employee completes
	//<courseName, courseDuration>
	private Map<String, String> empCourses;
	//properties
	private Properties props;
	
	//getters and setters
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhoneNumbers() {
		return empPhoneNumbers;
	}
	public void setEmpPhoneNumbers(List<String> empPhoneNumbers) {
		this.empPhoneNumbers = empPhoneNumbers;
	}
	public Set<String> getEmpAddresses() {
		return empAddresses;
	}
	public void setEmpAddresses(Set<String> empAddresses) {
		this.empAddresses = empAddresses;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
	//parameterized constructor
	
	
	//parameterized constructor
	public Employees(String empName, List<String> empPhoneNumbers, Set<String> empAddresses,
			Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empPhoneNumbers = empPhoneNumbers;
		this.empAddresses = empAddresses;
		this.empCourses = empCourses;
	}
	public Employees(String empName, List<String> empPhoneNumbers, Set<String> empAddresses,
			Map<String, String> empCourses, Properties props) {
		super();
		this.empName = empName;
		this.empPhoneNumbers = empPhoneNumbers;
		this.empAddresses = empAddresses;
		this.empCourses = empCourses;
		this.props = props;
	}
	//default constructor
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
