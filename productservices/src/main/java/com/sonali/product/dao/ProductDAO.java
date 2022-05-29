package com.sonali.product.dao;

import com.sonali.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	Product read(int id);
	void update(Product product);
	void delete(int id);

}
