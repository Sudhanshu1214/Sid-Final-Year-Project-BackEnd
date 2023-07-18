package com.sid.springboot.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Rest API")                 // to create the new table name
public class Rest {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Rest(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public Rest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Rest [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}
