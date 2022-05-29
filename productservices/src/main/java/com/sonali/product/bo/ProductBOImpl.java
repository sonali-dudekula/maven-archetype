package com.sonali.product.bo;

import com.sonali.product.dao.ProductDAO;
import com.sonali.product.dao.ProductDAOImpl;
import com.sonali.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	private static ProductDAO dao = new ProductDAOImpl();
	
	
	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
