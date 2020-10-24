package com.finansir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
