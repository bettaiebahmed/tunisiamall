package com.tnprod.entities;

import java.util.Date;

public class Produit {

    int id;
    String libelle;
    String marque;
    float prix;
    Date dateEx;
//constructeur par défaut

    public Produit() {
    }
//constructeur paramétré

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;

    }

    public Produit(int id, String libelle, String marque, float prix, Date dateEx) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateEx = dateEx;

    }

    public void affiche() {
        System.out.println("id= " + id + " libelle= " + libelle + " Marque= " + marque + " Prix= " + prix + "dateEx=" + dateEx);
    }

    @Override
    public String toString() {
        return "id= " + id
                + " libelle= " + libelle
                + " Marque= " + marque
                + " Prix= " + prix
                + " dateEx=" + dateEx;

    }

    public boolean comparer(Produit p1) {
        return (p1.id == this.id
                && p1.libelle == this.libelle
                && p1.prix == this.prix);
    }

    public static boolean comparer(Produit p1, Produit p2) {
        return (p1.id == p2.id
                && p1.libelle == p2.libelle
                && p1.prix == p2.prix);
    }

    public void determinerTypeProduit1() { // test le type et renvoie un message
        if (this instanceof ProduitFruit) {
            System.out.println("Fruit");
        } else if (this instanceof ProduitLegume) {
            System.out.println("Legume");
        } else {
            System.out.println("Autre");
        }
    }
    public void determinerTypeProduit2() { //directement le nom de la classe 
        System.out.println(this.getClass());
    }
}
