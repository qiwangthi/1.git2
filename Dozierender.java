public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;

    // private int note;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        // this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    public void setBueronummer(String bueronummer) {
        this.bueronummer = bueronummer;
    }

    /*
     * public void feedbackAnzeigen() {
     * System.out.println("Feedback von: " + this.name);
     * for (String feedback : feedback) {
     * System.out.println(feedback);
     * }
     * }
     * 
     * /*
     * public int getNote() {
     * return note;
     * }
     * 
     * public void setNote(int note) {
     * this.note = note;
     * }
     */
    // frage method
    public void fragebeantworten(Studierender student, String antwort) {
        System.out.println("Frage beantworten: " + antwort);
    }
    // System.out.println("Frage beantworten: " + frage);

    public void sprechstundenanfrageerhalten() {
        System.out.println("Sprechstundenanfrage erhalten von: " + this.name);

    }

}
