package org.sqli.pfe.java8;

import java.util.stream.IntStream;

@FunctionalInterface
interface Operation<T> {
    T calculer(T operandeA, T operandeB);
}

public class InterfaceFonctionnelle {

    // 1 completer

    public static Integer faireCalcul(Integer a, Integer b, Operation<Integer> operation) {
        return operation.calculer(a, b);
    }


    public static Integer multplication(Integer a, Integer b) {
        return faireCalcul(a, b, (s1, s2) -> s1 * s2);
    }

    public static Integer addition(Integer a, Integer b) {
        return faireCalcul(a, b, (s1, s2) -> s1 + s2);
    }

    public static Integer soustraction(Integer a, Integer b) {
        return faireCalcul(a, b, (s1, s2) -> s1 - s2);
    }

    public static int factoriel(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {

        System.out.println(InterfaceFonctionnelle.addition(12, 20));
        System.out.println(InterfaceFonctionnelle.soustraction(12, 20));
        System.out.println(InterfaceFonctionnelle.multplication(12, 20));
        System.out.println(InterfaceFonctionnelle.factoriel(5));
    }
}
