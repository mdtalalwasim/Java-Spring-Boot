package com.springcore.constructorinjection;

public class Person {
	
	private String name;
	private int personId;
	private String personPhone;
	private int personAge;
	private Certificate certi;
	
	public Person(String name, int pid) {
		this.name = name;
		this.personId = pid;
		
	}
	
	

	public Person(String name, int personId, String personPhone, int personAge, Certificate certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.personPhone = personPhone;
		this.personAge = personAge;
		this.certi=certi;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", personPhone=" + personPhone + ", personAge="
				+ personAge + ", certificateName="+this.certi.name+ "]";
	}



	/*
	 * @Override public String toString() { return "Person [name=" + name +
	 * ", personId=" + personId + "]"; }
	 */
	
	
	
	

}
