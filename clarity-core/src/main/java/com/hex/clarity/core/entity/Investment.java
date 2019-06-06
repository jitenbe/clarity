package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.HashSet;
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
import javax.persistence.Table;

@Entity
@Table(name = "investment")
public class Investment implements Serializable {

	public Investment() {
		super();
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long investment_code;
	private String investment_name;
	private String task_name;
	private String is_deliverable_in_current_week;
	// private Long sow_no;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
	        name="consultant_investment",
	        joinColumns= @JoinColumn(name="investment_id", referencedColumnName="id"),
     inverseJoinColumns= @JoinColumn(name="consultant_id", referencedColumnName="id")
	 )
	private Set<Consultant> consultants = new HashSet<>();

	/*
	 * @ManyToOne private Sow sow;
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInvestment_code() {
		return investment_code;
	}

	public Investment setInvestment_code(Long investment_code) {
		this.investment_code = investment_code;
		return this;
	}

	public String getInvestment_name() {
		return investment_name;
	}

	public Investment setInvestment_name(String investment_name) {
		this.investment_name = investment_name;
		return this;
	}

	public String getTask_name() {
		return task_name;
	}

	public Investment setTask_name(String task_name) {
		this.task_name = task_name;
		return this;
	}

	public String getIs_deliverable_in_current_week() {
		return is_deliverable_in_current_week;
	}

	public Investment setIs_deliverable_in_current_week(String is_deliverable_in_current_week) {
		this.is_deliverable_in_current_week = is_deliverable_in_current_week;
		return this;
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
	@Override
	public String toString() {
		return "Investment [id=" + id + ", investment_id=" + investment_code + ", investment_name=" + investment_name
				+ ", task_name=" + task_name + ", is_deliverable_in_current_week=" + is_deliverable_in_current_week
				+ ", sow_no=" + ", consultants=" + consultants + "]";
	}

}
