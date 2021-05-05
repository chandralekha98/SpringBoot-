package com.example.sqlconnection.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqlconnection.empdetails.reqDetails;
import com.example.sqlconnection.empdetails.requestDetails;
import com.example.sqlconnection.empdetails.resDetails;
import com.example.sqlconnection.model.Dept;
import com.example.sqlconnection.model.Emp;
import com.example.sqlconnection.repo.Deptrepo;
import com.example.sqlconnection.repo.EmpRepo;

@RestController
public class DeptController {

	@Autowired
	private Deptrepo deptrepo; 
	
	@Autowired
	private EmpRepo emprepo;
	
	@PostMapping("/reqDetails")
	public Dept getDetails(@RequestBody reqDetails del) {
		return deptrepo.save(del.getDept());
	}
	
	@PostMapping("/updatesal/{id}")
	public Object updateSalary(@PathVariable(value = "id") long id, @RequestBody resDetails res) {
		
		return emprepo.updateEmployeeDetails(id, res.getSalary());
	}

	
	@GetMapping("/findalldepts")
	public List<Dept> findAlldepts(){
		return deptrepo.findAll();
	}
	@GetMapping("/dept/{fk}")
	public List<Emp> getEmployeeDept (@PathVariable(value = "fk") long fk)
			{
			return emprepo.getEmployeeDetails(fk);
		}
	
	
	@GetMapping("/emp/{id}")
	public Optional<Emp> getDept(@PathVariable(value = "id") long id) {
		return emprepo.findById(id);
	}
	
	@GetMapping("/emp}")
	public List<Emp> getEmp() {
		return emprepo.findAll();
	}
	
	@DeleteMapping("/delete/{fk}")
	public Object deleteEmployeeDept (@PathVariable(value = "fk") long fk)
			{
			return emprepo.deleteEmployeeDetails(fk);
		}
	
	@PostMapping("/update/{id}/{salary}")
	public Object updateEmpDet(@PathVariable(value = "id") long id, @PathVariable(value = "salary") long salary) {
		return emprepo.updateEmployeeDetails(id,salary);
	}
}
