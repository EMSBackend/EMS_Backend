package com.monocept.ems;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import java.sql.Connection;
import java.util.logging.Logger;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmsApplication implements CommandLineRunner {

	private static Logger logger = 
		Logger.getLogger(EmsApplication.class.getName());

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}


	
	@Override
	public void run(String ...args){
		try(Connection connection = dataSource.getConnection()){
			logger.info("Successful ---- Db Connection");
		}catch(Exception e){
			logger.warning("Failure :: Db connection :: "+e);
		}
	}

}
