package com.jbk.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jbk.product.entity.Product;

@Service
public interface ProductService {
	
	public boolean saveProduct(Product product);
	
     public List<Product> getAllProduct();
     
     public Product getProductById(int productId);
     
     public boolean deleteProduct(Product product);
     
     public boolean updateProduct(Product product);
     
     public List<Product> sortProducts(String sortby);
     
     public Product getMaxPriceProduct();
     
     public double countSumOfProductPrice();
     
     public int getTotalCountOfProduct();
     
     
}
