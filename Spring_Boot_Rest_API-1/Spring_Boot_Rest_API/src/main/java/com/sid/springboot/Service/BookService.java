package com.sid.springboot.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Rest_Repo;
import com.sid.springboot.entity.Rest;

@Component
//@Service
public class BookService {
	
	
	@Autowired
	private Rest_Repo Restrepo;
	
		
//	private static List<Rest> list=new ArrayList<>();
//	
//	
//	static {
//	
//	list.add(new Rest(2,"java Cources","XYZ"));
//	list.add(new Rest(3,"java Cources","XYZ"));
//	list.add(new Rest(4,"java Cources","XYZ"));
//	
//	}
//	
//	//-----------------------------------------------------------------------------------------//
//	
//	
//	// get all books
//	
	
	
//	public List<Rest> getAllBooks(){
//		List<Book> list=(List<Book>)this.Restrepo.findAll();
//		return list;
//	}
	
////-----------------------------------------------------------------------------------------------//
//	
//	// get book by id
//	
	public Book getRestByID(int id)
	{
		Book rest=null;
//		rest=list.stream().filter(e->e.getId()==id).findFirst().get();
//		return rest;
		try {
			rest=this.Restrepo.findById(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rest;
		
   }
//	
//	
////---------------------------------------------------------------------------------------------------//
//
//	//add the books by the post method(@postmapping)
//
	public Rest addBook(Rest b) {
		
		Rest result=Restrepo.save(b);
		return result;
	}
//	
//	
////---------------------------------------------------------------------------------------//
//	
//	// delete the book by the delete method(@Deletemapping)
	public void deleteBook(int bid)
	{
//		
//		list=list.stream().filter(book->{
//			if(book.getId()!=bid)
//			{
//				return true;
//			}
//			return false;
//		}).collect(Collectors.toList());
		Restrepo.deleteById(bid);
	}
//	
//	
////--------------------------------------------------------------------------------------//
//	
//	// update the book id by put method
//	
	public void updateBook(Rest book,int bookId)
	{
//		
//	    list=list.stream().map(b->{
//	    	if(b.getId()==bookId)
//	    	{
//	    		b.setTitle(book.getTitle());
//	    		b.setAuthor(book.getAuthor());
//	    	}
//	    	return b;
//	    }).collect(Collectors.toList());
		book.setId(bookId);
		Restrepo.save(book);
		
	}
//	
//	
//	
	
}
