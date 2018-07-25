package com.yuzf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YuzfPpgRememberApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuzfPpgRememberApplication.class, args);
	}
	
	@RequestMapping("/")
	public String first() {
		return "james harden";
	}
	
}
