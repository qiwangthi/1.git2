import java.util.List;

public class Vorlesungsstunde extends Lehrveranstaltung {

    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(Dozierender dozierender, List<Studierender> studierender,
            List<Vorlesungsstunde> Vorlesungsstunde, List<Praktikumsstunde> praktikumsstunde, String thema,
            String datum, String uhrzeit, String raum) {
        super(dozierender, studierender, Vorlesungsstunde, praktikumsstunde);
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public void detailsAnzeigen() {
        System.out.println("Details der Vorlesungstunde:");
        System.out.println("Thema: " + this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: " + this.uhrzeit);
        System.out.println("Raum: " + this.raum);
    }

}
