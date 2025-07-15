package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PolicyHolderDTO;

public class PolicyHolderForm extends BaseForm {
	
	@NotEmpty(message = "name is required")
	private String name;
	
	@NotNull(message = "dob is required")
	private Date dob;
	
	@NotEmpty(message = "gender is required")
	private String gender;
	
	@NotEmpty(message = "contactNumber is required")
	private String contactNumber;
	
	@NotEmpty(message = "email is required")
	private String email;
	
	@NotEmpty(message = "policyNumber is required")
	private String policyNumber;
	
	@NotEmpty(message = "policyType is required")
	private String policyType;
	
	@NotNull(message = "startDate is required")
	private Date startDate;
	
	@NotNull(message = "endDate is required")
	private Date endDate;
	
	
	
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
	public BaseDTO getDto() {
		
		PolicyHolderDTO dto = (PolicyHolderDTO) initDTO(new PolicyHolderDTO());
		
		dto.setName(name);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setContactNumber(contactNumber);
		dto.setEmail(email);
		dto.setPolicyNumber(policyNumber);
		dto.setPolicyType(policyType);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		
		return dto;
	}
	
	

	
}
