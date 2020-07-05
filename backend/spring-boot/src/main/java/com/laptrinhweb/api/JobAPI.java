package com.laptrinhweb.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.JobDTO;

@CrossOrigin
@RestController
public class JobAPI {
	
	@PostMapping(value = "/job")
	public JobDTO creatJob(@RequestBody JobDTO model) {
		return model;
	}

}
