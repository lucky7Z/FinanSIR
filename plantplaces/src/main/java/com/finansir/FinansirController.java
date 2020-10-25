package com.finansir;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start endpoints
 *@return
 */

@Controller
public class FinansirController {
	
	
	@RequestMapping("/")
	public String index(){
		
		return "start";
	}
}
