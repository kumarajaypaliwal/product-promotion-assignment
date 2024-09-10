package com.assignment.ob.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.ob.model.Product;
import com.assignment.ob.model.Promotion;
import com.assignment.ob.request.PromotionRequest;
import com.assignment.ob.service.PromotionService;
import com.assignment.ob.exception.ProductValidationException;

@RestController
@RequestMapping("/api/promotions")
@Validated
public class PromotionController {
    
	private static final Logger logger = LoggerFactory.getLogger(PromotionController.class);

    @Autowired
    private PromotionService promotionService;

    @PostMapping("/products")
    public ResponseEntity<List<Promotion>> getPromotions(@RequestBody Map<String, List<@Valid Product>> payload) {
        List<Product> products = payload.get("products");

        // The following check may now be redundant due to @Valid annotations
        if (products == null || products.isEmpty()) {
            throw new ProductValidationException("Product list cannot be null or empty");
        }

        logger.info("Received request to calculate promotions for {} products", products.size());

        List<Promotion> promotions = promotionService.calculatePromotions(products);
        return ResponseEntity.ok(promotions);
    }

    @PostMapping("/client-products")
    public ResponseEntity<List<Promotion>> getPromotionsByFullRequest(@RequestBody @Valid PromotionRequest promotionRequest) {
        String clientType = promotionRequest.getClientType();
        List<Product> products = promotionRequest.getProducts();

        logger.info("Received request with clientType: {} and {} products", clientType, products.size());

        List<Promotion> promotions = promotionService.calculatePromotions(products);
        return ResponseEntity.ok(promotions);
    }
}