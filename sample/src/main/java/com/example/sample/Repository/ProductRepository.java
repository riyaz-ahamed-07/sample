package com.example.sample.Repository;

import com.example.sample.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
    
}
