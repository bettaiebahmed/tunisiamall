package com.tnprod.test;

import com.tnprod.entities.*;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        

        Produit p2 = new Produit(1021, "Lait", "Delice");
        Produit p3 = new Produit(2000, "Yaourt", "Vitalait");
        Produit p4 = new Produit(3000, "Tomate", "Sicam", (float) 1.2);

//        p1.affiche();
//        p2.affiche();
//        p3.affiche();
//        p4.affiche();
//        p2.prix=0.7f;
////        p2.affiche();
//        p1.id=1001;
//        p1.libelle="AAA";
//        p1.marque="XXXX";
//        p1.prix=17.6f;
//        p1.affiche();
//        p1.dateEx= new Date(2015-1900, 10-1, 15);
        //System.out.println("**********");
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(m1.ajouter(p1));
//        System.out.println(m1.ajouter(p1));
//        System.out.println(m1.ajouter(p2));
//        System.out.println(m1.ajouter(p3));
//        System.out.println("nbProduits="+m1.nbProduits);
//        System.out.println(m1.toString());
        Magasin m1 = new Magasin(1, "carrefour", "Centre Ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");

        Caissier c1 = new Caissier(1, "Ali", "Tunis", 200, 100);
        Caissier c2 = new Caissier(2, "Med", "Ariana", 200, 200);
        Caissier c3 = new Caissier(3, "Samir", "Be, Arous", 200, 300);

        Vendeur v1 = new Vendeur(1, "Mahmoud", "Ariana", 300, 15);
        Vendeur v2 = new Vendeur(2, "Amine", "Ariana", 300, 17);
        Vendeur v3 = new Vendeur(3, "Sami", "Ariana", 300, 11);
        Vendeur v4 = new Vendeur(4, "Amira", "Ariana", 300, 20);

        Responsable r1 = new Responsable(1, "Kamel", "Tunis", 40, 5000);
        Responsable r2 = new Responsable(1, "Jamel", "Tunis", 50, 6000);

        m1.ajouter(c1);
        m1.ajouter(c2);
        m1.ajouter(v1);
        m1.ajouter(r1);

        m2.ajouter(c3);
        m2.ajouter(v2);
        m2.ajouter(v3);
        m2.ajouter(v4);
        m2.ajouter(r2);


}
