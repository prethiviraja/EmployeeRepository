package com.Employee.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Employee.Entity.EmployeeEntity;
import com.Employee.Repository.EmployeeRepository;



	@Repository
	public class EmployeeDAO {
		
		@Autowired
		EmployeeRepository vr;
		
		public String postThis(EmployeeEntity v) {
			vr.save(v);
			return "Posted Success";
		}
		public EmployeeEntity getId(@PathVariable int x) {
			return vr.findById(x).get();
		}
		public List<EmployeeEntity> getEmployee() {
			return vr.findAll();
		}
		public List<EmployeeEntity> getbyName(String a){
			return vr.getbyname(a);
			
		}
		public List<EmployeeEntity> getbynames(String a){
			return vr.getbynames(a);
			
		}
		 public String getnames(@PathVariable int a){
		    	return vr.findById(a).get().getName();
		 }
		  //exception
		 
		 public String getName( int a){
		    	return vr.findById(a).get().getName();
		 }
		 public EmployeeEntity getAge1( int a){
		    	return vr.findById(a).get();
		 }
	}
		 
		