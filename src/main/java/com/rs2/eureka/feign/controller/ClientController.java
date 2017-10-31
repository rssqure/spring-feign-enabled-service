package com.rs2.eureka.feign.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rs2.eureka.feign.api.ServiceClient;

@Controller
public class ClientController {

	Logger logger = LogManager.getLogger(ClientController.class.getName());

	@Autowired
	ServiceClient serviceClient;

    @RequestMapping("/call-service")
    public String callService(Model model) {
    		logger.trace("In call-service.");
    		model.addAttribute("service", serviceClient.service());
    		return "service-view";
    }	
}
