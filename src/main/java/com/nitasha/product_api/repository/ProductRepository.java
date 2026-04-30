package com.nitasha.product_api.repository;

import com.nitasha.product_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository gives you findAll, findById, save, deleteById for free
}