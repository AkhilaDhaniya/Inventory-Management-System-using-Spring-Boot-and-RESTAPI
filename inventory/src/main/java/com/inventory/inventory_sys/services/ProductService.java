package com.inventory.inventory_sys.services;

import com.inventory.inventory_sys.model.Product;
import com.inventory.inventory_sys.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo repo;     //Constuctor Injection

    public ProductService(ProductRepo repo){
        this.repo=repo;
    }

    public Product saveProduct(Product product){
        return repo.save(product);
    }

    public List<Product> getAllProduct(){
        return repo.findAll();  //return a List of Product objects
    }

    public Product getProductById(int Productid) {
        return repo.findById( Productid).orElse(null);
    }

    // DELETE
    public void deleteProduct(int Productid) {
        repo.deleteById(Productid);
    }
}
