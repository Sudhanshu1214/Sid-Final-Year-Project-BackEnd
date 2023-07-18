package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
//
//import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Login_Repo;
import com.example.demo.entity.Login_Page;

@Service
public class LoginService {
	
	
	@Autowired
	private Login_Repo lrepo;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
//================================================Method to check the login Form Details============================================================//	
//			public String AuthenticateUser(Login_Page c) throws AuthenticationException
//			{
//				
//				BCryptPasswordEncoder bCrypt=new BCryptPasswordEncoder();
//				Optional<Login_Page> opUser =lrepo.findAllById(c.getLname());
//				if(opUser.isPresent())
//				{
//					Login_Page dbUser=opUser.get();
//					if(bCrypt.matches(c.getLpass(),dbUser.getLpass()))
//							return "Authentication User";
//					else
//							return "Incorrect Password";
//				}
//				throw new AuthenticationException("No user is not found for this username");
//				
////				return lrepo.save(c);
//			}
//		
	
	

	
	
//================================================Method to add the Form Details============================================================//	
	
//		public Login_Page addLoginForm(Login_Page c)
//		{
//			BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
//			String encryptPass=bcrypt.encode(c.getLpass());
//			c.setLpass(encryptPass);
//			return lrepo.save(c);
//		}
		
	public Login_Page addLoginForm(Login_Page c)
	{
		
		return lrepo.save(c);
	}
	
		
//================================================Method to get the Register Details by JDBC============================================================//	

//		  public List<String> addLoginAcess() {
//			  
//			  List<String> sqlList=new ArrayList<>();
//			  sqlList.addAll(jdbcTemplate.queryForList("SELECT lpass FROM register_data",String.class));
//			  return sqlList;
//			  
//		  }
		  
		 public ResponseEntity<List<Login_Page>> getLoginAcess(){
			  
			 List<Login_Page> sqldata= jdbcTemplate.query("select * from register_data", new BeanPropertyRowMapper(Login_Page.class));
			  return new ResponseEntity<>(sqldata,HttpStatus.OK);
		  }
		 
		 
		 
//		 
//		 public ResponseEntity<List<Login_Page>> getDatabyEmail(Login_Page conn,String loginEmail){
//			  
//			 List<Login_Page> sql= jdbcTemplate.query("select * from register_data where lemail="+loginEmail, new BeanPropertyRowMapper(Login_Page.class));
//			  return new ResponseEntity<>(sql,HttpStatus.OK);
//		  }
////		 
		
//		  
		  
		  
//================================================Close============================================================//	
		    
		
//================================================Method to get the Form Details============================================================//	
		
		
	    public ResponseEntity<List<Login_Page>> getLoginAll(){
			
			List<Login_Page> conlist=new ArrayList<>();
			lrepo.findAll().forEach(conlist::add);
			return new ResponseEntity<List<Login_Page>>(conlist,HttpStatus.OK);
		}
	    
	    
	
//================================================Method to delete the book============================================================//	
	    
	    public void deleteloginForm(int lid)
		{

			lrepo.deleteById(lid);
			
		}
	    	    
//================================================Method to update the book============================================================//	

		public void updateloginForm(Login_Page conn,int lid)
		{
			
			conn.setLid(lid);
			lrepo.save(conn);
			
		}
    
		
		
		
		
		
		
		
}
