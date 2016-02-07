/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencelocationvoiture;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Voiture {
    
private int immatriculation;
private String marque;
private float prix;

    public Voiture(int immatriculation, String marque, float prix) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prix = prix;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voiture other = (Voiture) obj;
        if (this.immatriculation != other.immatriculation) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        return true;
    }


    

    @Override
    public String toString() {
        return "Voiture{" + "immatriculation=" + immatriculation + ", marque=" + marque + ", prix=" + prix + '}';
    }


    
}
