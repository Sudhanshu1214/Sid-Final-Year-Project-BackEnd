//package com.example.demo.entity;
//
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
////@Table(name = "m_book")
//public class Book {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int bookId;
//	
//	private String bookName;
//	public int getBookId() {
//		return bookId;
//	}
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	@Override
//	public String toString() {
//		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
//	}
//	public Book(int bookId, String bookName) {
//		super();
//		this.bookId = bookId;
//		this.bookName = bookName;
//	}
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//}
