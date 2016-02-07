package com.tnprod.entities;

public class Caissier extends Employe {

    private int numCaisse;

    public Caissier() {
        super();// appel implicite
    }

    public Caissier(int id, String nom, String adresse,
            int nb_heures, int numCaisse) {
        super(id, nom, adresse, nb_heures);
        this.numCaisse = numCaisse;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    @Override
    public String toString() {
        return "Caissier: " + super.toString()
                + " numCaisse=" + numCaisse;
    }

    @Override
    public double getSalaire() {
        if (nb_heures > 180) {
            return (180 * 5) + (nb_heures - 180) * (5 + ((5 * 15) / 100));
        } else {
            return nb_heures * 5;
        }
    }

}
