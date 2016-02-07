package com.tnprod.entities;

public class Vendeur extends Employe {

    int tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(int id, String nom, String adresse, int nb_heures, int tauxDeVente) {
        super(id, nom, adresse, nb_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur: " + super.toString()
                + " TauxDeVente=" + tauxDeVente;
    }

    @Override
    public double getSalaire() {
        return (450 *tauxDeVente);
    }
}
