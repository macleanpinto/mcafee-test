package com.mcaffe.springbootangular.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mcaffe.springbootangular.entities.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, String> {

	List<ProductEntity> findAll();

}