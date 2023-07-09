package com.example.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.dto.ProductDTO;
import com.example.mongo.entity.Product;
import com.example.mongo.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/products")
	public ResponseEntity<Mono<Product>> create(@RequestBody ProductDTO dto) {
		return new ResponseEntity<>(service.create(dto), HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<Flux<Product>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}

}
