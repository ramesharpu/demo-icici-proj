package com.icicibank.demo_icici_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoIciciProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIciciProjApplication.class, args);//from x1 branch.
	}
	
	@GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello There!!! Welcome to my project</h1>");
    }

}
