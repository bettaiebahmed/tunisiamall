/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetliste;

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
        
        Etudiant E1 = new Etudiant (1,"rania","adouni");
       Etudiant E2 = new Etudiant (2,"ahmed","fitouhi");
       Etudiant E3 = new Etudiant (3,"xxxxx","zzzz");
         Etudiant E4 = new Etudiant (4,"ahmed","salhi");
       // System.out.println(E1.equals(E2));
       //System.out.println( E1.toString());

       EspritArrayList esprit = new EspritArrayList();
       esprit.ajouterEtudiant(E2);
       esprit.ajouterEtudiant(E1);
       esprit.ajouterEtudiant(E4);
        esprit.ajouterEtudiant(E3);
       
       //System.out.println(esprit.rechercherEtudiant(E3));
       //System.out.println(esprit.rechercherEtudiant("looool"));
       
       esprit.displayEtudiants();
      // esprit.supprimerEtudiant(E3);
           //   esprit.displayEtudiants();
       System.out.println("*******************************************");
       
              
              esprit.trierEtudiantsParId();
              esprit.displayEtudiants();
               System.out.println("*******************************************");
                   esprit.trierEtudiantsParNom();
                   esprit.displayEtudiants();
    }
}
