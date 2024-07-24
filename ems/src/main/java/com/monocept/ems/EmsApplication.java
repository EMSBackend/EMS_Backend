package com.monocept.ems;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import java.sql.Connection;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmsApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}


	
	@Override
	public void run(String ...args){
		try(Connection connection = dataSource.getConnection()){
			System.out.println("Successful ---- Db Connection");
		}catch(Exception e){
			System.out.println("Failure ----	  Db connection :: "+e);
		}
	}

}
