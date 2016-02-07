/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetliste;

/**
 *
 * @author adouni
 */
public class Etudiant implements Comparable<Etudiant> {
    int id ;
    String nom ;
    String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
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
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

  
  /*  public int compareTo(Etudiant e) {
if (this.id<e.getId()) {
            return -1;
        }
 
     if (this.id>e.getId()) {
            return 1;
        }

return 0; //egaux
    
    }*/
    
     /*  public int compareTo(Etudiant e) {

    if (this.nom.compareTo(e.getNom())==0) { //si le nom sont egaux kif kif yrta3da comparer par prenom
               return this.prenom.compareTo(e.getPrenom());
           }
    return this.nom.compareTo(e.getNom());
    
    
  }
     
    
    */

    @Override
    public int compareTo(Etudiant o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
