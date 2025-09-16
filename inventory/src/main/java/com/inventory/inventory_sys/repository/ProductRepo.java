package com.inventory.inventory_sys.repository;

import com.inventory.inventory_sys.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer>{
    /* Spring JPA gives you CRUD methods automatically */
}

