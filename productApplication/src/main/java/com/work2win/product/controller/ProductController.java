package com.work2win.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.product.model.Product;
import com.work2win.product.repository.ProductRepository;

@CrossOrigin
@RestController
@RequestMapping(value="/")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("products")
	public List<Product> getProducts(){
		return productRepository.findAll();
	}

}
