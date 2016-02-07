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
class CodeClientComparator implements Comparator<Client> {

   public int compare(Client clt1, Client clt2){
     
       if(clt1.getCode()==clt2.getCode())
           return 0;
       else
       {
           if((clt1.getCode())<(clt2.getCode()))
               return -1;
           else
               return 1;
       }
   }
    
}
