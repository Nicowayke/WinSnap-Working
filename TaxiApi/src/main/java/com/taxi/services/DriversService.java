package com.taxi.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxi.entities.Drivers;
import com.taxi.repos.DriversRepo;
import com.taxi.utils.RestResponse;

@Service
public class DriversService {
	// ---------------- Global Variables --------------------
	@Autowired
	DriversRepo driversRepo;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	public RestResponse listAllDrivers() {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating driver list process");
		List<Drivers> driverList = new ArrayList<Drivers>();

		try {
			driverList = driversRepo.findAll();
			response.setStatus(true);
			response.setPayload(driverList);
			response.setMessage("Success");
		} catch (Exception e) {
			log.error("List all drivers exception: " + e);
		}
		return response;
	}
	
	public RestResponse listWaitingDrvs() {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating waiting driver list process");
		List<Drivers> driverList = new ArrayList<Drivers>();

		try {
			driverList = driversRepo.findBydrStatus("WAITING");
			response.setStatus(true);
			response.setPayload(driverList);
			response.setMessage("Success");
		} catch (Exception e) {
			log.error("List all drivers exception: " + e);
		}
		return response;
	}

	public RestResponse findDriver(String mobileNumber) {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating find driver process");
		try {
			Drivers driver = driversRepo.findByDrMobileNumber(mobileNumber);
			if (driver != null) {
				response.setStatus(true);
				response.setPayload(driver);
				response.setMessage("Driver found");
			} else {
				response.setStatus(true);
				response.setMessage("Driver not found");
			}
		} catch (Exception e) {
			log.error("List all drivers exception: " + e);
		}
		return response;

	}

	public RestResponse saveDriver(Drivers driver) {
		RestResponse response = new RestResponse();
		response.setStatus(false);
		response.setPayload(null);
		response.setMessage("Error initiating save driver process");
		try {
			Drivers savedDriver = driversRepo.save(driver);
			if (savedDriver != null) {
				response.setStatus(true);
				response.setPayload(savedDriver);
				response.setMessage("Driver saved successfully");
			} else {
				response.setStatus(true);
				response.setMessage("Error saving driver");
			}
		} catch (Exception e) {
			log.error("Save drivers exception: " + e);
		}
		return response;
	}

}
