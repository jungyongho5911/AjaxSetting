package com.project.web.person;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component

public class UserDTO {
	private String userid,password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
