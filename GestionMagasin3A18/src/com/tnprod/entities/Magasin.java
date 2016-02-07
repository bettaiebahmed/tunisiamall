/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tnprod.entities;

/**
 *
 * @author Houssem Eddine
 */
public class Magasin {

    int id;
    String nom;
    String adresse;
    
    int capacite = 50;
    public Produit[] tabProduits = new Produit[capacite];//création d'un tabProduits
    public int nbProduits = 0;
    static int nbTotalProduits = 0;
    
    int capaciteEmployes = 20;
    public Employe[] tabEmployes = new Employe[capaciteEmployes];
    public int nbEmployes = 0;
    
    public Magasin() {
    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }
    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public boolean ajouter(Produit p) {
        if (nbProduits < 50 && chercher(p) == -1) {
            tabProduits[nbProduits] = p;
            nbProduits++;
            nbTotalProduits++;
            return true;
        }
        return false;
    }
public boolean ajouter(Employe e) {
        if (nbEmployes < 20) {
            tabEmployes[nbEmployes] = e;
            nbEmployes++;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String s = "id=" + id + "\nadresse=" + adresse + "\ncapacite=" + capacite;
        for (int i = 0; i < nbProduits; i++) {
            s += "\n" + tabProduits[i].libelle + " " + tabProduits[i].prix;
        }
        for (int i = 0; i < nbEmployes; i++) {
            s += "\n" + tabEmployes[i].toString();
        }
        return s;
    }

    public int chercher(Produit p1) {

        for (int i = 0; i < this.nbProduits; i++) {
            if (tabProduits[i].comparer(p1)) {
                return i;
            }
        }
        return -1;
    }

    public boolean supprimer(Produit p1) {
        int position = chercher(p1);
        if (position == -1) {
            return false; // le produit n'existe pas
        }
//le produit existe
        for (int i = position; i < nbProduits - 1; i++) {
            tabProduits[i] = tabProduits[i + 1];
        }
        // suppression de la derniere case
        tabProduits[nbProduits - 1] = null;
        nbProduits--;
        nbTotalProduits--;
        return true;
    }

    public static Magasin superieur(Magasin m1, Magasin m2) {

        if (m1.nbProduits > m2.nbProduits) {
            return m1;
        } else if (m1.nbProduits < m2.nbProduits) {
            return m2;
        } else { //égaux
            return null;
        }

    }
    
    public float calculStockFruit(){
        float somme=0;
        for(int i =0;i<nbProduits;i++)
        {
            if(tabProduits[i] instanceof ProduitFruit)
            {
                somme+=((ProduitFruit)tabProduits[i]).quantite;
            }
        }
        return somme;
    }

}
