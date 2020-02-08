package com.edu.cs.miu.product.productservice.service;

import com.edu.cs.miu.product.productservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product findById(String id);
    Product saveProduct(Product product);
    void deleteProduct(String id);
}
