package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductMapper;
import com.example.model.ProductModel;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class ProductServiceDatabase implements ProductService {
	@Autowired
    private ProductMapper productMapper;

    
    @Override
    public ProductModel selectProduct (int id_product)
    {
        log.info ("select product with id {}", id_product);
        return productMapper.selectProduct (id_product);
    }
    
    @Override
    public List<ProductModel> selectAllProducts ()
    {
        log.info ("select all products");
        return productMapper.selectAllProduct ();
    }

	
}
