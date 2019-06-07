package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public abstract class BaseEntity implements Serializable {

	public BaseEntity() {
		super();
	}

	private static final long serialVersionUID = 1L;

	public BaseEntity(Long id, Calendar createDate) {
		super();
		this.id = id;
		this.createDate = createDate;
	}

	@Id
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	private Calendar createDate;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

}
