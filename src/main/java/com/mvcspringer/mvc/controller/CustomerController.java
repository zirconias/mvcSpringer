package com.mvcspringer.mvc.controller;

import com.mvcspringer.mvc.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xirconias on 28/04/15.
 */
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public String list(Model model) {
        model.addAttribute("customers",	customerService.getAllCustomers());
        return	"customers";
    }

}
