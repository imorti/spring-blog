/**
 * 
 */
package com.imorti.jazzhands.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author imorti
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "WEB-INF/jsp/index.jsp";
	}
	

}
