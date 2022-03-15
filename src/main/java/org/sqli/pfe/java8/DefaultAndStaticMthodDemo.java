package org.sqli.pfe.java8;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Builder
@Getter
@Setter
class ItemImpl extends AbstractItemUtilityClass implements Item {
    private String value;
}

interface Item {

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

    public static Item create() {
        return ItemImpl.builder().value("default").build();
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
