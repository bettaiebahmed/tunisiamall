/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetset2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adouni
 */
public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> enseignants = new HashSet<>();

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
        for (Enseignant ens : enseignants) {
        System.out.println(ens);}
 
    }
    
}
