package com.jbk.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.product.entity.Product;

@Repository
public interface ProductDao {
	
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
