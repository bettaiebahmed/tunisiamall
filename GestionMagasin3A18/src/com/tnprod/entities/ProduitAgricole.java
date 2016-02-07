package com.tnprod.entities;

public class ProduitAgricole extends Produit {

    public String saison;
    public float quantite;

    public ProduitAgricole() {
    }

    public ProduitAgricole(int id, String libelle, String marque, float prix, float quantite, String saison) {
        super(id, libelle, marque, prix);
        this.saison = saison;
        this.quantite = quantite;
    }

}
