package com.denis.sb.react.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import com.denis.sb.react.entity.Product;
import com.denis.sb.react.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
	
	@Mock
	private ProductRepository productRepository;
	
	@InjectMocks
	private ProductService productService;
	
	@Test
	void savedProductHasId() {
		Product product = new Product("MOBO1", "Samsung A6 plus", "Mobile", "Samsung descr", "Samsung");
		when(productRepository.save(product)).then(new Answer<Object>() {
	         public Object answer(InvocationOnMock invocation) {
	        	 Product product = new Product("MOBO1", "Samsung A6 plus", "Mobile", "Samsung descr", "Samsung");
	             return product;
	         }
		});
	}

}
