package com.spring.rest.a7;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface orderRepository extends MongoRepository<Order,String>
{

	List<Order> findAll();
//	List<Order>findByTitle(String title);
	//List<Order>findByPlaced(boolean placed);

	Order findOne(String id);

	//void save(Order order);

	void delete(String id);
}