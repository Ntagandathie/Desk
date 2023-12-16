package com.ntaganda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class TravelWebAppApplication {

	/*@ResponseBody
	@RequestMapping("/")
	String demo(){
		return "My Spring boot App";
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(TravelWebAppApplication.class, args);
	}
}
