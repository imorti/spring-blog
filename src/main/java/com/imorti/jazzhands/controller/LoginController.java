/**
 * 
 */
package com.imorti.jazzhands.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		
		final Logger logger = Logger.getLogger("LoginController");
		
		logger.info("responding to LoginController request");
		
		return "login";
	}
	
}