package com.mvcspringer.mvc.domain.service.impl;

import com.mvcspringer.mvc.domain.model.Product;
import com.mvcspringer.mvc.domain.repository.ProductRepository;
import com.mvcspringer.mvc.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xirconias on 28/04/15.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
