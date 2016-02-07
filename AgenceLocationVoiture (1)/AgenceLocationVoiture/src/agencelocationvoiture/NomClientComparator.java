/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencelocationvoiture;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
class NomClientComparator implements Comparator<Client> {

    @Override
   public int compare(Client clt1, Client clt2){
       if(clt1.getNom().equals(clt2.getNom()))
           return 0;
       else
       { 
           int x=clt1.getNom().compareTo(clt2.getNom());
           if(x>0)
               return 1;
           else
               return -1;
       }
   }
    
}
