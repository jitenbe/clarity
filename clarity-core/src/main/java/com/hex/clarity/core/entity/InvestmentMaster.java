package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Investment_Master")
@AttributeOverride(name="createDate", column = @Column(name="investment_entry_date"))
public class InvestmentMaster extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String investment_code;
	private String investment_name;
	private String investment_type;
	private String client_requirement_name;
	private String is_deliverbales_in_current_week;

	
	public Long getId() {
		return id;
	}

	public InvestmentMaster() {
		super();
	}

	public InvestmentMaster(Long id, Calendar createDate) {
		super(id, createDate);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvestment_code() {
		return investment_code;
	}

	public void setInvestment_code(String investment_code) {
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

	@Override
	public String toString() {
		return "InvestmentMaster [id=" + id + ", investment_code=" + investment_code + ", investment_name="
				+ investment_name + ", investment_type=" + investment_type + ", client_requirement_name="
				+ client_requirement_name + ", is_deliverbales_in_current_week=" + is_deliverbales_in_current_week
				+ "]";
	}

}
