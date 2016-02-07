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
public class Client {
    
private int code;
private String nom;
private String prenom;

    public Client(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   

    public boolean equals(Client o){

        if(this.getCode()==o.getCode())
           return true;
        else
           return false;

    }

    @Override
    public String toString() {
        return "Client{" + "code=" + code + ", nom=" + nom + ", prenom=" + prenom + '}';
    }


    
}
