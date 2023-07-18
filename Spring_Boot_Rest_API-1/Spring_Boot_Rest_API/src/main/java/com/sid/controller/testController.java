package com.sid.controller;


import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.springboot.Service.BookService;
import com.sid.springboot.entity.Rest;

//@RestController
////@Controller                    
//public class testController {
//	
//	//@RequestMapping(value="/RestAPI", method=RequestMethod.GET)
//	
//	
//	@Autowired
//	private BookService bookService;
//	
//	
////-------------------------------------------------------------------------------------//	
//	
//	@GetMapping("/rest1")
//	public List<Rest> getBooks(){
//		
//		return this.bookService.getAllBooks();
//		}
//	//@ResponseBody                        In the case of Using @RestController , we don't need to use the @ResponseBody 
////	public Rest REST_API() {
//		
//		
////		Rest rest=new Rest();
////		rest.setId(1);
////		rest.setTitle("Power of the Unconsiuos mind...");
////		rest.setAuthor("Sid Rajput");
////		
//		
//	
////--------------------------------------------------------------------------------------//
//	
//	
//	@PostMapping("/rest1")
//	public Rest addBook(@RequestBody Rest rest)
//	{
//		Rest b=this.bookService.addBook(rest);
//		System.out.println(b);
//		return b;
//		
//	}
//	
////-------------------------------------------------------------------------------------------//
//	
//
//	@DeleteMapping("/rest1/{bookId}")
//	public void deleteBook(@PathVariable("bookId") int bookId)
//	{
//		this.bookService.deleteBook(bookId);
//		
//	}
//	
//// -----------------------------------------------------------------------------------------//
//	@PutMapping("/rest1/{bookId}")
//	public Rest updateBook(@RequestBody Rest book,@PathVariable("bookId") int bookId)
//	{
//		this.bookService.updateBook(book,bookId);
//		return book;
//	}
//	
//}


@Controller
public class testController {
	
	@RequestMapping("/hey")
	@ResponseBody
	public String Controller()
	{	
		System.out.println("Hey Bro!!!!");
		return "This is a controller";
	
	}

}








