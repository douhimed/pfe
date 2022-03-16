package org.sqli.pfe.dp.creational.builder;

import lombok.Getter;

@Getter
public class Product {


    private final String label;
    private final double price;
    private final int quantity;

    public Product(ProductBuilder productBuilder) {
        label = productBuilder.label;
        price = productBuilder.price;
        quantity = productBuilder.quantity;
    }

    public static class ProductBuilder {

        private String label;
        private double price;
        private int quantity;

        public ProductBuilder builder(String label) {
            this.label = label;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }


        public Product build() {
            return new Product(this);
        }
    }

}
