public class App {

    public static void main(String[] args) throws Exception {

        //Erstellung von Kommunikationsteilnehmern
        Dozierender dozent1 = new Dozierender("Prof. Nestler", "Informatik", "C303");
        Dozierender dozent2 = new Dozierender("Prof. Sturm", "Informatik", "J102");
        Studierender student1 = new Studierender("Sarvar", 1234567, "UXD2");
        Studierender student2 = new Studierender("Ada", 1357913, "UXD2");
        
        //Test des Dialogs, Aufgabe 2
        student2.frageStellen(dozent1, "Wann haben wir Praktikum?");
        System.out.println();
        dozent1.frageBeantworten(student2, "Praktikum findet am Freitag statt.");
        System.out.println();
        
        //Test des Dialogs, Aufgabe 3
        student1.sprechstundenAnfrageSenden(dozent2, "Mittwoch, 14:00 Uhr");
        System.out.println();
        //dozent2.sprechstundenAnfrageEmpfangen(student1, "Mittwoch, 14:00 Uhr");
        System.out.println();

        System.out.println(student1.getSprechstundenAnfragen().get(0));
        System.out.println(dozent2.getTermine().get(0));

        //Test Aufgabe 4
        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung("SWE2");
        lehrveranstaltung.addStudierender(student1);
        lehrveranstaltung.addStudierender(student2);
        lehrveranstaltung.addDozierender(dozent1);
        lehrveranstaltung.addDozierender(dozent2);

        Vorlesungsstunde vorlesungsstunde = new Vorlesungsstunde("SWE2", "Git", "2024-04-11", "09:55", "K015");
        lehrveranstaltung.addVorlesungsstunde(vorlesungsstunde);

        Praktikumsstunde praktikumsstunde = new Praktikumsstunde("SWE2", "Git. Praktikum", "2024-04-12", "09:00", "C303");
        praktikumsstunde.addAufgabe("Aufgabe 1.");
        lehrveranstaltung.addPraktikumsstunde(praktikumsstunde);

        System.out.println("Anzahl der Studierenden in der Lehrveranstaltung: " + lehrveranstaltung.getStudierende().size());
        System.out.println("Anzahl der Dozierenden in der Lehrveranstaltung: " + lehrveranstaltung.getDozierende().size());

        lehrveranstaltung.removeStudierender(student1);
        System.out.println("Anzahl der Studierenden in der Lehrveranstaltung nach Entfernen: " + lehrveranstaltung.getStudierende().size());


        lehrveranstaltung.anzeigenDetails();
        vorlesungsstunde.anzeigenDetails();
        praktikumsstunde.anzeigenDetails();

    }
}

