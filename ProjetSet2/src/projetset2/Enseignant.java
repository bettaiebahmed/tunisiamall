/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetset2;

/**
 *
 * @author adouni
 */
public class Enseignant { //implements Comparable<Enseignant> {
    int id ;
    String nom ;
    String prenom ;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        return 3*id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enseignant other = (Enseignant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    /*@Override
    public int compareTo(Enseignant e) { // 1ere methode de compre
    
    return (this.nom.compareTo(e.nom));*/
    
    
    }
    
    

