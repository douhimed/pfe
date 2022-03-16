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

    static List<Produit> produits = Arrays.asList(produitA,
            produitB,
            produitC,
            produitD);

    static Optional<Produit> chercherProduitParLibelle(String libelle) {
        return produits.stream().filter(p -> p.getLibelle().equalsIgnoreCase(libelle)).findFirst();
    }

    public static void main(String[] args) {

        chercherProduitParLibelle("ProduitA").ifPresent(p -> System.out.println(p.getPrix()));
        chercherProduitParLibelle("ProduitB").ifPresent(p -> System.out.println(p.getPrix()));
        chercherProduitParLibelle("ProduitZ").ifPresent(p -> System.out.println(p.getPrix()));
    }
}
