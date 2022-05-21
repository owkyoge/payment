package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

	private static Map<String, String> productRepo = new HashMap<>();
	int productid = 100;

	@PostMapping("/product")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product) {
	
		if (product.getId() != productid) {
			throw new ProductNotfoundException();

		}
		
		
		

		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	}

}
