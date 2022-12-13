package com.spring.rest.a5;


import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepo extends CrudRepository<Employee, Long>{

	Optional<Employee> findById(long id);

	void deleteById(long id);

	Iterable<Employee> findAll();

	void save(Employee emp);
	
}