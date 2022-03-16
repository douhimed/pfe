package org.sqli.pfe.java8;

import java.util.Objects;
import java.util.Optional;

public class MyOptional<T> {

    private T value;

    private MyOptional() {
        value = null;
    }

    private MyOptional(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public static <T> MyOptional<T> of(T value) {
        return new MyOptional<>(value);
    }

    public boolean isPresent() {
        return Objects.nonNull(value);
    }

    public T get() {
        return value;
    }

}

class Product {
    public String value;

    public Product(String value) {
        this.value = value;
    }
}

class ProductServices {

    public MyOptional<Product> getProduct() {
        return MyOptional.of(new Product("S1"));
    }

}

class TestMyOptional {

    public static void main(String[] args) {

        ProductServices productServices = new ProductServices();
        final MyOptional<Product> productMyOptional = productServices.getProduct();

        if(productMyOptional.isPresent()) {
            System.out.println(productMyOptional.get().value);
        }else
            System.out.println("Not existe");

    }
}