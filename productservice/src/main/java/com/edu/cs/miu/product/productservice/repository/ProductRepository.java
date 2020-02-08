package com.edu.cs.miu.product.productservice.repository;

import com.edu.cs.miu.product.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
