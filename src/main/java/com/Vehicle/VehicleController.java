package com.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Vehicle")
public class VehicleController {
	
	@Autowired
	Vehicledemo vs;
	
	@PostMapping(value="/postVehicle")
	public String PostThis(@RequestBody Vehicle v) {
		return vs.postThis(v);
		
	}
	@PostMapping(value="/postVehicle1")
	public String PostThis(@RequestBody List<Vehicle> v) {
		return vs.postThis(v);
	}
	@GetMapping(value="/getVehicle2")
	public List<Vehicle> getVehicle() {
		return vs.getVehicle();
		
	}
	@GetMapping(value="/getVehicle3")
	public Vehicle getId(@RequestParam int a) {
		return vs.getId(a);
	}
	@PutMapping(value="/PutVehicle4")
	public String PutVehicle(@RequestBody Vehicle v) {
		return vs.PutVehicle(v);
	}
	@PatchMapping(value="/PatchVehicle5/{a}")
	public String PatchThis(@PathVariable int a,@RequestBody Vehicle v) {
		return vs.PatchThis(a,v);
	}
	
}



	



			


	














		
	
		



	




	
		
	
		
	
	
	
	
	
	

	
	





