package com.lostline.webservices_nosql.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long timestemp;
	private Integer status;
	private String error;
	private String messege;
	private String path;

	public StandardError() {

	}

	public StandardError(Long timestemp, Integer status, String error, String messege, String path) {
		super();
		this.timestemp = timestemp;
		this.status = status;
		this.error = error;
		this.messege = messege;
		this.path = path;
	}

	public Long getTimestemp() {
		return timestemp;
	}

	public void setTimestemp(Long timestemp) {
		this.timestemp = timestemp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
