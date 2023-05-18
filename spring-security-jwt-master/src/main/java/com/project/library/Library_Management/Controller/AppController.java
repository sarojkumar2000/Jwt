package com.project.library.Library_Management.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class AppController {

	@RequestMapping("/")
	public String allStudents() {
	
		return "login";
	}
	
}
