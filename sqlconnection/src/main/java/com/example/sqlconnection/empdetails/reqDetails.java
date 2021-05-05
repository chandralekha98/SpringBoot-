package com.example.sqlconnection.empdetails;

import com.example.sqlconnection.model.Dept;

public class reqDetails {

	private Dept dept;
	
	public reqDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public reqDetails(Dept dept) {
		super();
		this.dept = dept;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "reqDetails [dept=" + dept + "]";
	}
	
	
}
