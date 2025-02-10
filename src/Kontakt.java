public class Kontakt {

    private String navn;
    private String telefon;

    public Kontakt(String n, String t) {
        navn = n;
        telefon = t;
    }

    public String getNavn() {
        return navn;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Navn; " + navn + "\nTelefon; " + telefon + "\n";
    }
}
