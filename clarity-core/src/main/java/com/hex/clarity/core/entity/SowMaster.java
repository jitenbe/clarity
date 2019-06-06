package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="sow_master")
public class SowMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long sow_no;
	private String sow_name;
	private String sow_deliverables;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSow_no() {
		return sow_no;
	}

	public void setSow_no(Long sow_no) {
		this.sow_no = sow_no;
	}

	public String getSow_name() {
		return sow_name;
	}

	public void setSow_name(String sow_name) {
		this.sow_name = sow_name;
	}
	@Override
	public String toString() {
		return "Sow [id=" + id + ", sow_no=" + sow_no + ", sow_name=" + sow_name + "]";
	}

	public String getSow_deliverables() {
		return sow_deliverables;
	}

	public void setSow_deliverables(String sow_deliverables) {
		this.sow_deliverables = sow_deliverables;
	}
}
