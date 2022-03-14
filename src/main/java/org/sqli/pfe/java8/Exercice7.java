package org.sqli.pfe.java8;

import java.util.*;
@SuppressWarnings("all")
public class Exercice7 {

    public static void main(String[] args) {


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


        List<Produit> produits = Arrays.asList(
                produitA,
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