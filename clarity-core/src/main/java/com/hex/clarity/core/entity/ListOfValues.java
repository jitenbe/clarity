package com.hex.clarity.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list_values")
public class ListOfValues implements Serializable {

	public ListOfValues() {
		super();
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String list_type;
	private String list_value;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getList_type() {
		return list_type;
	}

	public void setList_type(String list_type) {
		this.list_type = list_type;
	}

	public String getList_value() {
		return list_value;
	}

	public void setList_value(String list_value) {
		this.list_value = list_value;
	}
	
}
