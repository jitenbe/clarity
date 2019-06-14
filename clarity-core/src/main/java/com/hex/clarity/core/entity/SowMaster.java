package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "sow_master")
public class SowMaster implements Serializable {
	public SowMaster() {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sow_master_id")
	private Long sowMasterId;
	@Column(name = "sow_no")
	private Long sowNo;
	@Column(name = "sow_name")
	private String sowName;
	@Column(name = "finance_id")
	private String financeId;
	@Column(name = "procure_IT")
	private String procureIT;

	@Transient
	private Long projectMasterId;

	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="sow_master_id")
	private List<InvestmentMaster> investments=new ArrayList<>();
	
	public String getSowName() {
		return sowName;
	}

	public void setSowName(String sowName) {
		this.sowName = sowName;
	}

	public Long getSowNo() {
		return sowNo;
	}

	public void setSowNo(Long sowNo) {
		this.sowNo = sowNo;
	}

	public String getFinanceId() {
		return financeId;
	}

	public void setFinanceId(String financeId) {
		this.financeId = financeId;
	}

	public String getProcureIT() {
		return procureIT;
	}

	public void setProcureIT(String procureIT) {
		this.procureIT = procureIT;
	}

	public Long getSowMasterId() {
		return sowMasterId;
	}

	public void setSowMasterId(Long sowMasterId) {
		this.sowMasterId = sowMasterId;
	}

	public Long getProjectMasterId() {
		return projectMasterId;
	}

	public void setProjectMasterId(Long projectMasterId) {
		this.projectMasterId = projectMasterId;
	}

	public List<InvestmentMaster> getInvestments() {
		return investments;
	}

	public void setInvestments(List<InvestmentMaster> investments) {
		this.investments = investments;
	}

	@Override
	public String toString() {
		return "SowMaster [sowMasterId=" + sowMasterId + ", sowNo=" + sowNo + ", sowName=" + sowName + ", financeId="
				+ financeId + ", procureIT=" + procureIT + "]";
	}

}
