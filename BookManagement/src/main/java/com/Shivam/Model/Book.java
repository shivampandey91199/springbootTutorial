package com.Shivam.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String bookName;
	private String subject;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", subject=" + subject + "]";
	}
	public Book(long id, String bookName, String subject) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.subject = subject;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
