package com.Shivam.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="journal")
public class JournalEntry {

	@Id
	
	private long id;
	
	private String tital;
	
	private String content;

	private LocalDateTime date;
	
	
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}




	public JournalEntry(long id, String tital, String content, LocalDateTime date) {
		super();
		this.id = id;
		this.tital = tital;
		this.content = content;
		this.date = date;
	}




	public LocalDateTime getDate() {
		return date;
	}




	public JournalEntry(long id, String tital, String content) {
		super();
		this.id = id;
		this.tital = tital;
		this.content = content;
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTital() {
		return tital;
	}

	public void setTital(String tital) {
		this.tital = tital;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "JournalEntry [id=" + id + ", tital=" + tital + ", content=" + content + "]";
	}

	

	public JournalEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
