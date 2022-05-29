package com.sonali.product.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonali.product.dto.Product;

class ProductDAOImplTest {

	@Test
	void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Rolls-Royce");
		product.setDescription("It's my current favourite");
		product.setPrice(120000);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Rolls-Royce", result.getName());
		
	}

}
