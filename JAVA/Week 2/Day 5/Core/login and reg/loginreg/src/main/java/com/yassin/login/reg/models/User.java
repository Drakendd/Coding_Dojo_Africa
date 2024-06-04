package com.yassin.book.club.models;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long ud;
	
	@NotEmpty(message="UserName must not be empty")
	 @Size(min=2 , max=200, message=" UserName must be between 2 and 200 characters")
	 private String userName;
	@NotEmpty(message="Email must not be empety")
	@Email( message=" Please enter your valid email")
	 private String email;
	
	@NotEmpty
	@Size(min=8 , max=200, message=" Password must be between 2 and 200 characters")
	 private String password;
	
	@Transient
	@NotEmpty
	@Size(min=8 , max=200, message=" Confirm Password must match your Password")
	 private String confirmPassword;
	
	
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 @Column(updatable=false)
	 private  Date createdAt;
	 
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private  Date updatedAt;
	 
	 
	 //one to many ( owner same as mapped by many to one)
	 @OneToMany ( mappedBy="postedBy", fetch=FetchType.LAZY)
	 private List<Book> myBooks;


	public List<Book> getMyBooks() {
		return myBooks;
	}


	public void setMyBooks(List<Book> myBooks) {
		this.myBooks = myBooks;
	}


	public User() {
		super();
	}


	public Long getUd() {
		return ud;
	}


	public void setUd(Long ud) {
		this.ud = ud;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	

}
