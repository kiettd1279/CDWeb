package com.laptrinhweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.DeparmentDTO;
import com.laptrinhweb.service.impl.DeparmentService;

@CrossOrigin
@RestController
public class DeparmentAPI {

	@Autowired
	private DeparmentService deparmentService;

	@GetMapping(value = "/derparment")
	public List<DeparmentDTO>getAllDerparment(){
		return deparmentService.findAll();
	}
}
