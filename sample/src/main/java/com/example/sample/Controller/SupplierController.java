package com.example.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.sample.Service.SupplierService;
import com.example.sample.Entity.SupplierEntity;
import java.util.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class SupplierController {
    @Autowired
    private SupplierService service;

    @PostMapping("/supplier/add")
    public SupplierEntity add(@RequestBody SupplierEntity supplier) {
        return this.service.add(supplier);
    }

    @GetMapping("/supplier/get")
    public List<SupplierEntity> get() {
        return this.service.get();
    }

    @DeleteMapping("/supplier/del/{id}")
    public void del(@PathVariable Integer id) {
        this.service.del(id);
    }
}
