package com.example.demo.Controller;

import java.util.List;
import java.util.function.Consumer;

//import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entity.Book;
//import com.example.demo.entity.Contact;
import com.example.demo.entity.Contact2;
import com.example.demo.entity.LoginRequest;
import com.example.demo.entity.LoginResponse;
import com.example.demo.entity.Login_Page;
import com.example.demo.services.Contact2Service;
import com.example.demo.services.LoginService;
//import com.example.demo.services.BookService;
//import com.example.demo.services.FormService;

@RestController
@CrossOrigin( allowedHeaders ="*" ,origins="http://localhost:4200")

//@CrossOrigin(origins  = "http://localhost:4200")
public class Controller {
	
	
//	@Autowired
//	private BookService bookService; 
@Autowired
 private Contact2Service contact2Service;

@Autowired
private LoginService loginService;

@Autowired
private JdbcTemplate jdbcTemplate;

////@Autowired
//private LoginRequest loginRequest;
//
////@Autowired
//private LoginResponse loginResponse;
	 
	
//	@RequestMapping("/api/{id}")
//	public Book Rest_API(@PathVariable("id") int id )
//	{	
//		System.out.println(id);
//		return bookService.getBook(id);
//	}
//	
	
	
	

//===============================================(=Method to get the book============================================================//	
	
	
//	@GetMapping("/api/{id}")
//	public Book getBook(@PathVariable("id") int id )
//	{	
//		return bookService.getBook(id);
//	}
	
	
	
// @GetMapping("/api/{id}")
//	public Contact getForm(@PathVariable("id") int id )
//	{	
//		return formService.getForm(id);
//	}
	
//================================================Method to get the Register Details by JDBC============================================================//	

	
//	@GetMapping("/sqlapiget")
//	public List<String> addLoginAcess(){
//		 
//		return loginService.addLoginAcess();
//	}

//@GetMapping("/sqlapiget")
//public ResponseEntity<List<Login_Page>> addLoginAcess(){
//	  
//	  return new ResponseEntity<>(null,HttpStatus.OK);
//}
//============================================================================================================//	


//@GetMapping("/sqlapiget")
//public ResponseEntity<List<Login_Page>> addLoginAcess(){
//	  
//	 List<Login_Page> sqldata= jdbcTemplate.query("select *from register_data", new BeanPropertyRowMapper(Login_Page.class));
//	  return new ResponseEntity<>(sqldata,HttpStatus.OK);
// }

@GetMapping("/sqlapiget")
public ResponseEntity<List<Login_Page>> getLoginAcess(){
	  
	return loginService.getLoginAcess();
 }

//@GetMapping("/getDataByEmail")
//public ResponseEntity<List<Login_Page>> getDatabyEmail(@RequestBody Login_Page conn, String loginEmail){
//	  
//		System.out.println(loginEmail);
//		return loginService.getDatabyEmail(conn,loginEmail);
//		
//}


//@PostMapping("/login")
//public LoginResponse login(@RequestBody LoginRequest loginRequest) {
//	
//	String loginusername = loginRequest.getLoginusername();
//	String loginpassword = loginRequest.getLoginpassword();
//	
//	String lpass=jdbcTemplate.queryForObject("SELECT password FROM users WHERE username = ?",new Object[] {loginusername},String.class);
//	
//	 boolean success = lpass != null && lpass.equals(loginpassword);
//	 return new LoginResponse(success);
//	 
//	 
//}
//


















	

//================================================Close============================================================//	

	
	
	@GetMapping("/apiget")
	public ResponseEntity<List<Contact2>> getAll(){
		 
		return contact2Service.getAll();
	}
	
	
	
	@GetMapping("/loginapiget")
	public ResponseEntity<List<Login_Page>> getLoginAll(){
		 
		return loginService.getLoginAll();
	}
	
	
	
	
	
	
//	
//	@GetMapping("/apiget/{id}")
//	public Contact getForm(@PathVariable("id") int id )
//	{	
//		return formService.getForm(id);
//	}
	
	
	

	
//================================================Method to add the book============================================================//	
	
//	
//	@PostMapping("/api")
// 	public Book addBook(@RequestBody Book book)
//	{
//		Book b=this.bookService.addBook(book);
//		System.out.println(b);
//		return b;	
//	}

	
	
//	@PostMapping("/apipost")
// 	public Contact addForm(@RequestBody Contact conn)
//	{
//		
//		Contact conn1=this.formService.addForm(conn);
//		System.out.println(conn1);
//		return conn1;	
//	}
	
	@PostMapping("/apipost")
 	public Contact2 addForm(@RequestBody Contact2 conn)
	{
		
		Contact2 conn1=this.contact2Service.addForm(conn);
		System.out.println(conn1);
		return conn1;	
	}
	
	
	@PostMapping("/loginapipost")
 	public Login_Page addLoginForm(@RequestBody Login_Page conn)
	{
		
		Login_Page conn1=this.loginService.addLoginForm(conn);
		System.out.println(conn1);
		return conn1;	
	}
	
//	@PostMapping("/loginAcess")
//	public Login_Page addLoginAcess(@RequestBody Login_Page conn)
//	{
//		Login_Page conn1=this.loginService.addLoginAcess(conn);
//		System.out.println(conn1);
//		return conn1;
//	}
//	
//	@PostMapping("/authenticate")
// 	public String AuthenticateUser(@RequestBody Login_Page conn) throws AuthenticationException
//	{
//		
//		return this.loginService.AuthenticateUser(conn);
//		
//	}
	
	
	
	
	
//================================================1st Method to delete the book============================================================//	

//	
//	@DeleteMapping("/api/{id}")
//	public void deleteBook(@PathVariable("id") int id )
//	{	
//	   bookService.deleteBook(id);
//	   System.out.println("deleted");
//	}
	
	
	
	
	

//	@DeleteMapping("/apidelete/{id}")
//	public void deleteForm(@PathVariable("id") int id )
//	{	
//	   formService.deleteForm(id);
//	   System.out.println("deleted");
//	}
	
	
	
	@DeleteMapping("/apidelete/{id}")
	public void deleteForm(@PathVariable("id") int id )
	{	
	   contact2Service.deleteForm(id);
	   System.out.println("deleted");
	}
	
	
	
	@DeleteMapping("/loginapidelete/{lid}")
	public void deleteloginForm(@PathVariable("lid") int lid )
	{	
		loginService.deleteloginForm(lid);
	   System.out.println("deleted");
	}
	
//================================================2nd Method to delete the book============================================================//	
	
	
//	@DeleteMapping("/api/{id}")
//	public String deleteBook(@PathVariable("id") int id )
//	{	
//	   bookService.deleteBook(id);
//	   return "Book deleted";
//	}




//================================================Method to update the book============================================================//	


   
//	@PutMapping("/api/{bookId}")
//    public void updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId)
//	{
//		this.bookService.updateBook(book,bookId);
//	}
	
	
//	
//	@PutMapping("/apiupdate/{FormId}")
//    public void updateForm(@RequestBody Contact conn,@PathVariable("FormId") int FormId)
//	{
//		this.formService.updateForm(conn,FormId);
//	}
	
	
	@PutMapping("/apiupdate/{id}")
    public void updateForm(@RequestBody Contact2 conn,@PathVariable("id") int id)
	{
		this.contact2Service.updateForm(conn,id);
		   System.out.println(id);

		   System.out.println("updated");

	}
	
	
	@PutMapping("/loginapiupdate/{lid}")
    public void updateloginForm(@RequestBody Login_Page conn,@PathVariable("lid") int lid)
	{
		this.loginService.updateloginForm(conn,lid);
		   System.out.println(lid);

		   System.out.println("updated");

	}


}


