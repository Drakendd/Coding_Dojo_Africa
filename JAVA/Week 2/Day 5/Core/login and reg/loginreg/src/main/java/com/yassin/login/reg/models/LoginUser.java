package com.yassin.book.club.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginUser {
	@NotEmpty(message="Email must not be empety")
	@Email( message=" Please enter your valid email")
	 private String email;
	
	@NotEmpty
	@Size(min=8 , max=200, message=" Password must be between 2 and 200 characters")
	 private String password;

	public LoginUser() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
