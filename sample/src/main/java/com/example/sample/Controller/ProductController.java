package com.example.sample.Controller;

import com.example.sample.Entity.ProductEntity;
import com.example.sample.Service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    
    @PostMapping("/products/add")
    public ProductEntity add(@RequestBody ProductEntity product) {
        return this.service.insert(product);
    }

    @GetMapping("/products/get") 
    public List<ProductEntity> get() {
        return this.service.get();
    }

    @DeleteMapping("/products/del/{id}")
    public void del(@PathVariable Integer id) {
        this.service.del(id);
    } 

    @PutMapping("/products/put/{id}")
    public ProductEntity put(@PathVariable Integer id, @RequestBody ProductEntity product) {
        return this.service.put(id, product);
    }
}
