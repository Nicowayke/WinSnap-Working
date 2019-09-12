package com.taxi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taxi.entities.Drivers;
import com.taxi.services.DriversService;
import com.taxi.utils.RestResponse;
import com.taxi.utils.SearchRequest;

@RestController
@RequestMapping(value = "api/drivers")
public class DriversController {
	// ------------------ Global Variables ------------------
	@Autowired
	DriversService driverService;

	@RequestMapping(value = "/listAll", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse listAllUsers(HttpServletRequest request, HttpServletResponse response) {
		return driverService.listAllDrivers();
	}

	@RequestMapping(value = "/listWaitingDrivers", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse listWaitingDrivers(HttpServletRequest request, HttpServletResponse response) {
		return driverService.listWaitingDrvs();
	}

	@RequestMapping(value = "/getDriver", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse getDriver(@RequestBody SearchRequest req, HttpServletRequest request,
			HttpServletResponse response) {
		return driverService.findDriver(req.getMobileNumber());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public RestResponse saveDriver(@RequestBody Drivers req, HttpServletRequest request, HttpServletResponse response) {
		return driverService.saveDriver(req);
	}
}
