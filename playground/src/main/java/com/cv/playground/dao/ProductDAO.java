package com.cv.playground.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import com.cv.playground.model.Product;
import com.cv.playground.repositories.ProductRepository;

public class ProductDAO {
	@Autowired
	private ProductRepository repository;

	public List<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public Product getProduct(ObjectId id) {
	    return repository.findBy_id(id);
	}

}
