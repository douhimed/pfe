package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("all")
public class Exercice4 {

    public static void main(String[] args) {

        //4 Vérifier que (tous/au moins un element) les éléments d’une liste vérifie une condition.
        // 4-1 tous vérifient une condition :  vérifier si tous les pays commencent par une majuscule :

        List<String> listePays = Arrays.asList("Egypt", "Algeria", "Kazakhstan",
                "Turkey", "Madagascar", "Belgium", "Greece", "Thailand", "Gambia", "Lebanon",
                "Serbia", "India", "Slovakia", "Belgium",
                "Romania", "Egypt", "India", "China", "China", "South", "Africa",
                "Moldova", "Germany", "Denmark",
                "Bangladesh", "Syria", "Ireland",
                "Italy");

        boolean allElementsVerified = true;

        for (String pays : listePays) {
            char premiereLettre = pays.charAt(0);
            if (premiereLettre < 'A' || premiereLettre > 'Z') {
                allElementsVerified = false;
                break;
            }
        }

        if (allElementsVerified) {
            System.out.println("tous les pays commencent par une majuscule ");
        } else {
            System.out.println("il existe au moins un pays aui ne commence pas par une majuscule ");
        }

        //4-2 au moins
        boolean atLeastOneElementVerified = false;
        for (String pays : listePays) {
            if (pays.startsWith("S")) {
                atLeastOneElementVerified = true;
                break;
            }

        }

        if (atLeastOneElementVerified) {
            System.out.println("il existe au moins un pays qui commence par 'S' ");
        } else {
            System.out.println("il n'existe aucun pays qui commence par 'S' ");
        }


        listePays.stream().anyMatch(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("S");
            }
        });


        listePays.stream().allMatch(new Predicate<String>() {
            @Override
            public boolean test(String pays) {
                char premiereLettre = pays.charAt(0);
                return (premiereLettre < 'A' || premiereLettre > 'Z');
            }
        });
    }
}
