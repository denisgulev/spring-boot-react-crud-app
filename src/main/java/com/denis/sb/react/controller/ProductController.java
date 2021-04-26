package com.denis.sb.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.denis.sb.react.entity.Product;
import com.denis.sb.react.repository.ProductRepository;
import com.denis.sb.react.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	/*@Autowired
	ProductService productService;

	@GetMapping("/products")
	public List<Product> findAll() {
		return productService.getAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> findProductByIf(@PathVariable String id) {
		return productService.getById(id).isPresent() ? 
				new ResponseEntity<>(productRepository.findById(id).get(), HttpStatus.OK) :
					new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}*/
	
	@PostMapping(value = "/products", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Product postProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	/*
	@PatchMapping(value = "/products/{id}", consumes = "application/json")
	public Product patchProduct(@PathVariable String id, @RequestBody Product patch) {
		Product product = productService.getById(id).get();
		
		if (patch.getBrand() != null) {
			product.setBrand(patch.getBrand());
		}
		if (patch.getDescription() != null) {
			product.setDescription(patch.getDescription());
		}
		if (patch.getName() != null) {
			product.setName(patch.getName());
		}
		if (patch.getType() != null) {
			product.setType(patch.getType());
		}
		
		return productService.save(product);
	}
	
	@DeleteMapping("/products/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable String id) {
		try {
			productService.delete(id);
		} catch (EmptyResultDataAccessException e) {
			System.out.println(e);
		}
		
	}*/
}
