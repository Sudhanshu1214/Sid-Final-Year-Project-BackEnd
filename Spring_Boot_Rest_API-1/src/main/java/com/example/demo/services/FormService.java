//package com.example.demo.services;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Repository.Repo_API;
////import com.example.demo.entity.Book;
//import com.example.demo.entity.Contact;
//
//@Service
//public class FormService {
//
//	
//	
//	
//	@Autowired
//	private Repo_API repo;
//	
//	
////================================================Method to add the Form Details============================================================//	
//
//	
//	public Contact addForm(Contact c)
//	{
//		
//		return repo.save(c);
//	}
//	
//	
//
////================================================Method to get the Form Details============================================================//	
//	
////	
////
////	public Contact getForm(int id)
////	{
////		return repo.findById(id).get();		
////	}
////	
////	
////	
//
//	public ResponseEntity<List<Contact>> getAll(){
//		
//		List<Contact> conlist=new ArrayList<>();
//		repo.findAll().forEach(conlist::add);
//		return new ResponseEntity<List<Contact>>(conlist,HttpStatus.OK);
//	}
//	
//	
//	
//	
////================================================Method to delete the book============================================================//	
//
//	
//		public void deleteForm(int id)
//		{
//
//			repo.deleteById(id);
//			
//		}
//
//		
//	//================================================Method to update the book============================================================//	
//
//		public void updateForm(Contact conn,int id)
//		{
//			
//			conn.setUserId(id);
//			repo.save(conn);
//			
//		}
//	
//	
//	
//	
//}
