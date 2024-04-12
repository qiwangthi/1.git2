import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // erzeug zwei Studierendern
        Studierender student1 = new Studierender("Ada", "12345678", "UXD2");
        Studierender student2 = new Studierender("Ben", "23456781", "UXD2");

        // erzeug zwei Dozierendern
        Dozierender dozent1 = new Dozierender("Nestler", "Informatik", "C303");
        Dozierender dozent2 = new Dozierender("Sturm", "Informatik", "C304");

        // erzeugen Vorlesungsstunde

        // erzeugen Praktikumsstunde
        Praktikumsstunde praktikumsstunde = new Praktikumsstunde(dozent1, new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(), "Java", "2024-05-01", "10:00", "C303", "Aufgabe1");
        praktikumsstunde.detailsAnzeigen();

        // frage stellen
        student1.frageStellen(dozent1.getName(), "wann haben wir praktikum? ");
        dozent1.frageBeantworten(student1.getName(), "am 1. Mai 2024 um 10:00 Uhr in Raum C303");

        // Sprechstundenanfrage
        student2.sprechstundenAnfrageSenden(dozent2.getName(), "Gruppeteilung in SoSe2024");
        dozent2.sprechstundenanfrageerhalten();
        // dozent2.feedbackVerwalten(student2.getName(),"sehr gut");

        // erzeugen Lehrveranstaltung
        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung(dozent1, new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>());
        lehrveranstaltung.addStudierender(student2);
        lehrveranstaltung.addVorlesungsstunde(new Vorlesungsstunde(dozent1, new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(), "Java", "2024-05-01", "10:00", "C303"));
        lehrveranstaltung.addPraktikumsstunde(praktikumsstunde);
        lehrveranstaltung.anzeigenVeranstaltungsdetails();
    }

    // erzeugen Sprechstunde
    // Sprechstunde sprechstunde = new Sprechstunde("Java", "2024-05-01", "10:00",
    // "C303");
    // sprechstunde.detailsAnzeigen();
    // erzeugen Feedback

    // dozent1.feedbackVerwalten(student1, "sehr gut" );
}
