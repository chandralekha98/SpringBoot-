package com.example.sqlconnection.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sqlconnection.empdetails.requestDetails;
import com.example.sqlconnection.model.Emp;

public interface EmpRepo extends JpaRepository<Emp, Long> {

//	@Query("select e.ename, e.fk from Emp e,Dept d where e.fk=d.did")
//	public List getResponse();
	
    @Query(value="select * from Emp e where e.fk= :department", nativeQuery = true)
    List<Emp> getEmployeeDetails(@Param("department") long department);
    
    @Modifying
    @Transactional
    @Query(value="delete from Emp e where e.id=?1")
    Object deleteEmployeeDetails(long department);
    
    @Modifying
    @Transactional
    @Query(value = "update Emp e set e.salary=?2 where e.id=?1")
    Object updateEmployeeDetails(long department,long sal);
      
}
