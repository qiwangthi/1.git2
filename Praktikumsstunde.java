import java.util.List;
import java.util.ArrayList;

public class Praktikumsstunde extends Lehrveranstaltung {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private List<String> aufgaben;

    public Praktikumsstunde(String titel, String thema, String datum, String uhrzeit, String raum) {
        super(titel);
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = new ArrayList<>();
    }

    public void addAufgabe(String aufgabe) {
        aufgaben.add(aufgabe);
    }

    public void anzeigenDetails() {
        System.out.println("Praktikumsstunde: Thema - " + thema + ", Datum - " + datum + ", Uhrzeit - " + uhrzeit + ", Raum - " + raum);
        System.out.println("Aufgaben:");
        for (String aufgabe : aufgaben) {
            System.out.println("- " + aufgabe);
        }
    }
}