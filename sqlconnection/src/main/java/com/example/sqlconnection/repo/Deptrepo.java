package com.example.sqlconnection.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sqlconnection.model.Dept;

public interface Deptrepo extends JpaRepository<Dept, Long>{
	
}
