package com.spring.rest.a8;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productRepository extends MongoRepository<Product,String>
{
//	List<Order>findByTitle(String title);
	//List<Order>findByPlaced(boolean placed);
}