package com.mvcspringer.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xirconias on 28/04/15.
 */
@Controller
public	class	LoginController	{
    @RequestMapping(value="/login",	method	=	RequestMethod.GET)
    public	String	login()	{
        System.out.println("boooooo");
        return	"login";
    }

    @RequestMapping(value="/loginfailed",	method	=	RequestMethod.GET)
    public	String	loginerror(Model	model)	{
        model.addAttribute("error",	"true");
        return	"login";
    }

    @RequestMapping(value="/logout",	method	=	RequestMethod.GET)
    public	String	logout(Model model)	{
        return	"login";
    }
}
