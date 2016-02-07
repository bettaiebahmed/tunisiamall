/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetset2;

/**
 *
 * @author adouni
 */
public interface GestionEnseignant {
 
    
   public void ajouterEnseignant(Enseignant e);
   public boolean rechercherEnseignant (Enseignant e);
   public boolean rechercherEnseignant (int id);  
    public void supprimerEnseignant (Enseignant e); 
    public void displayEnseignants(); 

}
