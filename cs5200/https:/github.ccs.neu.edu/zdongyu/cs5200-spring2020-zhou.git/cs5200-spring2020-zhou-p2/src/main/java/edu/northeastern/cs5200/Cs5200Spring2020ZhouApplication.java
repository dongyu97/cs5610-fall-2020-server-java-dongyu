//package edu.northeastern.cs5200;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Cs5200Spring2020ZhouApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Cs5200Spring2020ZhouApplication.class, args);
//	}
//
//}
package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//if you face an error with above imports, try
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Cs5200Spring2020ZhouApplication
	extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder
		configure(SpringApplicationBuilder application) {
		return application.sources(
				Cs5200Spring2020ZhouApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(
				Cs5200Spring2020ZhouApplication.class, args);
	}
}