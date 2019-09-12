package com.taxi.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.entities.Drivers;
import com.taxi.entities.Trips;
import com.taxi.repos.DriversRepo;
import com.taxi.repos.TripsRepo;
import com.taxi.utils.RestResponse;

@Service
public class TripsService {

	
	@Autowired
	TripsRepo tripsRepo;
	DriversRepo driversRepo;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public RestResponse listActiveTrips() {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating waiting driver list process");
		List<Trips> activetripsList = new ArrayList<Trips>();

		try {
			activetripsList = tripsRepo.findBytripStatus("ACTIVE");
			response.setStatus(true);
			response.setPayload(activetripsList);
			response.setMessage("Success");
		} catch (Exception e) {
			log.error("List all active trips exception: " + e);
		}
		return response;
	}
	
	public RestResponse NewTrips(String lat,String longtitude) {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating new trip process");
//		List<Trips> activetripsList = new ArrayList<Trips>();
		List<Drivers> driverList = new ArrayList<Drivers>();
		try {
			driverList = driversRepo.findBydrStatus("WAITING");
			if(!driverList.isEmpty()){
				for(Drivers driver : driverList){
					
//					
//					response.setStatus(true);
//					response.setPayload(activetripsList);
//					response.setMessage("Success");
					
					
				}

			}
			
		}catch (Exception e){
			log.error("Error allocating trips exception: " + e);
			
		}
	
		return response;
	}
}
