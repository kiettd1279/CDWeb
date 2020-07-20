package com.laptrinhweb.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "uCreateBy")
	private String createdBy;
	
	@Column(name = "uCreatDate")
	private Date creatDate;
	
	@Column(name = "uModfiedBy")
	private String modfiedBy;
	
	@Column(name = "uModfledDate")
	private Date modfledDate;

}
