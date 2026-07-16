package com.skillsoft.springboot.service;

import com.skillsoft.springboot.model.Product;
import com.skillsoft.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.classfile.Opcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();

        productRepository.findAll().forEach(products::add);
        return products;
    }

    public Optional<Product> getProduct(int id) {
        return productRepository.findById(id);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(int id, Product product) {
        if(productRepository.findById(id).get() != null) {
            productRepository.save(product);
        }
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
