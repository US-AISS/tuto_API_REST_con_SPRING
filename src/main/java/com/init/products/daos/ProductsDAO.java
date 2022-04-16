package com.init.products.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.init.products.entities.Product;

public interface ProductsDAO extends JpaRepository<Product, Long> {
	
	

}
