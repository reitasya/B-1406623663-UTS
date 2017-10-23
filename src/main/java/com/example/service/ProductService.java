package com.example.service;

import java.util.List;

import com.example.model.ProductModel;


public interface ProductService {

	
	ProductModel selectProduct(int id_product);
	List<ProductModel> selectAllProducts ();
	

}
