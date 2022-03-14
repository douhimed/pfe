package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings("all")
public class Exercice6 {

    public static void main(String[] args) {
        // 6 Trier une liste de Produits (libelle, prix)  par prix

        Produit produitA = new Produit("ProduitA", 89);
        Produit produitB = new Produit("ProduitB", 91);
        Produit produitC = new Produit("ProduitC", 5);
        Produit produitD = new Produit("ProduitD", 5);
        Produit produitE = new Produit("ProduitE", 90);
        Produit produitF = new Produit("ProduitF", 54);
        Produit produitG = new Produit("ProduitG", 23);
        Produit produitH = new Produit("ProduitH", 24);
        Produit produitI = new Produit("ProduitI", 11);
        Produit produitJ = new Produit("ProduitJ", 70);
        Produit produitK = new Produit("ProduitK", 70);
        Produit produitL = new Produit("ProduitL", 5);
        Produit produitM = new Produit("ProduitM", 11);
        Produit produitN = new Produit("ProduitN", 11);
        Produit produitO = new Produit("ProduitO", 84);


        List<Produit> produits = Arrays.asList(produitA,
                produitB,
                produitC,
                produitD,
                produitE,
                produitF,
                produitG,
                produitH,
                produitI,
                produitJ,
                produitK,
                produitL,
                produitM,
                produitN,
                produitO);

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