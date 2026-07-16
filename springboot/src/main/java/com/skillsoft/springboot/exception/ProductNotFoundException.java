package com.skillsoft.springboot.exception;

public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(int id) {
        super("Product with id " + id + " cannot not found");
    }
}
