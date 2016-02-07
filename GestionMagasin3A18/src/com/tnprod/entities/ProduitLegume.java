package com.tnprod.entities;

public class ProduitLegume extends ProduitAgricole {

    public ProduitLegume() {
    }

    public ProduitLegume(int id, String libelle, String marque, float prix, float quantite, String saison) {
        super(id, libelle, marque, prix, quantite, saison);
    }

}
