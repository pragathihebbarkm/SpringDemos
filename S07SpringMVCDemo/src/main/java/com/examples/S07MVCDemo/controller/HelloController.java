package com.examples.S07MVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07MVCDemo.model.Employee;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id","123");
		modelView.addObject("name","Rama");
		modelView.addObject("salary","43500");
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read2() {
		ModelAndView modelView = new ModelAndView();
		
		Employee emp = new Employee();
		
		emp.setId(2);
		emp.setName("Sita");
		emp.setSalary(45000);
		
		modelView.addObject("employee", emp);
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelView = new ModelAndView();
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		
		emp.setId(3);
		emp.setName("Sitarama");
		emp.setSalary(45000.453);
		
		emp=new Employee();
		emp.setId(4);
		emp.setName("Raghavanka");
		emp.setSalary(35000.53);
		
		emp=new Employee();
		emp.setId(5);
		emp.setName("Vinayaka");
		emp.setSalary(51000.33);
		
		modelView.addObject("employees", employees);
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id",id);
		modelView.addObject("name",name);
		
		
		modelView.setViewName("showdata");
		return modelView;
	}
	
}
