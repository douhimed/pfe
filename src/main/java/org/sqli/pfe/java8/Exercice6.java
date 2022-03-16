package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("all")
public class Exercice6 {

    public static void main(String[] args) {
        // 6 Trier une liste de Produits (libelle, prix)  par prix

        Produit produitA = new Produit("ProduitA", 89);
        Produit produitB = new Produit("ProduitB", 91);
        Produit produitC = new Produit("ProduitC", 5);


        List<Produit> produits = Arrays.asList(produitA,
                produitB,
                produitC);

        old(produits);
        newVersison(produits);
    }

    private static void newVersison(List<Produit> produits) {

        Collections.sort(produits, Comparator.comparing((Produit::getPrix)));
        System.out.println(produits);

        Collections.sort(produits, Comparator.comparing((Produit::getPrix)).thenComparing(Produit::getLibelle));
        System.out.println(produits);

        final List<Produit> produitList = produits.stream().sorted(Comparator.comparing(Produit::getPrix)).collect(Collectors.toList());
        System.out.println(produitList);
    }

    private static void old(List<Produit> produits) {
        Collections.sort(produits, new Comparator<Produit>() {
            @Override
            public int compare(Produit produitA, Produit produitB) {
                if (produitA.getPrix() > produitB.getPrix()) {
                    return 1;
                } else if (produitA.getPrix() < produitB.getPrix()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("produits après le tri par prix :\n");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}