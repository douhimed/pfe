package org.sqli.pfe.java8;

import java.util.ArrayList;
import java.util.List;


public class Exercice1 {

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

        System.out.println(nouvelleListe);
    }
}
