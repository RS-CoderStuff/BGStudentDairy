package com.bitGallon.schoolDairyMgmt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author RavinderSingh-Coder
 *
 */

@ServletComponentScan
@SpringBootApplication
public class BGschoolDairyMgmtApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(BGschoolDairyMgmtApplication.class);	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BGschoolDairyMgmtApplication.class, args);
	}

}
