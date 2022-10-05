package com.jbk.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jbk.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean isAdded = false;
		try {
					session.save(product);
				transaction.commit();
				isAdded = true;
		} catch (Exception e) {
				e.printStackTrace();
		}finally {
			session.close();
		}
				
				
				
				
		return isAdded;
	}



	@Override
	public List<Product> getAllProduct() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<Product>	 products =		session.createCriteria(Product.class).list();
		session.close();
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> sortProducts(String sortby) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getMaxPriceProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double countSumOfProductPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCountOfProduct() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
