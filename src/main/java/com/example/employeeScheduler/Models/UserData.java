package com.example.employeeScheduler.Models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@Entity
@Table(name = "userData")
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Version
	@Column(name = "version")
	private Long version;

	@CreatedDate
	@Column(name = "created_on")
	private Date createdOn;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

	@LastModifiedDate
	@Column(name = "updated_on")
	private Date updatedOn;

	@LastModifiedBy
	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "role")
	private String role;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "employer_id")
	private Long employerId;
}