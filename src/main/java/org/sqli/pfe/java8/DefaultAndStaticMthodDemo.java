package org.sqli.pfe.java8;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Builder
@Getter
@Setter
class ItemImpl extends AbstractItemUtilityClass implements Item {
    private String value;

    @Override
    public String toString() {
        return value;
    }
}

interface Item {

    String DEFAULT = "default";

    String getValue();

    void setValue(String value);

    static Item create(String value) {
        return ItemImpl.builder().value(value).build();
    }

    default void upperCase() {
        Optional.of(this.getValue()).ifPresent(v -> this.setValue(v.toUpperCase()));
    }

    default void trim() {
        Optional.of(this.getValue()).ifPresent(v -> this.setValue(v.trim()));
    }

    static List<Item> create(int size) {
        return Collections.nCopies(size, create(DEFAULT));
    }
}

abstract class AbstractItemUtilityClass implements Item {

    public static Item create(String value) {
        return Item.create(value);
    }

    public static void upperCase(Item item) {
        item.upperCase();
    }

    public static void trim(Item item) {
        item.trim();
    }

    public static List<Item> create(int size) {
        return Item.create(size);
    }
}


public class DefaultAndStaticMthodDemo {

    public static void main(String[] args) {
        Item item = AbstractItemUtilityClass.create("  test  ");
        System.out.println(item.getValue());
        AbstractItemUtilityClass.trim(item);
        System.out.println(item.getValue());
        AbstractItemUtilityClass.upperCase(item);
        System.out.println(item.getValue());

        Item newItem = Item.create("   SQLI   ");
        System.out.println(newItem);
        newItem.trim();
        System.out.println(newItem);
        newItem.upperCase();
        System.out.println(newItem);

        List<Item> items = Item.create(3);
        System.out.println(items);
    }
}
