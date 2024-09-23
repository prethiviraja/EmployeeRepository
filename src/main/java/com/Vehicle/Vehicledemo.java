package com.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Vehicledemo {
	
	@Autowired
	Vehiclerep vd;
	
	public String postThis(Vehicle v) {
		return vd.postThis(v);
	}
	public String postThis(List<Vehicle> v) {
		return vd.postThis(v);
	}
	public List<Vehicle> getVehicle(){
		return vd.getVehicle();
	}
	public Vehicle getId(@RequestParam int a) {
		return vd.getId(a);
	}
	public String PutVehicle(@RequestBody Vehicle v) {
		return vd.PutVehicle(v);
	}
	public String PatchThis(@PathVariable int a,@RequestBody Vehicle v) {
		return vd.PatchThis(a,v);
	}
}





	













