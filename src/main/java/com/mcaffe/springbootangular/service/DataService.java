package com.mcaffe.springbootangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcaffe.springbootangular.entities.OrderEntity;
import com.mcaffe.springbootangular.entities.ProductEntity;
import com.mcaffe.springbootangular.repository.OrderRepository;
import com.mcaffe.springbootangular.repository.ProductRepository;

@Service
public class DataService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	public List<ProductEntity> fetchAllProducts() {
		return productRepository.findAll();
	}

	public List<OrderEntity> fetchAllOrders() {
		return orderRepository.findAll();
	}

}