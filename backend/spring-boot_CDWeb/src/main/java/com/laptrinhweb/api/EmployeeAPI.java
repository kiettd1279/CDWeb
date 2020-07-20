package com.laptrinhweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.EmployeeDTO;
import com.laptrinhweb.entity.EmployeeEntity;
import com.laptrinhweb.service.JEmployeeService;

@CrossOrigin
@RestController
public class EmployeeAPI {
	
	@Autowired
	private JEmployeeService employeeServe;
	
	@GetMapping(name = "/employee")
	public EmployeeDTO getAll() {
		return null;
	}

	@PostMapping(name = "/employee")
	public EmployeeDTO craet(@RequestBody EmployeeDTO model) {
		return employeeServe.save(model);
	}

	@PutMapping(name = "/employee")
	public EmployeeDTO update(@RequestBody EmployeeDTO model, @PathVariable("id") long id) {
		return null;
	}

}
