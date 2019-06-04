package com.hex.clarity.core.beans;

import java.io.Serializable;
import java.util.Set;

import com.hex.clarity.core.entity.Investment;

public class InvestmentCreationRequest implements Serializable {
	public InvestmentCreationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long investment_code;
	private String investment_name;
	private String investment_type;
	private Integer sow_no;
	private String sow_name;
	private String sow_deliverables;
	private String consultant_location;
	private String location;
	private String client_requirement_name;
	private String is_deliverbales_in_current_week;
	private String consultant_id;
	private String firstname;
	private String lastname;
	public Long getInvestment_code() {
		return investment_code;
	}
	public void setInvestment_code(Long investment_code) {
		this.investment_code = investment_code;
	}
	public String getInvestment_name() {
		return investment_name;
	}
	public void setInvestment_name(String investment_name) {
		this.investment_name = investment_name;
	}
	public String getInvestment_type() {
		return investment_type;
	}
	public void setInvestment_type(String investment_type) {
		this.investment_type = investment_type;
	}
	public Integer getSow_no() {
		return sow_no;
	}
	public void setSow_no(Integer sow_no) {
		this.sow_no = sow_no;
	}
	public String getSow_name() {
		return sow_name;
	}
	public void setSow_name(String sow_name) {
		this.sow_name = sow_name;
	}
	public String getSow_deliverables() {
		return sow_deliverables;
	}
	public void setSow_deliverables(String sow_deliverables) {
		this.sow_deliverables = sow_deliverables;
	}
	public String getConsultant_location() {
		return consultant_location;
	}
	public void setConsultant_location(String consultant_location) {
		this.consultant_location = consultant_location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getClient_requirement_name() {
		return client_requirement_name;
	}
	public void setClient_requirement_name(String client_requirement_name) {
		this.client_requirement_name = client_requirement_name;
	}
	public String getIs_deliverbales_in_current_week() {
		return is_deliverbales_in_current_week;
	}
	public void setIs_deliverbales_in_current_week(String is_deliverbales_in_current_week) {
		this.is_deliverbales_in_current_week = is_deliverbales_in_current_week;
	}
	public String getConsultant_id() {
		return consultant_id;
	}
	public void setConsultant_id(String consultant_id) {
		this.consultant_id = consultant_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public InvestmentCreationRequest(Long investment_code, String investment_name, String investment_type,
			Integer sow_no, String sow_name, String sow_deliverables, String consultant_location, String location,
			String client_requirement_name, String is_deliverbales_in_current_week, String consultant_id,
			String firstname, String lastname) {
		super();
		this.investment_code = investment_code;
		this.investment_name = investment_name;
		this.investment_type = investment_type;
		this.sow_no = sow_no;
		this.sow_name = sow_name;
		this.sow_deliverables = sow_deliverables;
		this.consultant_location = consultant_location;
		this.location = location;
		this.client_requirement_name = client_requirement_name;
		this.is_deliverbales_in_current_week = is_deliverbales_in_current_week;
		this.consultant_id = consultant_id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "InvestmentCreationRequest [investment_code=" + investment_code + ", investment_name=" + investment_name
				+ ", investment_type=" + investment_type + ", sow_no=" + sow_no + ", sow_name=" + sow_name
				+ ", sow_deliverables=" + sow_deliverables + ", consultant_location=" + consultant_location
				+ ", location=" + location + ", client_requirement_name=" + client_requirement_name
				+ ", is_deliverbales_in_current_week=" + is_deliverbales_in_current_week + ", consultant_id="
				+ consultant_id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

}
