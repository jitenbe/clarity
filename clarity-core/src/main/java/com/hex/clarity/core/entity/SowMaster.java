package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sow_master")
public class SowMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "sow_id")
	private Long sowId;
	@Column(name = "procure_id")
	private Long procureId;
	@Column(name = "finance_id")
	private Long finaceId;
	@Column(name = "sow_name")
	private String sowName;

	public SowMaster() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSowId() {
		return sowId;
	}

	public void setSowId(Long sowId) {
		this.sowId = sowId;
	}

	public Long getProcureId() {
		return procureId;
	}

	public void setProcureId(Long procureId) {
		this.procureId = procureId;
	}

	public Long getFinaceId() {
		return finaceId;
	}

	public void setFinaceId(Long finaceId) {
		this.finaceId = finaceId;
	}

	public String getSowName() {
		return sowName;
	}

	public void setSowName(String sowName) {
		this.sowName = sowName;
	}

	@Override
	public String toString() {
		return "SowMaster [id=" + id + ", sowId=" + sowId + ", procureId=" + procureId + ", finaceId=" + finaceId
				+ ", sowName=" + sowName + "]";
	}

}
