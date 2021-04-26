package com.denis.sb.react.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.denis.sb.react.entity.Product;
import com.denis.sb.react.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;
	
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
	public Optional<Product> getById(String id) {
		return productRepository.findById(id);
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public void delete(String id) {
		productRepository.deleteById(id);
	}
	
}
