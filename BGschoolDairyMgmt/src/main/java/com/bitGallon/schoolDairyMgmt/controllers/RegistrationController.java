package com.bitGallon.schoolDairyMgmt.controllers;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/bitGallon/api/registration/")
public class RegistrationController {


	@RequestMapping(value = "/v1.0/check/", produces = { "application/json" }, method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String,String> getAllComplaints() {
		HashMap<String, String> mapResult = new HashMap<String, String>();
		mapResult.put("Name", "Ravinder");
		
		return mapResult;
	}
}
