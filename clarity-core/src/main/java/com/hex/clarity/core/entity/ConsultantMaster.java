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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consultant_master")

public class ConsultantMaster implements Serializable {

	public ConsultantMaster() {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String consultant_code;
	private String first_name;
	private String last_name;
	private String location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConsultant_code() {
		return consultant_code;
	}

	public void setConsultant_code(String consultant_code) {
		this.consultant_code = consultant_code;
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

	@Override
	public String toString() {
		return "Consultant [id=" + id + ", consultant_code=" + consultant_code + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", location=" + location + "]";
	}

}
