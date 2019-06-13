package com.hex.clarity.core.beans;

import java.io.Serializable;


public class SowRequestBean implements Serializable {

	public SowRequestBean() {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	private Long sowNo;
	private String sowName;
	private String financeId;
	private String procureIT;
	private Long projectMasterId;
	
	public Long getSowNo() {
		return sowNo;
	}
	public void setSowNo(Long sowNo) {
		this.sowNo = sowNo;
	}
	public String getSowName() {
		return sowName;
	}
	public void setSowName(String sowName) {
		this.sowName = sowName;
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
	public Long getProjectMasterId() {
		return projectMasterId;
	}
	public void setProjectMasterId(Long projectMasterId) {
		this.projectMasterId = projectMasterId;
	}
	@Override
	public String toString() {
		return "SowRequestBean [sowNo=" + sowNo + ", sowName=" + sowName + ", financeId=" + financeId + ", procureIT="
				+ procureIT + ", projectMasterId=" + projectMasterId + "]";
	}

}
