package org.jsp.bellcurve;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BellCurveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BellCurveApplication.class, args);
		
	}
	
	@GetMapping
	public String Hello() {
		return "Hello word";
	}

}
