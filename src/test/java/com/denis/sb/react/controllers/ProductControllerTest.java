package com.denis.sb.react.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.denis.sb.react.entity.Product;
import com.denis.sb.react.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

//@WebMvcTest(ProductController.class)
@SpringBootTest
public class ProductControllerTest {

	/*@Autowired
	private MockMvc mockMvc;*/
	
	@MockBean
	private ProductRepository productRepository;
	
	/*@Before(value = "")
	public void authorization() throws Exception {
		CustomUser user = new CustomUser();
		user.setUsername("denis");
		user.setPassword("denispass");
		
		mockMvc.perform(post("/auth/login")
				.content(asJsonString(user))
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}*/
	
	@WithMockUser(username = "denis")
	@Test
	public void testSave() throws Exception {
		Product product = new Product("MOBO1", "Samsung A6 plus", "Mobile", "Samsung descr", "Samsung");
		
		assertThat(productRepository.save(product)).isEqualTo(product);
		
		
	}
	
	public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
}
