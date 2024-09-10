package com.assignment.ob.request;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.assignment.ob.model.Product;

import java.util.List;

public class PromotionRequest {
    
    @NotBlank
    private String clientType;

    @NotNull
    @Size(min = 1)
    private List<@Valid Product> products;

    // Getters and setters

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}