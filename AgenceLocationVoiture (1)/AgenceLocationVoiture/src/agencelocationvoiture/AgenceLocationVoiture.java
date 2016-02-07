/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencelocationvoiture;
import java.util.*;
/**
 *
 * @author DELL
 */
public class AgenceLocationVoiture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture v1=new Voiture(1,"Renault",250);
        Voiture v2=new Voiture(2,"Fiat",300);
        Voiture v3 = new Voiture(3, "Renault",300);
        Voiture v24=new Voiture(24,"Renault",500);
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v24.toString());
      
        System.out.println("***************************");
        
        System.out.println(v2.toString());
        System.out.println("Modification du marque de la voiture");
        System.out.println("La voiture devient donc "+ v24.toString());
        
        if(v1.equals(v3))
            System.out.println("Ces deux voitures sont identique");
        else
            System.out.println("voitures non identiques");
        
        
        System.out.println("***************************");
        
        Client clt1=new Client(29,"saber","khlifa");
        Client clt2=new Client(10,"imed","meniaoui");
        Client clt3=new Client(21,"tijeni","belaid");
        Client clt4=new Client(8,"houssine","nater");
        Client clt5=new Client(23,"saidou","salifou");
        
        System.out.println(clt1.toString());
        System.out.println(clt2.toString());
        System.out.println(clt3.toString());
        System.out.println(clt4.toString());
        System.out.println(clt5.toString());
        
        clt2.setPrenom("Moustapha");
        System.out.println("Le client est donc "+clt2.toString());
        if(clt1.equals(clt2))
            System.out.println("Ces deux clients sont identiques");
        else
            System.out.println("Ces deux clients ne sont pas identiques, car "+clt1.getCode()+ " est bel et bien different de :"+clt2.getCode());
        
 
        System.out.println("ici ...........................Agence");
        ListVoitures ls=new ListVoitures();
        try{
            ls.addVoiture(v1);
            ls.addVoiture(v2);
        }
        catch(VoitureException ex){
            System.out.println("L'erreur suivante s'est produite"+ex);
        }
        
        System.out.println("La taille de la liste est "+ls.size());
        try{
            ls.removeVoiture(v2);
        }catch(VoitureException ex)
        {
            System.out.println("L'erreur suivante s'est produite"+ex);
        }
        
        System.out.println("La taille de la liste est maintenant "+ls.size());
        try{
            ls.addVoiture(v2);
            ls.addVoiture(v3);
            
        }catch(VoitureException ex)
        {
            System.out.println("L'erreur suivante s'est produite"+ex);
        }
        System.out.println("La taille de la liste est maintenant "+ls.size());
    }
    
    
    

    
    
}
