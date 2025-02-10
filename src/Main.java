import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TelefonListen tListe = new TelefonListen();
        ListePersistens lp = new ListePersistens();

        lp.fyldListeOp(tListe);

        Scanner input = new Scanner(System.in);
        boolean con = true;

        OpretKontakt ok = new OpretKontakt(tListe);

        while(con) {
            System.out.println("1. Opret Kontakt");
            System.out.println("2. Vis kontakter");
            System.out.println("3. Find kontakt");
            System.out.println("4. Slet Kontakt");
            System.out.println("0. close program");
            try {
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        ok.opretKontakt();
                        break;
                    case 2:
                        tListe.udskrivListe();
                        break;
                    case 3:
                        System.out.println("Indtast navn for at søge på kontakt: ");
                        String soegeNavn = scanner.nextLine();
                        System.out.println(tListe.findKontakt(soegeNavn));
                        break;
                    case 4:
                        System.out.println("Indtast navn for at finde kontakt du vile slette: ");
                        String sletNavn = scanner.nextLine();
                        System.out.println(tListe.sletKontakt(sletNavn));
                        break;

                    case 0:
                        lp.gemListe(tListe.getListe());
                        con = false;
                        System.out.println("Program closing...");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Fejl: Indtast et gyldigt tal.");
                input.nextLine();
            }
        }
        input.close();
    }
}
