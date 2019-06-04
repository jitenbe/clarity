package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="investment")
public class Investment implements Serializable {

	public Investment() {
		super();
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long investment_id;
	private String investment_name;
	private String task_name;
	private String is_deliverable_in_current_week;
	//private Long sow_no;
	private String consultant_id;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "consultant_investment",joinColumns = {@JoinColumn(name ="investment_id",nullable = true)},
	inverseJoinColumns = {@JoinColumn(name = "consultant_id",nullable = true)})
	private Set<Consultant> consultants;

	/*
	 * @ManyToOne private Sow sow;
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getInvestment_id() {
		return investment_id;
	}
	public void setInvestment_id(Long investment_id) {
		this.investment_id = investment_id;
	}
	public String getInvestment_name() {
		return investment_name;
	}
	public void setInvestment_name(String investment_name) {
		this.investment_name = investment_name;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getIs_deliverable_in_current_week() {
		return is_deliverable_in_current_week;
	}
	public void setIs_deliverable_in_current_week(String is_deliverable_in_current_week) {
		this.is_deliverable_in_current_week = is_deliverable_in_current_week;
	}
	
	
	public Set<Consultant> getConsultants() {
		return consultants;
	}
	public void setConsultants(Set<Consultant> consultants) {
		this.consultants = consultants;
	}
	
	
	
	/*
	 * public Sow getSow() { return sow; } public void setSow(Sow sow) { this.sow =
	 * sow; }
	 */
	public String getConsultant_id() {
		return consultant_id;
	}
	public void setConsultant_id(String consultant_id) {
		this.consultant_id = consultant_id;
	}
	@Override
	public String toString() {
		return "Investment [id=" + id + ", investment_id=" + investment_id + ", investment_name=" + investment_name
				+ ", task_name=" + task_name + ", is_deliverable_in_current_week=" + is_deliverable_in_current_week
				+ ", sow_no=" +   ", consultants=" + consultants + "]";
	}
	

}
