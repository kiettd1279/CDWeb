package com.laptrinhweb.service;

import java.util.List;

import com.laptrinhweb.dto.EmployeeDTO;

public interface JEmployeeService {
	EmployeeDTO save(EmployeeDTO dto);
	List<EmployeeDTO> findAll();
}
