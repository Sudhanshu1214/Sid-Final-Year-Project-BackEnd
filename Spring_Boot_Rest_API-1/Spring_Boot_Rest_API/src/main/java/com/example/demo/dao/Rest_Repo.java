package com.example.demo.dao;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;

import com.sid.springboot.entity.Rest;


public interface Rest_Repo extends CrudRepository<Rest,Integer>{
		
	public Book findById(int id);
}
