package com.example.mongo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.dto.ProductDTO;
import com.example.mongo.entity.Product;
import com.example.mongo.repository.MangoMistRespository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	@Autowired
	MangoMistRespository repository;
	
	public Mono<Product> create(ProductDTO dto)
	{
		Product product = new Product();
		BeanUtils.copyProperties(dto, product);
		return repository.save(product);
	}
	
	public Flux<Product> getAll()
	{
		return repository.findAll();
	}

}
