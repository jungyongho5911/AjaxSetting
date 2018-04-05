package com.project.web.person;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PersonController {
	@Autowired PersonService service;
	@Autowired UserDTO user;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		String result="존재 하지 않습니다";
		Map<String,String> map = new HashMap<>();
		
		map.put("type", "member");
		map.put("id", "userid");
		map.put("pass", "password");
		map.put("data1", "skyfor1004");
		map.put("data2", "1");

		if(service.exist(map)==1){
			result="존재합니다";
		}
		System.out.println("컨트롤러에서 체크 "+result);
		model.addAttribute("exist", result );
		return "home";
	}
	
}
