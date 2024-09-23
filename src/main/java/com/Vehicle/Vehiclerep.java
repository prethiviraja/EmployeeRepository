package com.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class Vehiclerep {
	
	@Autowired
	VehicleRepository vr;
	
	public String postThis(Vehicle  v) {
		vr.save(v);
		return "Posted Success";
		
	}
	public String postThis(List<Vehicle>  v) {
		vr.saveAll(v);
		return "Posted Success";
	}
	public List<Vehicle> getVehicle() {
		return vr.findAll();
	}
	public Vehicle getId(@RequestParam int a) {
		return vr.findById(a).get();
	}
	public String PutVehicle(@RequestBody Vehicle v) {
		vr.save(v);
		return "successfully updated";
	}
	public String PatchThis(@PathVariable int a,@RequestBody Vehicle v) {
		Vehicle vh=vr.findById(a).get();
		vh.setPrice(v.getPrice());
		vh.setColor(v.getColor());
		vr.save(vh);
		return "Patched success";
		
		
	}
}














		








