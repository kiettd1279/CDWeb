package com.laptrinhweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.conveter.EmployeeConveter;
import com.laptrinhweb.dto.EmployeeDTO;
import com.laptrinhweb.entity.EmployeeEntity;
import com.laptrinhweb.repository.EmployeeRepository;
import com.laptrinhweb.service.JEmployeeService;

@Service
public class EmployeeService implements JEmployeeService {

	@Autowired 
	private EmployeeConveter employeeConveter;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public EmployeeDTO save(EmployeeDTO dto) {
		EmployeeEntity entity ;
		entity = employeeConveter.toEntity(dto);
		entity = employeeRepository.save(entity);
		return employeeConveter.toDTO(entity);
	}

	@Override
	public List<EmployeeDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
