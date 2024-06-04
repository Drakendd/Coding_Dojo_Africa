package com.yassin.book.club.models;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	
	@NotEmpty
	@Size(min=2 , max=200, message=" Title must be between 2 and 200 characters")
	 private String title;
	
	@NotEmpty
	@Size(min=2 , max=200, message=" authorname must be between 2 and 200 characters")
	 private String authorname;
	
	@NotEmpty
	@Size(min=2 , max=200, message=" thoughts must be between 2 and 200 characters")
	 private String thoughts;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(updatable=false)
	 private  Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	 private  Date updatedAt;
	 //many to one 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="user_id")
	 private User postedBy;
	public Book() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
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
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	 
	
	 

	 
	
	

}
