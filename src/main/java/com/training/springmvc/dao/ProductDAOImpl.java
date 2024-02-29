package com.training.springmvc.dao;

import com.training.springmvc.dao.ProductDAO;
import com.training.springmvc.model.Product;
import com.training.springmvc.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.util.List;
@Repository //@component
public class ProductDAOImpl implements ProductDAO {


    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL_PRODUCTS = "select * from product";

    private final String SQL_INSERT_PRODUCT
            = "insert into product (prod_id, prod_name, prod_desc, price) values(?,?,?,?)";


    @Autowired
    public ProductDAOImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Product> getAllProducts() {

        return jdbcTemplate.query(SQL_GET_ALL_PRODUCTS,new ProductMapper());
    }

    @Override
    public void addProduct() {
        jdbcTemplate.query(SQL_INSERT_PRODUCT,new ProductMapper());
    }


}