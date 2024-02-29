package com.training.springmvc.service;

import com.training.springmvc.dao.ProductDAO;
import com.training.springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDAO;
    public List<Product> getAllProducts() {
//        List<Product> prodList = new ArrayList<>();
//        prodList.add(new Product(101, "Laptop", "HP", 1000));
//        prodList.add(new Product(102, "Desktop", "Dell", 10000));
        List<Product> prodList = productDAO.getAllProducts();
        return prodList;
    }
}
