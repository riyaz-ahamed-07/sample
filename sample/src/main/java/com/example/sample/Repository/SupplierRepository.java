package com.example.sample.Repository;

import com.example.sample.Entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, Integer> {
    
}
