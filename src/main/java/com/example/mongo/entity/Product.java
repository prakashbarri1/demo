package com.example.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;

@Data
@Document
public class Product {
	String name;
	Integer quantity;
	@MongoId
	String id;
}
