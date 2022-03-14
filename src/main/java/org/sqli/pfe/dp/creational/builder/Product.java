package org.sqli.pfe.dp.creational.builder;

import lombok.Getter;

@Getter
public class Product {

    private final String label;
    private final double price;
    private final int quantity;

    public Product(ProductBuilder productBuilder) {
        this.label = null;
        this.price = 0;
        this.quantity = 0;
    }

    public static class ProductBuilder {

    }

}
