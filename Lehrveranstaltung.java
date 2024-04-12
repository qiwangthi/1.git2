import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    // Datenfield

    private Dozierender dozierender;
    private List<Studierender> studierender;
    protected List<Vorlesungsstunde> vorlesungsstunde;
    protected List<Praktikumsstunde> praktikumsstunde;

    // Konstruktor
    public Lehrveranstaltung(Dozierender dozierender, List<Studierender> studierender,
            List<Vorlesungsstunde> Vorlesungsstunde, List<Praktikumsstunde> praktikumsstunde) {
        // this.titel = titel;
        this.dozierender = dozierender;
        this.studierender = new ArrayList<>();
        this.vorlesungsstunde = new ArrayList<>();
        this.praktikumsstunde = new ArrayList<>();

    }
    // get-Methode

    public Dozierender getDozierender() {
        return dozierender;
    }

    public List<Studierender> getStudierender() {
        return studierender;
    }

    public List<Vorlesungsstunde> getVorlesungsstunde() {
        return vorlesungsstunde;
    }

    public List<Praktikumsstunde> getPraktikumsstunde() {
        return praktikumsstunde;
    }

    // set-Methode
    public void setDozierender(Dozierender dozierender) {
        this.dozierender = dozierender;
    }

    public void setStudierender(Studierender studierender) {
        this.studierender = new ArrayList<>();
    }

    public void setVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        this.vorlesungsstunde = new ArrayList<>();
    }

    public void setPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        this.praktikumsstunde = new ArrayList<>();
    }

    public void addStudierender(Studierender studierender) {
        this.studierender.add(studierender);
    }

    public void removeStudierender(Studierender studierender) {
        this.studierender.remove(studierender);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        this.vorlesungsstunde.add(vorlesungsstunde);
    }

    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        this.praktikumsstunde.add(praktikumsstunde);
    }

    public void anzeigenVeranstaltungsdetails() {
        System.out.println("Dozierender: " + this.dozierender.getName());
        System.out.println("Studierende: ");
        for (Studierender studierender : this.studierender) {
            System.out.println(studierender.getName());
        }
        System.out.println("Vorlesungsstunde: ");
        for (Vorlesungsstunde vorlesungsstunde : this.vorlesungsstunde) {
            System.out.println(vorlesungsstunde.getThema());
        }
        System.out.println("Praktikumsstunde: ");
        for (Praktikumsstunde praktikumsstunde : this.praktikumsstunde) {
            System.out.println(praktikumsstunde.getThema());
        }
    }

}
