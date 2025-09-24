package com.inventory.inventory_sys.model;


import jakarta.persistence.* ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="product")
@Data   // Lombok: generates getters, setters, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Productid")   // matches your DB column exactly
    private Integer Productid;

    @Column(name="ProductName", nullable=false, length=20)
    private String ProductName;

    @Column(name="CostPrice", nullable = true)
    private Double CostPrice;

    @Column(name="SellingPrice", nullable = true)
    private Double SellingPrice;

    @Column(name="Brand", length=50)
    private String Brand;

    @CreationTimestamp
    @Column(name="date")
    private LocalDateTime date;

    @Column(name="quantity")
    private int quantity;

    @Column(name="pid")
    private int pid;

    @Column(name="is_active")
    private int is_active;
}

