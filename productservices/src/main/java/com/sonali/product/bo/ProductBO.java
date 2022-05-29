package com.sonali.product.bo;

import com.sonali.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);

}
