package com.main.shopping.repository;

import org.springframework.stereotype.Repository;

import com.main.shopping.model.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{
	
	/*List<Product> findByproductId(int productid); */
}
