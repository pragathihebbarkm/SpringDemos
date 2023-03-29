package com.examples.S07MVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07MVCDemo.model.User;

@Controller
public class UserController {

		@RequestMapping("/register")
		public ModelAndView showRegistrationPage() {
			ModelAndView modelView = new ModelAndView();
			modelView.setViewName("registeruser");
			return modelView;
		}
		
		@RequestMapping(value="/signupuser", method=RequestMethod.POST)
		public String signUpUser(@ModelAttribute("user") User user, ModelMap model) {
			
			System.out.println("From UI, Retrieved Object from Spring Container: "+user);
			model.addAttribute("user", user);
			return "registeruserresult";
		}
			
}
