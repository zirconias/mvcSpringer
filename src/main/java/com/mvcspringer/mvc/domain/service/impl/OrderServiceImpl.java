package com.mvcspringer.mvc.domain.service.impl;

import com.mvcspringer.mvc.domain.model.Product;
import com.mvcspringer.mvc.domain.repository.ProductRepository;
import com.mvcspringer.mvc.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xirconias on 28/04/15.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, long quantity) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < quantity) {
            throw new IllegalArgumentException("Out	of	Stock.	Available	Units in	stock" + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() -  quantity);
    }

}
