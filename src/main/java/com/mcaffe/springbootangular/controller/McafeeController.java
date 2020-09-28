package com.mcaffe.springbootangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcaffe.springbootangular.entities.OrderEntity;
import com.mcaffe.springbootangular.entities.ProductEntity;
import com.mcaffe.springbootangular.service.DataService;

@RequestMapping("/api/v1")
@RestController
public class McafeeController {

	@Autowired
	DataService dataService;

	@GetMapping("/products")
	public List<ProductEntity> products() {

		List<ProductEntity> productList = dataService.fetchAllProducts();
		return productList;
	}

	@GetMapping("/orders")
	public List<OrderEntity> orders() {

		List<OrderEntity> orderList = dataService.fetchAllOrders();
		return orderList;
	}

}