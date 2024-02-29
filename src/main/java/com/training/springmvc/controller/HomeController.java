package com.training.springmvc.controller;

import com.training.springmvc.model.Product;
import com.training.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    ProductService service;

    @RequestMapping(method = RequestMethod.GET)
    public String greet(Model model){
        List<Product> productList = service.getAllProducts();
        //give the same list name in home.jsp file
        model.addAttribute("productList", productList);
        //System.out.println(productList);
        return "home";
    }

    @RequestMapping(value="/addproduct", method = RequestMethod.POST)
    public String addproduct (Model model){
        List<Product> productList = service.getAllProducts();
        //give the same list name in home.jsp file
        model.addAttribute("productList", productList);
        //System.out.println(productList);
        return "home";
    }


}