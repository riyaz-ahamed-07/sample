package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sample.Entity.sampleEntity;

public interface sampleRepository extends JpaRepository<sampleEntity, Integer> {
    
}
