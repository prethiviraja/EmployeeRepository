package com.Employee.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.Employee.DAO.EmployeeDAO;
import com.Employee.Entity.EmployeeEntity;
import com.Employee.Exception.NameException;



@Service
public class  EmployeeService{
		
		@Autowired
		EmployeeDAO vd;
		
		public String postThis(EmployeeEntity v) {
			return vd.postThis(v);
		}
		public EmployeeEntity getId(@PathVariable int x) {
			return vd.getId(x);
			
		}
		public List<EmployeeEntity> getEmployee() {
			return vd.getEmployee();
		}
		public List<String> getName() {
			List< EmployeeEntity> emps=vd.getEmployee();
			List<String> empsnames=emps.stream().map(x->x.getName()).collect(Collectors.toList());
			return empsnames;   //print nameonly
		}
		public EmployeeEntity getSalary() {
			List<EmployeeEntity> maxima=vd.getEmployee();
			EmployeeEntity mini=maxima.stream().max(Comparator.comparing(EmployeeEntity::getSalary)).get();
			return mini;    //maximum salary print
		}
		public int getAge() {
			List<EmployeeEntity> sum=vd.getEmployee();
			int sumadd=sum.stream().collect(Collectors.summingInt(x->x.getAge()));   //age adding
			return sumadd;
		}
		public Double getaverage() {
			List<EmployeeEntity> sums=vd.getEmployee();
			Double sumadding=sums.stream().collect(Collectors.averagingInt(x->x.getSalary()));
			return sumadding;    //average
		}
		public List<EmployeeEntity> getstart() {
			List<EmployeeEntity> find=vd.getEmployee();
			List<EmployeeEntity> mini=find.stream().filter(x->x.getName().startsWith("s")&&x.getSalary()>1000&&x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
			return mini;
		}
		
		public Long getcount() {
			List<EmployeeEntity> counting=vd.getEmployee();
			Long sumcount=counting.stream().map(x->x.getSalary()).count();     //cont
			return sumcount;
		}
		public Map<String,Long> getvalue(){
			List<EmployeeEntity> temp=vd.getEmployee();
			Map<String,Long> temping=temp.stream().collect(Collectors.groupingBy(x->x.getField(),Collectors.counting()));
			return temping;            //counting the fields
		}
		public List<EmployeeEntity> getsorting(){
			List<EmployeeEntity> word=vd.getEmployee();
			List<EmployeeEntity> wording=word.stream().sorted(Comparator.comparing(EmployeeEntity::getName)).collect(Collectors.toList());
			return wording;        //ascenting order in name;
		}
		
		public List<EmployeeEntity> getbyName(String a){
			return vd.getbyName(a);
			
		}
		public List<EmployeeEntity> getbynames(String a){
			return vd.getbynames(a);
			
		}
		 public String getnames(@PathVariable int a){
		    	return vd.getnames(a);
		 }


                     //exception class 


         //exception class  
//public String getName(int a) throws NameException {
//	try {
//	if(vd.getName(a).equals("abc")) {
//		return vd.getName(a);
//	}
//	else {
//		throw new NameException("abc is not  that ID");
//	}
//	}
//	catch(NameException va) {
//	  return va.getMessage();   //or getName(a);
//	}
//	finally {
//		return "sucess";
//	}
		 
		 public String getName(int a) throws NameException {
				
				if(vd.getName(a).equals("abc")) {
					return vd.getName(a);
				}
				else {
					throw new NameException("abc is not  that ID");
				}
				}
		 public EmployeeEntity getAge1(int b)throws NameException {
			 if(vd.getAge1(b).getAge()>60) {
				 return vd.getAge1(b);
			 }
			 else {
				 throw new NameException("is not good");
			 }
		 }
		 public List<Character> getName1() {
				List< EmployeeEntity> emps=vd.getEmployee();
				List<Character> empsnames=emps.stream().map(x->x.getName().charAt(x.getName().length()-1)).collect(Collectors.toList());
				return empsnames; 
		 }
		 public List<Object> getName2() {
			 List<EmployeeEntity> temp=vd.getEmployee();
			 List<Object> temps=temp.stream().map(x->x.getName()+" "+x.getSalary()).collect(Collectors.toList());
			 return temps;
		 }
		 
}
