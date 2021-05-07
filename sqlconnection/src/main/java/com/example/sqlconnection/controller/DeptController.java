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

import com.example.sqlconnection.empdetails.StatusResponse;
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
		StatusResponse status=new StatusResponse();
		Object emp=emprepo.updateEmployeeDetails(id,res.getSalary());
		if(emp!=null)
			return status.getSucess();
		else
			return status.getFailed(); 
	}

	
	@GetMapping("/findalldepts")
	public List<Dept> findAlldepts(){
		return deptrepo.findAll();
	}
	@GetMapping("/dept/{fk}")
	public String getEmployeeDept (@PathVariable(value = "id") long id)
			{
			StatusResponse status=new StatusResponse();
			Emp emp=emprepo.getEmployeeDetails(id);
			if(emp!=null)
				return status.getDetailsFetched();
			else
				return status.getFailed();
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
			StatusResponse status=new StatusResponse();
			Object emp=emprepo.deleteEmployeeDetails(fk);
			System.out.println(emp);
			if(emp!=null)
				return status.getDeleteSuccess();
			else
				return status.getFailed();
		}
	
}
