package com.lab.Attendance_System.controller;

import org.hibernate.validator.constraints.NotBlank;

public class SearchCriteria {
	String username	;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
