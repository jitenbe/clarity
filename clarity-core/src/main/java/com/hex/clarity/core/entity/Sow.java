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
@Table(name="sow")
public class Sow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long sow_no;
	private String sow_name;

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

	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name = "sow_no") private Set<Investment> investments;
	 */

	/*
	 * public Set<Investment> getInvestments() { return investments; } public void
	 * setInvestments(Set<Investment> investments) { this.investments = investments;
	 * }
	 */
	@Override
	public String toString() {
		return "Sow [id=" + id + ", sow_no=" + sow_no + ", sow_name=" + sow_name + ", investments=" +  "]";
	}
}
