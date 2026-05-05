package com.example.sample.Entity;

// import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="supplier")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer supplier_id;

    private String name;
    private String company;
    private String contact;

    // @OneToMany
    // @JoinColumn(name="product_id", nullable=true)
    // private List<ProductEntity> products;

}

