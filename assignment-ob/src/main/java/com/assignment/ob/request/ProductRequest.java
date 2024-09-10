package com.assignment.ob.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.assignment.ob.model.Product;

public class ProductRequest {
    @NotNull
    @Size(min = 1)
    private List<@Valid Product> products;

    // Getters and setters

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}