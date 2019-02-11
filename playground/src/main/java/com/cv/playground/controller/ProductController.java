package com.cv.playground.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cv.playground.dao.ProductDAO;
import com.cv.playground.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Product getProductById(@PathVariable("id") ObjectId id) {
		return productDAO.getProduct(id);
	}
	
}