package com.example.demo.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Repo_API;
import com.example.demo.entity.Contact2;

@Service
public class Contact2Service  {

	@Autowired
	private Repo_API repo;
	
	
//================================================Method to add the Form Details============================================================//	
	
	public Contact2 addForm(Contact2 c)
	{
		
		return repo.save(c);
	}
	
//================================================Method to get the Form Details============================================================//	
	
	
    public ResponseEntity<List<Contact2>> getAll(){
		
		List<Contact2> conlist=new ArrayList<>();
		repo.findAll().forEach(conlist::add);
		return new ResponseEntity<List<Contact2>>(conlist,HttpStatus.OK);
	}
	
  //================================================Method to delete the book============================================================//	
 
    public void deleteForm(int id)
	{

		repo.deleteById(id);
		
	}
    
//================================================Method to update the book============================================================//	

	public void updateForm(Contact2 conn,int id)
	{
		
		conn.setId(id);
		repo.save(conn);
		
	}

	
	
	
}
