package org.sqli.pfe.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionnels {

// sur la liste des produits, écrire une fonction qui cherche un produit par son libellé (ProduitZ, ProduitF)

    static Produit produitA = new Produit("ProduitA", 89);
    static Produit produitB = new Produit("ProduitB", 91);
    static Produit produitC = new Produit("ProduitC", 5);
    static Produit produitD = new Produit("ProduitD", 5);
    static Produit produitE = new Produit("ProduitE", 90);
    static Produit produitF = new Produit("ProduitF", 54);
    static Produit produitG = new Produit("ProduitG", 23);
    static Produit produitH = new Produit("ProduitH", 24);

    static List<Produit> produits = Arrays.asList(produitA,
            produitB,
            produitC,
            produitD,
            produitE,
            produitF,
            produitG,
            produitH);

    static Optional<Produit> chercherProduitParLibelle(String libelle) {
       return null;
    }

    public static void main(String[] args) {


    }
}
