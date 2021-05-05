package com.example.sqlconnection.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="dept")
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long did;
	private String name;
	private String head;
	@OneToMany(targetEntity=Emp.class, cascade=CascadeType.ALL)
	@JoinColumn(name="fk", referencedColumnName="did")
	private List<Emp> emp=new ArrayList<>();
	
	
	public Dept(long did, String name, String head, List<Emp> emp) {
		super();
		this.did = did;
		this.name = name;
		this.head = head;
		this.emp = emp;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + ", head=" + head + ", emp=" + emp + "]";
	}
}
