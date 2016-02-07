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
public class ListVoitures {
    
    private List<Voiture> voitures;
    

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public ListVoitures(){
        voitures =new LinkedList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }
    


    public void addVoiture(Voiture v) throws VoitureException {
        
        if(voitures.contains(v))
            throw new VoitureException("voiture existante");
        else
            voitures.add(v);
    }

    public void removeVoiture(Voiture v) throws VoitureException {

        if(voitures.isEmpty())
           throw new VoitureException("Liste de voiture vide");
        else
            if(voitures.contains(v))
                voitures.remove(v);
        else
                throw new VoitureException("Voiture inexistante");

    }

 

    public int size (){
        return voitures.size();
    }

    public void affiche(){
        
        ListIterator<Voiture> it=this.voitures.listIterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
    }

    Object getVoiture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
