package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        old(listEntiers);
        newVersion(listEntiers);

    }

    private static void newVersion(List<Integer> listEntiers) {

        IntStream intStream = listEntiers.stream().mapToInt(i -> i);
        intStream.max().ifPresent(System.out::println);

        intStream = listEntiers.stream().mapToInt(i -> i);
        intStream.min().ifPresent(System.out::println);

        intStream = listEntiers.stream().mapToInt(i -> i);
        intStream.average().ifPresent(System.out::println);

        intStream = listEntiers.stream().mapToInt(i -> i);
        System.out.println(intStream.sum());

        IntSummaryStatistics intSummaryStatistics = listEntiers
                .stream()
                .collect(Collectors.summarizingInt(i -> i));

        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics.getMax());
    }

    private static void old(List<Integer> listEntiers) {
        int min = listEntiers.get(0);
        int max = listEntiers.get(0);

        for (int j = 1; j < listEntiers.size(); j++) {
            Integer entier = listEntiers.get(j);
            if (entier < min) {
                min = entier;
            }
            if (entier > max) {
                max = entier;
            }
        }
        System.out.printf("la valeur minimale  = %d %n", min);
        System.out.printf("la valeur maximale  = %d %n", max);
    }
}
