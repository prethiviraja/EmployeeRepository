package com.Employee.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.EmployeeEntity;
import com.Employee.Exception.NameException;
import com.Employee.Service.EmployeeService;



@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService vs;
	
	@PostMapping(value="/postEmployee")
	public String postThis(@RequestBody EmployeeEntity v) {
		return vs.postThis(v);
	}
	@GetMapping(value="/getId/{x}")
	public EmployeeEntity getId(@PathVariable int x) {
		return vs.getId(x);
	}
	@GetMapping(value="/getEmployee1")
	public List<EmployeeEntity> getEmployee(){
		return vs.getEmployee();
	}
	@GetMapping(value="/getEmployee2")
	public List<String> getName()  {
		return vs.getName();
	}
	@GetMapping(value="/getMaxi")
	public EmployeeEntity getSalary() {
		return vs.getSalary();
	}
	@GetMapping(value="/getAge")
	public int getAge() {        
		return vs.getAge();
	}
	@GetMapping(value="/getaverage")
	public Double getaverage() {          //average
		return vs.getaverage();
	}

	@GetMapping(value="/getstart")
	public List<EmployeeEntity> getstart(){    //startwith &&price greater&& findgender
		return vs.getstart();
	}
	@GetMapping(value="/getcount")
	public Long getcount() {        //cont
		return vs.getcount();
	}
    @GetMapping(value="/getvalue")
    public Map<String,Long> getvalue(){
    	return vs.getvalue();            //groupingby
    }
    @GetMapping(value="/getsorting")
    public List<EmployeeEntity> getsorting() {     //ascending order
    	return vs.getsorting();
    	
    }
    
    @GetMapping(value="/Query/{a}")
    public List<EmployeeEntity> getbyName(@PathVariable String a){
    	return vs.getbyName(a);
    }
    @GetMapping(value="/jQuery/{a}")
    public List<EmployeeEntity> getbynames(@PathVariable String a) {
    	return vs.getbynames(a);
    	
    	
    }
    @GetMapping(value="/getfield/{a}")
    public String getnames(@PathVariable int a){
    	return vs.getnames(a);
    }


    
    


                                 //exception class  

    @GetMapping(value="/ExceptionThrow/{a}")
    public String getName(@PathVariable int a)throws NameException {
    	return vs.getName(a);
    }
    @GetMapping(value="/ExceptionThrows/{b}")
    public EmployeeEntity getAge1(@PathVariable int b)throws NameException {
    	return vs.getAge1(b);
    }
    @GetMapping(value="/getEmployee3")
	public List<Character> getName1()  {
		return vs.getName1();
    }
    @GetMapping(value="/getEmployee4")
	public List<Object> getName2()  {
		return vs.getName2();
    }
}
    




    





















	
































	

	
	







	
	










	
	
	
	
	
	
	

















		



	
