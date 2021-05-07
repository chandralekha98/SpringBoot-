package com.example.sqlconnection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.sqlconnection.controller.DeptController;
import com.example.sqlconnection.empdetails.StatusResponse;
import com.example.sqlconnection.empdetails.resDetails;
import com.example.sqlconnection.model.Dept;
import com.example.sqlconnection.model.Emp;
import com.example.sqlconnection.repo.Deptrepo;
import com.example.sqlconnection.repo.EmpRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class SqlconnectionApplicationTests {
	
	ArrayList<Emp> emp=new ArrayList<Emp>();
	
	@Autowired
	private DeptController deptcon;
	
	@MockBean
	private Deptrepo deptrepo;
	
	@MockBean
	private EmpRepo emprepo;
	
	@SuppressWarnings("unchecked")
	@Test
	public void findAlldeptsTest(){
		when(deptrepo.findAll()).thenReturn(Stream
				.of(new Dept(1,"","manz",emp)).collect(Collectors.toList()));
		assertEquals(1, deptcon.findAlldepts().size());
	}
	
	@Test
	public void findempdetails() {
		when(emprepo.findAll()).thenReturn(Stream
				.of(new Emp(1,"manzz","manz",1),new Emp(2,"manzz","manz",1)).collect(Collectors.toList()));
		assertEquals(2, deptcon.getEmp().size());
	}
	
	
	@Test
	public void updateSal() {
	Emp emp=new Emp(1,"nama","date",0);
	resDetails res=new resDetails();
	res.setSalary(100);
	emprepo.save(emp);
	Mockito.when(emprepo.updateEmployeeDetails(emp.getId(), res.getSalary())).thenReturn(emp);
	Object result=deptcon.updateSalary(1, res); 
	assertEquals("Updated Salary Succesfully", result);
	}
	
	@Test
	public void deleteEmployee(){
		Emp emp=new Emp(1,"nama","date",0);
		resDetails res=new resDetails();
		res.setSalary(100);
		emprepo.save(emp);
		Mockito.when(emprepo.deleteEmployeeDetails(emp.getId())).thenReturn(emp);
		Object result=deptcon.deleteEmployeeDept(emp.getId());
		assertEquals("Deleted Successfully!", result);
	}
	
	
	@Test
	public void getEmployeeById(){
		Emp emp=new Emp(1,"nama","date",0);
		emprepo.save(emp);
		long fk=1;
		Mockito.when(emprepo.getEmployeeDetails(fk)).thenReturn(emp);
		Object result=deptcon.getEmployeeDept(1);
		assertEquals("All the details are fetched", result);
	}
}
