package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService empService;

	@ModelAttribute("employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@ModelAttribute("empList")
	public List<Employee> getEmployeeList() {
		return empService.getAllEmployees();
	}
	
	@RequestMapping("/home")
	public String homeController(Model model) {
		return "home";
	}
	@RequestMapping("/")
	public String indexController() {
		return "redirect:/home";
	}
	
	@RequestMapping("/add")
	public String addEmployee(@ModelAttribute("employee") Employee emp) {
		empService.addEmployee(emp);
		return "redirect:/home"; 
	}
	
	@RequestMapping("/delete")
	public String delEmployee(@RequestParam("empId") String empId) {
		empService.deleteEmployee(empId);
		return "redirect:/home";
	}
}
