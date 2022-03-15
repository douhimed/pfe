package org.sqli.pfe.java8;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Builder
@Getter
@Setter
class ItemImpl extends AbstractItemUtilityClass implements Item {
    private String value;
}

interface Item {

    String DEFAULT = "default";

    String getValue();

    void setValue(String value);
}

abstract class AbstractItemUtilityClass implements Item {

    public static Item create(String value) {
        return ItemImpl.builder().value(value).build();
    }

    public static void upperCase(Item item) {
        Optional.of(item).map(Item::getValue).ifPresent(value -> item.setValue(value.toUpperCase()));
    }

    public static void trim(Item item) {
        Optional.of(item).map(Item::getValue).ifPresent(value -> item.setValue(value.trim()));
    }

    public static List<Item> create(int size) {
        return Collections.nCopies(size, create(DEFAULT));
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
    }
}
