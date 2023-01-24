package com.javachinna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductService1Application {
@RequestMapping("/api")
@PostMapping("/")
String msg() {
	return "Hello welocome ";
}
	public static void main(String[] args) {
		SpringApplication.run(ProductService1Application.class, args);
	}

}
