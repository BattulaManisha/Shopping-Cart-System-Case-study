package com.main.shopping.repository;
import org.springframework.stereotype.Repository;

import com.main.shopping.model.Order;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{
	List<Order> findById(int orderid);
}

