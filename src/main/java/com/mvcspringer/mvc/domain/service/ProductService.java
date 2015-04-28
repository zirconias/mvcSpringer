package com.mvcspringer.mvc.domain.service;

import com.mvcspringer.mvc.domain.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xirconias on 28/04/15.
 */
public interface ProductService {

    Product getProductById(String productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByManufacturer(String manufacturer);
    Set<Product> getProductsByFilter(Map<String,	List<String>> filterParams);
    Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams);
}
