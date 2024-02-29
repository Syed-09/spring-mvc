package com.training.springmvc.service;

import com.training.springmvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts = new ArrayList<>();

    List<Product> getAllProducts();
}
