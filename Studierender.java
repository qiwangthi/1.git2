import java.util.List;
import java.util.ArrayList;

public class Studierender {
     
    private String name;
    private int matrikelnummer;
    private String studiengang;
    private List<String> sprechstundenAnfragen;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
        this.sprechstundenAnfragen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public List<String> getSprechstundenAnfragen() {
        return sprechstundenAnfragen;
    }
    
    /*public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println("Frage von: "+this.name+"\nFrage an: "+dozierender.getName()+": " + frage);
        //dozierender.frageBeantworten(this, frage);
    }*/

    public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println(name + " fragt " + dozierender.getName() + ": " + frage);
    }

    /*public void sprechstundeAnfrage(Dozierender dozierender, String frage) {
        this.sprechstundenAnfragen.add(frage);
        System.out.println("Frage von: "+this.name+"\nFrage an: "+dozierender.getName()+": " + frage);
        //dozierender.sprechstundeAnfragen(this, frage);
    }*/

    public void sprechstundenAnfrageSenden(Dozierender dozierender, String termin) {
        String anfrage = "Sprechstundenanfrage: " + termin;
        System.out.println(name + " sendet Sprechstundenanfrage an " + dozierender.getName() + ": " + anfrage);
        sprechstundenAnfragen.add(anfrage);
        dozierender.sprechstundenAnfrageEmpfangen(this, anfrage);
    }

}