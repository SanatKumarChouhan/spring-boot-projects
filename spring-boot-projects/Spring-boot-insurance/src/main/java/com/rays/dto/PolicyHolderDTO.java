package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.rays.common.BaseDTO;


@Entity
@Table(name = "ST_POLICYHOLDER")
public class PolicyHolderDTO extends BaseDTO{
	
//	@Id
//	@GeneratedValue(generator = "ncsPk")
//	@GenericGenerator(name = "ncsPk", strategy = "native")
//	
//	@Column(name = "ID", unique = true, nullable = false)
//	private Long id;
	
	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "GENDER", length = 50)
	private String gender;
	
	@Column(name = "CONTACT_NUMBER", length = 50)
	private String contactNumber;
	
	@Column(name = "EMAIL", length = 50)
	private String email;
	
	@Column(name = "POLICY_NUMBER", length = 50)
	private String policyNumber;
	
	@Column(name = "POLICY_TYPE", length = 50)
	private String policyType;
	
	@Column(name = "STARTED_DATE")
	private Date startDate;
	
	@Column(name = "END_DATE")
	private Date endDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
