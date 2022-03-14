package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class Exercice5 {

    public static void main(String[] args) {
        //5 Trouver le min, max, somme, moyenne dans une liste d’entier (IntStream.statisticSummary())

        // 5-1 le min  :

        List<Integer> listEntiers = Arrays.asList(
                97, 75, 69, 25, 32, 33, 26,
                5, 73, 73, 65, 3, 49, 76, 43,
                77, 67, 13, 75, 48, 88, 97, 22,
                5, 77, 37);

        int min = listEntiers.get(0);

        for (int j = 1; j < listEntiers.size(); j++) {
            Integer entier = listEntiers.get(j);
            if (entier < min) {
                min = entier;
            }
        }
        System.out.printf("la valeur minimale  = %d %n", min);

        // 5-2 le max  :

        int max = listEntiers.get(0);

        for (int j = 1; j < listEntiers.size(); j++) {
            Integer entier = listEntiers.get(j);
            if (entier > max) {
                max = entier;
            }
        }

        System.out.printf("la valeur maximale  = %d %n", max);

    }
}
