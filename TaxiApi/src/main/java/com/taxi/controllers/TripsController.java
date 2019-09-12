package com.taxi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taxi.services.DriversService;
import com.taxi.services.TripsService;
import com.taxi.utils.RestResponse;
import com.taxi.utils.SearchRequest;

@RestController
@RequestMapping(value = "api/trips")
public class TripsController {

	@Autowired
	TripsService tripsService;

	@RequestMapping(value = "/listActiveTrips", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse ActiveTrips(HttpServletRequest request, HttpServletResponse response) {
		return tripsService.listActiveTrips();
	}

	@RequestMapping(value = "/listActiveTrips", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse NewTrip(HttpServletRequest request, HttpServletResponse response) {
		return tripsService.listActiveTrips();
	}

//	@RequestMapping(value = "/NewTrip", method = RequestMethod.POST, consumes = { "application/json",
//			"application/xml" }, produces = { "application/json", "application/xml" })
//	public RestResponse getDriver(@RequestBody SearchRequest req, HttpServletRequest request,
//			HttpServletResponse response) {
//		return tripsService.NewTrips(req.getLatitude(),req.getLongitude());
//	}

}
