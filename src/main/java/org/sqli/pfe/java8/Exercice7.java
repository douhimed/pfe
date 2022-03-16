package org.sqli.pfe.java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SuppressWarnings("all")
public class Exercice7 {

    public static void main(String[] args) {


        Produit produitA = new Produit("ProduitA", 89);
        Produit produitB = new Produit("ProduitB", 91);
        Produit produitC = new Produit("ProduitC", 5);
        Produit produitD = new Produit("ProduitD", 5);
        Produit produitE = new Produit("ProduitE", 91);
        Produit produitF = new Produit("ProduitF", 89);


        List<Produit> produits = Arrays.asList(
                produitA,
                produitB,
                produitC,
                produitD,
                produitE,
                produitF);

        old(produits);
        newVersion(produits);
    }

    private static void newVersion(List<Produit> produits) {

        System.out.println(produits.stream().collect(Collectors.groupingBy(Produit::getPrix)));
    }

    private static void old(List<Produit> produits) {
        Map<Double, List<Produit>> grouperParPrix = new HashMap<>();

        for (Produit produit : produits) {
            double prix = produit.getPrix();
            List<Produit> list = grouperParPrix.get(prix);

            if (list == null) {
                list = new ArrayList<>();
                grouperParPrix.put(prix, list);
            }
            list.add(produit);
        }

        System.out.printf("liste de produits groupés par prix : %s%n", grouperParPrix);
    }
}