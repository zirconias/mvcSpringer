package com.mvcspringer.mvc.controller;

import com.mvcspringer.mvc.domain.model.Product;
import com.mvcspringer.mvc.domain.service.CustomerService;
import com.mvcspringer.mvc.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by xirconias on 28/04/15.
 */
@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
        model.addAttribute("products",
                productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/filter/{ByCriteria}")
    public	String	getProductsByFilter(@MatrixVariable(pathVar="ByCriteria") Map<String,List<String>> filterParams,Model	model)	{
        model.addAttribute("products",
                productService.getProductsByFilter(filterParams));
        return	"products";
    }

    @RequestMapping("/product")
    public	String	getProductById(@RequestParam("id")	String	productId,Model	model)	{
        model.addAttribute("product",productService.getProductById(productId));
        return	"product";
    }

    @RequestMapping("/{category}/{price}")
    public String filterProducts(Model model,
                                 @PathVariable("category") String category,
                                 @MatrixVariable(pathVar = "price") Map<String,List<String>> filterParams,
                                 @RequestParam("manufacturer") String manufacturer){

        Set<Product> products =new HashSet<>();
        Set price = productService.getProductsByPriceFilter(filterParams);
        List cat = productService.getProductsByCategory(category);
        List man = productService.getProductsByManufacturer(manufacturer);

        products = price;
        products.retainAll(cat);
        products.retainAll(man);

        model.addAttribute("products",products);
        return "products";
    }

    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct){
        return	"addProduct";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct") Product newproduct,BindingResult result){
        String[]	suppressedFields	=	result.getSuppressedFields();
        if	(suppressedFields.length	>	0)	{
            throw	new	RuntimeException("Attempting	to	bind	disallowed	fields:	"
                    +	StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }
        productService.addProduct(newproduct);
        return "redirect:/products";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder){
        binder.setDisallowedFields("unitsInOrders","discontinued");
    }
}
