package com.vita.libraries.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="enquiries")
@Data
public class Enquiry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

	@Column(name="course")
	private String course;

	@Column
	private String message;

	@Column
	private LocalDateTime createdDate = LocalDateTime.now();
}
