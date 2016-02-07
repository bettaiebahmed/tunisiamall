package com.tnprod.entities;

public class Responsable extends Employe {

    int prime;

    public Responsable() {
    }

    public Responsable(int id, String nom, String adresse, int nb_heures, int prime) {
        super(id, nom, adresse, nb_heures);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable: " + super.toString()
                + " prime=" + prime;
    }

    @Override
    public double getSalaire() {
        if (nb_heures > 160) {
            return (160 * 10) + (nb_heures - 160) * (10 + ((10 * 20) / 100)) + prime;
        } else {
            return (nb_heures * 10) + prime;
        }
    }

}
