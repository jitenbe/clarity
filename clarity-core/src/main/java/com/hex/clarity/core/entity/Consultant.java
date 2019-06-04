package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="consultant")

public class Consultant implements Serializable {
	
	public Consultant() {
		super();
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String consultant_id;
	private String first_name;
	private String last_name;
	private String location;
	private String investment_id;
	
	@ManyToMany(mappedBy = "consultants")
	private Set<Investment> investments;
	
	public Set<Investment> getInvestments() {
		return investments;
	}
	public void setInvestments(Set<Investment> investments) {
		this.investments = investments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConsultant_id() {
		return consultant_id;
	}
	public void setConsultant_id(String consultant_id) {
		this.consultant_id = consultant_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInvestment_id() {
		return investment_id;
	}
	public void setInvestment_id(String investment_id) {
		this.investment_id = investment_id;
	}
	@Override
	public String toString() {
		return "Consultant [id=" + id + ", consultant_id=" + consultant_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", location=" + location + ", investments=" + investments + "]";
	}
	
	
	
	
	

}
