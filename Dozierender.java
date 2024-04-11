import java.util.List;
import java.util.ArrayList;

public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;
    private List<String> termine;
    private List<String> feedbacks;
    
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.termine = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
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

    public List<String> getTermine() {
        return termine;
    }
    
    /*public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println("Antwort von: "+this.name+"\nAntwort an: "+studierender.getName() + ": " + antwort);
    }*/

    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println(name + " antwortet " + studierender.getName() + ": " + antwort);
    }
    
    /*public void sprechstundeAnfrage(Studierender studierender, String frage) {
        System.out.println("Frage von: "+studierender.getName()+"\nFrage an: "+this.name + ": " + frage);
    }*/

    public void sprechstundenAnfrageEmpfangen(Studierender studierender, String termin) {
        System.out.println(name + " empfängt Sprechstundenanfrage von " + studierender.getName() + ": " + termin);
        termine.add(termin);
    }

    public void feedbackEmpfangen(String feedback) {
        feedbacks.add(feedback);
        System.out.println(name + " erhält Feedback: " + feedback);
    }

}
