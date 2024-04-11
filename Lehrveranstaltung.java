import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private List<Studierender> studierende;
    private List<Dozierender> dozierende;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel) {
        this.titel = titel;
        this.studierende = new ArrayList<>();
        this.dozierende = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
    }

    public List<Studierender> getStudierende() {
        return studierende;
    }

    public List<Dozierender> getDozierende() {
        return dozierende;
    }

    public void addStudierender(Studierender studierender) {
        studierende.add(studierender);
    }

    public void removeStudierender(Studierender studierender) {
        studierende.remove(studierender);
    }

    public void addDozierender(Dozierender dozierender) {
        dozierende.add(dozierender);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunden.add(vorlesungsstunde);
    }

    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        praktikumsstunden.add(praktikumsstunde);
    }

    public void anzeigenDetails() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Teilnehmende Studierende: " + studierende.size());
        System.out.println("Lehrende Dozierende: " + dozierende.size());
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden.size());
        System.out.println("Praktikumsstunden: " + praktikumsstunden.size());
        /*//Methoden addVorlesungsstunde
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde){
        String[] vorlesungsstundeListe = new String[this.vorlesungsstunde.length + 1];
        for(int i = 0; i < this.vorlesungsstunde.length; i++){
            vorlesungsstundeListe[i] = this.vorlesungsstunde[i];
        }
        vorlesungsstundeListe[vorlesungsstundeListe.length - 1] = vorlesungsstunde.getThema();
        this.vorlesungsstunde = vorlesungsstundeListe;
    }
    //Methoden addPraktikumsstunde
    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde){
        String[] PraktikumsstundeListe = new String[this.praktikumsstunde.length + 1];
        for(int i = 0; i < this.praktikumsstunde.length; i++){
            PraktikumsstundeListe[i] = this.praktikumsstunde[i];
        }
        PraktikumsstundeListe[PraktikumsstundeListe.length - 1] = praktikumsstunde.getThema();
        this.praktikumsstunde = PraktikumsstundeListe;
    }   
    //Methoden anzeigenVeranstaltungsdetails
    public void anzeigenVeranstaltungsdetails(){
        System.out.println("Details der Lehrveranstaltung:");
        System.out.println("Dozierender: "+this.dozierender.getName());
        System.out.println("Studierende: ");
        for(int i = 0; i < this.studierender.length; i++){
            System.out.println(this.studierender[i]);
        }
        System.out.println("Vorlesungsstunde: ");
        for(int i = 0; i < this.vorlesungsstunde.length; i++){
            System.out.println(this.vorlesungsstunde[i]);
        }
        System.out.println("Praktikumsstunde: ");
        for(int i = 0; i < this.praktikumsstunde.length; i++){
            System.out.println(this.praktikumsstunde[i]);
        }
    } */
    }
}