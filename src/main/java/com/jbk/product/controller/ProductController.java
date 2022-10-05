package com.jbk.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.product.entity.Product;
import com.jbk.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/saveProduct")
	public boolean saveProduct(Product product) {
		boolean isAdded = service.saveProduct(product);
		return isAdded;
	}
	
	@GetMapping("/getAllproduct")
	public List<Product> getAllProduct(){
		List<Product> allProduct = service.getAllProduct();
		return allProduct;
		
	}
}
