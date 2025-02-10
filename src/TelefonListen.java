import java.util.HashMap;

public class TelefonListen {

    private HashMap<String,Kontakt> tListe;

    public TelefonListen() {
        tListe = new HashMap<>();
    }

    public void addKontakt(Kontakt k) {
        tListe.put(k.getNavn(), k);
    }

    public String findKontakt(String navn) {

        for (Kontakt k : tListe.values()) {
            if (k.getNavn().equalsIgnoreCase(navn)) {
                return "Kontakt fundet:\n" + k;

            }
        }
        return "Kontakt ikke fundet!";
    }

    public String sletKontakt(String navn) {
        for(Kontakt k : tListe.values()) {
            if(k.getNavn().equalsIgnoreCase(navn)) {
                tListe.remove(k.getNavn());
                return "Kontakt " + navn + " Er blevet slettet\n";
            }
        }
        return "kontakt ikke fundet!";
    }

    public HashMap<String,Kontakt> getListe() {
        return tListe;
    }

    public void udskrivListe() {
        System.out.println("===Liste over kontakter===");
        for(Kontakt k : tListe.values()) {
            System.out.println(k.getNavn());
        }
    }
}
