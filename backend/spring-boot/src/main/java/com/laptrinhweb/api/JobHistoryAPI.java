package com.laptrinhweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.dto.JobHistoryDTO;
import com.laptrinhweb.service.IJobHistoryService;

@CrossOrigin
@RestController
public class JobHistoryAPI {

	@Autowired
	private IJobHistoryService jobHService;
	
	@PostMapping(value = "/jobhistory")
	public JobHistoryDTO creatJH(@RequestBody JobHistoryDTO model) {
		return  jobHService.save(model);
	}
}
