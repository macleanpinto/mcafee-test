package com.mcaffe.springbootangular.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mcaffe.springbootangular.entities.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, String> {
	List<OrderEntity> findAll();

}