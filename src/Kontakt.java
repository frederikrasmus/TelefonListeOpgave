public class Kontakt {

    private String navn;
    private int telefon;

    public Kontakt(String n, int t) {
        navn = n;
        telefon = t;
    }

    public String getNavn() {
        return navn;
    }

    public int getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Navn; " + navn + "\nTelefon; " + telefon + "\n";
    }
}
