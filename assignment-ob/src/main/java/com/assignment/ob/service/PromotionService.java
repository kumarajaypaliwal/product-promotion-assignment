package com.assignment.ob.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.assignment.ob.model.Product;
import com.assignment.ob.model.Promotion;

@Service
public class PromotionService {

    public List<Promotion> calculatePromotions(List<Product> products) {
        boolean hasProductA = false;
        int countB = 0, countC = 0, countD = 0;

        for (Product product : products) {
            if (isProductA(product)) {
                hasProductA = true;
            } else {
                switch (product.getId()) {
                    case "B":
                        countB++;
                        break;
                    case "C":
                        countC++;
                        break;
                    case "D":
                        countD++;
                        break;
                }
            }
        }

        List<Promotion> promotions = new ArrayList<>();
        int totalBC = countB + countC;

        if (!hasProductA) {
            if (totalBC == 0) {
                promotions.add(new Promotion("X", 0));
            } else if (totalBC == 1) {
                promotions.add(new Promotion("X", 0));
            } else if (totalBC > 1) {
                promotions.add(new Promotion("X", totalBC));
            }
        } else {
            if (totalBC == 0) {
                promotions.add(new Promotion("X", 0));
            } else if (totalBC == 1) {
                promotions.add(new Promotion("X", 1));
            } else if (totalBC > 1) {
                promotions.add(new Promotion("X", totalBC));
            }
        }

        if (countD == 0) {
            promotions.add(new Promotion("Y", 0));
        } else if (countD == 1) {
            promotions.add(new Promotion("Y", 1));
        } else if (countD > 1) {
            promotions.add(new Promotion("Y", countD));
        }
        return promotions;
    }

    private boolean isProductA(Product product) {
        return "A".equals(product.getId());
    }
}
