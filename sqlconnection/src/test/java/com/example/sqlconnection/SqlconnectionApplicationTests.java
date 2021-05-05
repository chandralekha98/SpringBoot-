package com.example.sqlconnection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.sqlconnection.controller.DeptController;
import com.example.sqlconnection.model.Dept;
import com.example.sqlconnection.model.Emp;
import com.example.sqlconnection.repo.Deptrepo;
import com.example.sqlconnection.repo.EmpRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class SqlconnectionApplicationTests {
	
//	Emp emp=new Emp(1,"name","hod");
//
//	@Autowired
//	private DeptController deptcon;
//	
//	@MockBean
//	private Deptrepo deptrepo;
//	
//	@MockBean
//	private EmpRepo emprepo;
//	
//	@SuppressWarnings("unchecked")
//	@Test
//	public void findAlldeptsTest(){
//		when(deptrepo.findAll()).thenReturn(Stream
//				.of(new Dept(1,"","manz",(List<Emp>) emp)).collect(Collectors.toList()));
//		assertEquals(1, deptcon.findAlldepts().size());
//	}
//	
//	@Test
//	public void findempdetails() {
//		when(emprepo.findAll()).thenReturn(Stream
//				.of(new Emp(1,"manzz","manz"),new Emp(2,"manzz","manz")).collect(Collectors.toList()));
//		assertEquals(2, deptcon.getEmp().size());
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Test
//	public void createD() {
//		Dept dept=new Dept(1,"manz","cdse",(List<Emp>) emp);
//		deptrepo.save(dept);
//	}
//	
//	@Test
//	public void creatE() {
//		Emp emp=new Emp(1,"nama","date");
//		emprepo.save(emp);
//	}
//	
}
