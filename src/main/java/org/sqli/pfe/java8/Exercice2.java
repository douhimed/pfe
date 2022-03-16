package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


public class Exercice2 {

    public static void main(String[] args) {
        // 2 Concaténer une liste de chaine  de caractère avec un séparateur « , ».

        List<String> names = Arrays.asList("Brad", "Fields", "Bessie", "Castillo", "Rex",
                "Reeves", "Kristopher", "Evans", "Tina",
                "James", "Jean", "Diaz", "Kimberly", "Houston",
                "Wesley", "Obrien", "Maryann",
                "Simmons", "Virgil"
                , "Moran");

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (; i < names.size() - 1; i++) {
            String name = names.get(i);
            stringBuilder.append(name)
                    .append(',');
        }

        stringBuilder.append(names.get(i));
        System.out.println("OLD : " + stringBuilder);

        System.out.println(String.join(",", names));
        System.out.println(names.stream().collect(Collectors.joining(",")));
        names.stream().reduce((s, s2) -> s + "," + s2).ifPresent(System.out::println);

    }
}
