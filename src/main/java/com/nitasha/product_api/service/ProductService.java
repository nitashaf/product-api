package com.nitasha.product_api.service;

import com.nitasha.product_api.exception.ResourceNotFoundException;
import com.nitasha.product_api.model.Product;
import com.nitasha.product_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll()               { return repo.findAll(); }
    public Product getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }
    public Product save(Product p)              { return repo.save(p); }
    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Product not found with id: " + id);
        }
        repo.deleteById(id);
    }
}