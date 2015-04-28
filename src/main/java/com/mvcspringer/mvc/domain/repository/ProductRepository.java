package com.mvcspringer.mvc.domain.repository;

import com.mvcspringer.mvc.domain.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xirconias on 28/04/15.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    Product	getProductById(String	productID);
    List<Product> getProductsByCategory(String category);
    List <Product> getProductsByManufacturer(String manufacturer);
    Set<Product> getProductsBypriceFilter(Map<String, List<String>> filterParams);
    Set<Product> getProductsByFilter(Map<String,List<String>> filterParams);
    void addProduct(Product	product);
}
