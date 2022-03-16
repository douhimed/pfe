package org.sqli.pfe.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Exercice1 {

    public static final Predicate<String> FILTER_BY_SQLI = v -> v.startsWith("SQLI");

    public static void main(String[] args) {
        ///1 Trouver les noms commençants par « SQLI » dans une liste de chaines.
        String[] array = new String[]{"SQLI digital performance",
                "SQLi innovation",
                "SQLI skills center",
                "SQLIJAVA", "SQLI entreprenariat"};
        List<String> nouvelleListe = new ArrayList<>();

        for (String srting : array) {
            if (srting.startsWith("SQLI")) {
                nouvelleListe.add(srting);
            }
        }

        System.out.println("OLD : " + nouvelleListe);

        final List<String> sqli = Arrays.stream(array).filter(FILTER_BY_SQLI).collect(Collectors.toList());
        sqli.forEach(System.out::println);
    }
}
