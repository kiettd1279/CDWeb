package com.laptrinhweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String firstName ;
	
	@Column
	private String lastname ;
	
	@Column 
	private String email;
	
	@Column 
	private String phoneNumber;
	
	@Column
	private double salary;
	
//	@OneToMany(mappedBy = "jobHistory")
//	private List<JobHistoryEntity> jobHistorys = new ArrayList<JobHistoryEntity>();

	
	@OneToMany(mappedBy = "employee")
	private List<JobHistoryEntity> jobHistory = new ArrayList<JobHistoryEntity>();
	
	@OneToMany(mappedBy = "employee")
	private List<TimeKeepingEntity> timeKeeping = new ArrayList<TimeKeepingEntity>();

	@ManyToOne
	@JoinColumn(name = "department_id")
	private DeparmentEntity department;
	
	@Column(name = "cative" )
	int active;
	
	
	public List<JobHistoryEntity> getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(List<JobHistoryEntity> jobHistory) {
		this.jobHistory = jobHistory;
	}

	public List<TimeKeepingEntity> getTimeKeeping() {
		return timeKeeping;
	}

	public void setTimeKeeping(List<TimeKeepingEntity> timeKeeping) {
		this.timeKeeping = timeKeeping;
	}

	public DeparmentEntity getDepartment() {
		return department;
	}

	public void setDepartment(DeparmentEntity department) {
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	
}
