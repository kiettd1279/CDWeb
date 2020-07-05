package com.laptrinhweb.service;

import org.springframework.stereotype.Service;

import com.laptrinhweb.dto.JobHistoryDTO;

public interface IJobHistoryService  {
	JobHistoryDTO save(JobHistoryDTO jobHistoryDTO);
}
