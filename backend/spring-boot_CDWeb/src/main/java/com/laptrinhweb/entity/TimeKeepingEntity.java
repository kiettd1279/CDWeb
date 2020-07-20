package com.laptrinhweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "timeKeeping")
public class TimeKeepingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private int workTime ;
	
	@Column
	private int minimumTime ;
	
	@Column
	private int timeLate;
	
	@Column
	private int overTime ;
	
	@Column
	private int note ;
	
	@Column
	private String dateStart;
	
	@Column
	private String dateEnd ;
	
	@ManyToOne
	@JoinColumn(name = "timeKeeping_id")
	private EmployeeEntity employee;
	
}
