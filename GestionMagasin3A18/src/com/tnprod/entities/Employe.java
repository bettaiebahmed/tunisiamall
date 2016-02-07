package com.tnprod.entities;

public abstract class Employe { // ne peut pas être instancié

    protected int id;
    protected String nom;
    protected String adresse;
    protected int nb_heures;

    public Employe() {
    }

    public Employe(int id, String nom, String adresse, int nb_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heures=" + nb_heures + '}';
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNb_heures() {
        return nb_heures;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNb_heures(int nb_heures) {
        this.nb_heures = nb_heures;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double getSalaire();
   }
