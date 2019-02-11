package com.cv.playground.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cv.playground.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	  Product findBy_id(ObjectId _id);
	}
