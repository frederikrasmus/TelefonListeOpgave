import java.util.Scanner;

public class OpretKontakt {

    private Scanner scanner;
    private TelefonListen tl;

    public OpretKontakt(TelefonListen tl) {
        scanner = new Scanner(System.in);
        this.tl = tl;
    }
    public void opretKontakt() {
        System.out.println("Indtast: Navn på Kunde: ");
        String navn = scanner.nextLine();

        System.out.println("Indtast: Telefonummer: ");
        String tlf = scanner.nextLine();
        scanner.nextLine();

        Kontakt k = new Kontakt(navn,tlf);
        tl.addKontakt(k);
        System.out.println("Person tilføjet til kontakter");
    }
}
