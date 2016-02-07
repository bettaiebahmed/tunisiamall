/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetset2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author adouni
 */
public class EspritTreeSet implements GestionEnseignant{
     Set<Enseignant> enseignants = new TreeSet<>(
             
             new Comparator<Enseignant>() {

        @Override
        public int compare(Enseignant e1, Enseignant e2) {
            
            if (e1.id>e2.id)  //return e1.id  - e2.id ; 2eme methode 
            { return 1;}
             if (e1.id<e2.id)
             {return -1;}
            return 0;
        }
    }
             
             
             );

    @Override
    public void ajouterEnseignant(Enseignant e) {

        enseignants.add(e);
    }

    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    public boolean rechercherEnseignant(int id) {
        for (Enseignant ens : enseignants) {
            if (id == ens.id) {
                return true;
            }
        }
        return false;
    }

    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
         for (Enseignant ens : enseignants)
        System.out.println(ens);
    }
}
