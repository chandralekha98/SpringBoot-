package com.example.sqlconnection.empdetails;

import com.example.sqlconnection.model.Emp;

public class resDetails {
 
	private long salary;

	public resDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public resDetails(long salary) {
		super();
		this.salary = salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "resDetails [salary=" + salary + "]";
	}
	
	
	
}
