
import java.util.logging.Level;
import java.util.logging.Logger;





public class Event{
    
    public int id;
    public String nom_event;
    public Participant [] participants;
    public int nbparticpants ;
    public final int NBMAX = 100;

    public Event(){

       participants = new Participant[NBMAX];
        nbparticpants = 100;}

    public Event(int id, String nom_event) {
        this.id = id;
        this.nom_event = nom_event;
        participants = new Participant[NBMAX];
        nbparticpants = 100;
    }


    public void PartciperEvent (Participant p)  {
        if ( nbparticpants < NBMAX)
        { participants[nbparticpants] = p;
        nbparticpants ++;
        }
      ;

    }

    public static void main(String[] args) {

        Event event = new Event();
        Participant p = new Participant(1, "p1");
       
            event.PartciperEvent(p);
      
     

        

    }


}
class Participant{
 int id;
 String nom ;

    public Participant(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }




}
