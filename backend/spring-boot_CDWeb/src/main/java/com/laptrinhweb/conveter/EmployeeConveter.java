package com.laptrinhweb.conveter;

import org.springframework.stereotype.Component;

import com.laptrinhweb.dto.EmployeeDTO;
import com.laptrinhweb.entity.EmployeeEntity;

@Component
public class EmployeeConveter {
	// chuyen từ entity về DTO
	public EmployeeEntity toEntity(EmployeeDTO dto) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setFirstName(dto.getFirstName());
		entity.setLastname(dto.getLastName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setSalary(dto.getSalary());
		return entity;
	}
	public EmployeeDTO toDTO(EmployeeEntity entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmail(entity.getEmail());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastname());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setSalary(entity.getSalary());
		return dto;
	}
	public EmployeeDTO toEntity(EmployeeEntity entity ,EmployeeDTO dto) {
		dto.setEmail(entity.getEmail());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastname());
		dto.setPhoneNumber(dto.getPhoneNumber());
		dto.setSalary(dto.getSalary());
		return dto;
		
	}
}
	
