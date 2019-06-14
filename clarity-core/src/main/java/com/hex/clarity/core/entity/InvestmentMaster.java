package com.hex.clarity.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "investment_master")

public class InvestmentMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	public InvestmentMaster() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "investment_master_id")
	private Long investmentMasterId;
	@Column(name = "investment_code")
	private String investmentCode;
	@Column(name = "investment_name")
	private String investmentName;
	@Column(name = "investment_type")
	private String investmenType;

	@Transient
	private Long sowMasterId;

	public Long getInvestmentMasterId() {
		return investmentMasterId;
	}

	public void setInvestmentMasterId(Long investmentMasterId) {
		this.investmentMasterId = investmentMasterId;
	}

	public String getInvestmentCode() {
		return investmentCode;
	}

	public String getInvestmentName() {
		return investmentName;
	}

	public void setInvestmentName(String investmentName) {
		this.investmentName = investmentName;
	}

	public String getInvestmenType() {
		return investmenType;
	}

	public void setInvestmenType(String investmenType) {
		this.investmenType = investmenType;
	}

	public void setInvestmentCode(String investmentCode) {
		this.investmentCode = investmentCode;
	}

	public Long getSowMasterId() {
		return sowMasterId;
	}

	public void setSowMasterId(Long sowMasterId) {
		this.sowMasterId = sowMasterId;
	}

	@Override
	public String toString() {
		return "InvestmentMaster [investmentMasterId=" + investmentMasterId + ", investmentCode=" + investmentCode
				+ ", investmentName=" + investmentName + ", investmenType=" + investmenType + ", sowMasterId="
				+ sowMasterId + "]";
	}

}
