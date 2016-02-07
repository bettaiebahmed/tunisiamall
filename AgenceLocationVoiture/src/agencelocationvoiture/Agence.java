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
public class Agence {
    
    private String nom;
    private ListVoitures ls;
    private Map<Client,ListVoitures> cltVoitLoue;

    public Agence(String nom) {
        this.nom = nom;
        ls = new ListVoitures();
        cltVoitLoue=new HashMap<Client,ListVoitures>();
    }
    
    public void addVoiture(Voiture v) throws VoitureException{
        ls.addVoiture(v);
}
    public void removeVoiture(Voiture v) throws VoitureException{
        ls.removeVoiture(v);
    }
    
    public void retourClientVoiture(Client clt, Voiture v) throws VoitureException {
        int trouve=0;
        Set couples=cltVoitLoue.entrySet();
        Iterator<Map.Entry<Client,ListVoitures>> it=couples.iterator();
        while(it.hasNext()){
            Map.Entry<Client,ListVoitures> entree=it.next();
            if(entree.getKey()==clt){
                trouve=1;
                (entree.getValue()).removeVoiture(v);
            }
        }
        if(trouve==0)
            System.out.println("Client inexistant dans l'agence");
    }
    
    public void loueClientVoiture(Client clt, Voiture v) throws VoitureException { 
        int trouve=0;
        Set couples=cltVoitLoue.entrySet();
        Iterator<Map.Entry<Client,ListVoitures>> it=couples.iterator();
        
        while(it.hasNext()){           
            Map.Entry<Client,ListVoitures> entree=it.next();
            if(entree.getKey()==clt){
                trouve=1;
                (entree.getValue()).addVoiture(v);
            }
        }
        if(trouve==0)
        {
            ListVoitures lv;
            lv = new ListVoitures();
            lv.addVoiture(v);
            cltVoitLoue.put(clt,lv);
        }
    }
    
    public List<Voiture> selectVoitureSelonCritere(Critere c){
        List<Voiture> list = new LinkedList();
        ListIterator<Voiture> it=this.ls.getVoiture().ListIterator();
        while(it.hasNext())
        { 
            Voiture v=it.next();
            if(c.estSatisfaitPar(v))
                list.add(v);
        }
        return list;
    }
    
    public Set<Client> ensembleClientLoueurs(){
        return cltVoitLoue.keySet();
    }
    
    public Collection<ListVoitures> collectionVoiturelouees(){
        return cltVoitLoue.values();
    }


    public void afficheLesClientEtleursListeVoiture(){
       
        System.out.println("Affichage d'Agence");
        Set couples=cltVoitLoue.entrySet();
        Iterator<Map.Entry<Client,ListVoitures>> it=couples.iterator();
        int i=0;
        while(it.hasNext())
        {
            i++;
            System.out.println("Client numéro "+i);
            Map.Entry<Client,ListVoitures> e = it.next();
            System.out.println(e.getKey().toString());
            e.getValue().affiche();
        }
    }
    
    public Map<Client,ListVoitures> triCodeCroissant(){
        Map<Client,ListVoitures> map=new TreeMap<Client,ListVoitures>(new CodeClientComparator());
        map.putAll(cltVoitLoue);
        return map;
    }
    public Map<Client,ListVoitures> triNomCroissant(){
        Map<Client,ListVoitures> map=new TreeMap<Client,ListVoitures>(new NomClientComparator());
        map.putAll(cltVoitLoue);
        return map;
    }
}