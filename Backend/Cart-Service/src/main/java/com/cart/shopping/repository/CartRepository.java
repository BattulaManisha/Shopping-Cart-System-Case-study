package com.cart.shopping.repository;
import org.springframework.stereotype.Repository;

import com.cart.shopping.model.Cart;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CartRepository extends MongoRepository<Cart, Integer>{
	List<Cart> findById(int cartid);
}
