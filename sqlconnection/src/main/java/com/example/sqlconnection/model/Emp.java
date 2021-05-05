package com.example.sqlconnection.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "emp")
public class Emp {

	@Id
	private long id;
	@Column(name="ename")
	private String ename;
	@Column(name="date")
	private String date;
	@Column(name="salary")
	private long salary;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(long id, String ename, String date, long salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.date = date;
		this.salary = salary;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", date=" + date + ", salary=" + salary + "]";
	}
	
}
