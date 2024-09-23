package com.Employee.Repository;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Entity.EmployeeEntity;


	public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
		
		@Query(value="select* from employee where name=?",nativeQuery=true)
		public List<EmployeeEntity> getbyname(String a);
	
		
		@Query(value="select e from EmployeeEntity e where e.name=:p")
		public List<EmployeeEntity> getbynames(@Param("p")String a);
		
		
		
	}
	
	
	 
		
	
	
		
			
		
		
	
	

	


	

