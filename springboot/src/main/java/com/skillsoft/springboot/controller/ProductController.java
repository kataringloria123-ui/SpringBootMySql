package com.skillsoft.springboot.controller;

import com.skillsoft.springboot.exception.ProductNotFoundException;
import com.skillsoft.springboot.model.Product;
import com.skillsoft.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/products/{pId}")
    public Product getProduct(@PathVariable int pId) {
        return productService.getProduct(pId).orElseThrow(() -> new ProductNotFoundException(pId));
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/products/{pId}")
    public void updateProduct(@PathVariable int pId, @RequestBody Product product) {
        productService.updateProduct(pId, product);
    }

    @DeleteMapping("/products/{pId}")
    public void deleteProduct(@PathVariable int pId) {
        productService.deleteProduct(pId);
    }
}
