package com.example.sample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.Entity.SupplierEntity;  
import com.example.sample.Repository.SupplierRepository;  
import java.util.*;
@Service
public class SupplierService {
    @Autowired
    private SupplierRepository repo;

    public SupplierEntity add(SupplierEntity supplier) {
        return this.repo.save(supplier);
    }

    public List<SupplierEntity> get() {
        return repo.findAll();
    }

    public void del(Integer id) {
        repo.deleteById(id);
    }
}
