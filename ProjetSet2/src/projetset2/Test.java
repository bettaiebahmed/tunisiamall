/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetset2;

import java.util.HashSet;

/**
 *
 * @author adouni
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Enseignant e1 = new Enseignant(1, "rania", "adouni");
     Enseignant e2 = new Enseignant(2, "rania", "adouni");
     Enseignant e3 = new Enseignant(2, "karim", "kouki");
     Enseignant e4 = new Enseignant(35, "zouba", "gesumi");
    
     EspritHashSet setens = new EspritHashSet();
    
    
    /*setens.ajouterEnseignant(e1);
    setens.ajouterEnseignant(e2);
    setens.ajouterEnseignant(e3);
    setens.ajouterEnseignant(e4);

     setens.displayEnseignants();*/
    
     EspritTreeSet treeensg = new EspritTreeSet();
     
     treeensg.ajouterEnseignant(e1);
     treeensg.ajouterEnseignant(e2);
     treeensg.ajouterEnseignant(e3);
     treeensg.ajouterEnseignant(e4);
     treeensg.displayEnseignants();

     
    }
}
