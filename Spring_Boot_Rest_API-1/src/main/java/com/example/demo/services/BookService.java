//package com.example.demo.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Repository.Repo_API;
//import com.example.demo.entity.Book;
//
//
//@Service
//public class BookService {
//
//	@Autowired
//	private Repo_API repo;
//	
//    
////================================================Method to get the book============================================================//	
//
//	
//	public Book getBook(int id)
//	{
//		return repo.findById(id).get();		
//	}
//	
//	
////================================================Method to add the book============================================================//	
//	
//	
//	public Book addBook(Book b)
//	{
//		Book result=repo.save(b);
//		return result;
//		
//	}
//	
////================================================Method to delete the book============================================================//	
//
//	
//	public void deleteBook(int id)
//	{
//
//		repo.deleteById(id);
//		
//	}
//
//	
////================================================Method to update the book============================================================//	
//
//	public void updateBook(Book book,int id)
//	{
//		
//		book.setBookId(id);
//		repo.save(book);
//		
//	}
//	
//	
//	
//	
//	
//}
