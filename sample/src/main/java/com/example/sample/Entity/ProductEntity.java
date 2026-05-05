package com.example.sample.Entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer quantity;
    private Integer price;

    // @ManyToOne
    // @JoinColumn(name="supplier_id", nullable=false)
    // private SupplierEntity supplier;

}

