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

        tousParMajuscule(listePays);
        auMoinsParS(listePays);

    }

    private static void auMoinsParS(List<String> listePays) {
        boolean atLeastOneElementVerified = false;
        for (String pays : listePays) {
            if (pays.startsWith("S")) {
                atLeastOneElementVerified = true;
                break;
            }

        }
        if (atLeastOneElementVerified) {
            System.out.println("OLD : il existe au moins un pays qui commence par 'S' ");
        } else {
            System.out.println("OLD : il n'existe aucun pays qui commence par 'S' ");
        }

        System.out.println(listePays.stream().anyMatch(pays -> pays.charAt(0) == 'S')
                ? "New : il existe au moins un pays qui commence par 'S' "
                : "New : il n'existe aucun pays qui commence par 'S' ");

    }

    private static void tousParMajuscule(List<String> listePays) {
        boolean allElementsVerified = true;

        for (String pays : listePays) {
            char premiereLettre = pays.charAt(0);
            if (premiereLettre < 'A' || premiereLettre > 'Z') {
                allElementsVerified = false;
                break;
            }
        }

        if (allElementsVerified) {
            System.out.println("OLD : tous les pays commencent par une majuscule ");
        } else {
            System.out.println("OLD : il existe au moins un pays aui ne commence pas par une majuscule ");
        }

        System.out.println(listePays.stream().allMatch(pays -> pays.charAt(0) >= 'A' && pays.charAt(0) <= 'Z')
                ? "New : tous les pays commencent par une majuscule "
                : "New : il existe au moins un pays aui ne commence pas par une majuscule ");
    }

}
