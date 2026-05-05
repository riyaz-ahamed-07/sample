package com.example.sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.Entity.ProductEntity;
import com.example.sample.Repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public ProductEntity insert(ProductEntity product) {
        return repo.save(product);
    }

    public List<ProductEntity> get() {
        return this.repo.findAll();
    }

    public void del(Integer id) {
        repo.deleteById(id);
    }

    public ProductEntity put(Integer id, ProductEntity product) {
        ProductEntity existing = repo.findById(id).orElseThrow();
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setQuantity(product.getQuantity());
        return repo.save(existing);
    }
    
}
