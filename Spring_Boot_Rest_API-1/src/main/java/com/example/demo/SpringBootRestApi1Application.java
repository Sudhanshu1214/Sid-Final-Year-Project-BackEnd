package com.example.demo;

import org.springframework.boot.SpringApplication;
//import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class SpringBootRestApi1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApi1Application.class, args);
	}

}
