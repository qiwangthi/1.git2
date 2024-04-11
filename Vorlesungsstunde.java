public class Vorlesungsstunde extends Lehrveranstaltung {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String titel, String thema, String datum, String uhrzeit, String raum) {
        super(titel);
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void anzeigenDetails() {
        System.out.println("Vorlesungsstunde: Thema - " + thema + ", Datum - " + datum + ", Uhrzeit - " + uhrzeit + ", Raum - " + raum);
    }
}