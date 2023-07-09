package com.example.mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.mongo.entity.Product;

public interface MangoMistRespository extends ReactiveMongoRepository<Product, String> {

}
