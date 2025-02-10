import java.io.*;
import java.util.HashMap;

public class ListePersistens {

    private File fil;


    public ListePersistens() {
        fil = new File("telefonliste.txt");
    }

    public void gemListe(HashMap<String, Kontakt> tListe) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fil))) {
            for(Kontakt k : tListe.values()) {
                writer.write(k.getNavn() + ";" + k.getTelefon());
                    writer.newLine();
            }
            System.out.println("TelefonListe gemt til fil!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fyldListeOp(TelefonListen tListe) {
        if(!fil.exists()) {
            System.out.println("Ingen telefonliste fil fundet!");
            return;
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(fil))) {
            String line;
            while((line = reader.readLine()) !=null) {
                String[] data = line.split(";");
                if(data.length == 2) {
                    String navn = data[0];
                    int tlf = Integer.parseInt(data[1]);
                    Kontakt k = new Kontakt(navn,tlf);
                    tListe.addKontakt(k);
                }
            }
            System.out.println("Telefon Liste indlæst fra fil");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
