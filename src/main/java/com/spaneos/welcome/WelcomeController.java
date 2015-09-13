package com.spaneos.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class WelcomeController {
		@RequestMapping(method=RequestMethod.GET)
		public String getMessage(){
			return "Welcome to Spring with heroku world";
		}
}
