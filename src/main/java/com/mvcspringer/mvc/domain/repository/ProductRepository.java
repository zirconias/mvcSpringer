package com.mvcspringer.mvc.domain.repository;

import com.mvcspringer.mvc.domain.model.Product;

import java.util.List;

/**
 * Created by xirconias on 28/04/15.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    Product	getProductById(String	productID);
}
