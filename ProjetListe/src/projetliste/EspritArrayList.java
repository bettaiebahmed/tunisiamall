/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetliste;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;



   // public void trierEtudiantsParNom() {
      //  Collections.sort(listetudiant);
   // }//

    
    
/**
 *
 * @author adouni
 */
public class EspritArrayList  implements University {


    ArrayList listetudiant  =new ArrayList (); //crée un liste des etudiants de type Arrylist ou de type List 
    
     //Vector listetudiant2 =new Vector(); 
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
       listetudiant.add(e); 
        
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
  
       
        return listetudiant.contains(e);
    }
    

    @Override
    public boolean rechercherEtudiant(String nom) {
  for (int i=0 ; i<listetudiant.size();i++) {
           if (((Etudiant)listetudiant.get(i))
                   .getNom().equals(nom))  {
                   return true ;}
  }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {

    listetudiant.remove(e);
    
    }

    @Override
    public void displayEtudiants() {
    System.out.println(listetudiant);
    
    }

    @Override
    public void trierEtudiantsParId() {
       Comparator <Etudiant> compID =new Comparator<Etudiant>() {

     
     @Override
            
     public int compare(Etudiant e1, Etudiant e2) {
                if (e1.getId()<e2.getId()) {
            return -1;
        }
 
     if (e1.getId()>e2.getId()) {
            return 1;
        }

           return 0; //egaux
            } };     
       
    Collections.sort(listetudiant,compID);
    }

      public void trierEtudiantsParNom() {
        Collections.sort(listetudiant, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                if (e1.nom.compareTo(e2.getNom()) == 0) {
                    return e1.prenom.compareTo(e2.getPrenom());
                }
                return e1.nom.compareTo(e2.getNom());
            }
        });
    }
               }
    
    




