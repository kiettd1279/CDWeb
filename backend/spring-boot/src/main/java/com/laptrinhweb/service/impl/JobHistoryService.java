package com.laptrinhweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.conveter.JobHistoryConveter;
import com.laptrinhweb.dto.JobHistoryDTO;
import com.laptrinhweb.entity.JobEntity;
import com.laptrinhweb.entity.JobHistoryEntity;
import com.laptrinhweb.repository.JobHistoryRepository;
import com.laptrinhweb.repository.JobRepository;
import com.laptrinhweb.service.IJobHistoryService;

@Service
public class JobHistoryService implements IJobHistoryService {

	@Autowired
	private JobHistoryRepository jobHistoryRepostory;
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private JobHistoryConveter jobHConveter;

	@Override
	public JobHistoryDTO save(JobHistoryDTO jobHistoryDTO) {
		JobEntity jobEntity = jobRepository.findOneByCode(jobHistoryDTO.getJobId());

		JobHistoryEntity jobHEntity = jobHConveter.toEntity(jobHistoryDTO);
		jobHEntity.setJob(jobEntity);
		jobHEntity = jobHistoryRepostory.save(jobHEntity);
		return jobHConveter.toDTO(jobHEntity);
	}

}
