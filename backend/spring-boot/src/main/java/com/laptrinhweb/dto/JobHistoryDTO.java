package com.laptrinhweb.dto;

import java.util.Date;

import javax.persistence.Column;

public class JobHistoryDTO {

	private String jobId;
	
	private String startDate;

	private String endDate;

	
	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	
}
