package com.mvcspringer.mvc.controller;

import com.mvcspringer.mvc.domain.repository.ProductRepository;
import com.mvcspringer.mvc.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xirconias on 28/04/15.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products",	productService.getAllProducts());
        return	"products";
    }
}
