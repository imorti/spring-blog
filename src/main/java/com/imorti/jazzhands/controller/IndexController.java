/**
 * 
 */
package com.imorti.jazzhands.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.logging.Logger;

/**
 * @author imorti
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		
		final Logger logger = Logger.getLogger("IndexController");
		
		logger.info("responding to IndexController request");
		
		return "index";
	}
	

}
