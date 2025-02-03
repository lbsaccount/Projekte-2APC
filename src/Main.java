import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Scanner leser = new Scanner(System.in);
        Noten note = new Noten();
        Zeugnis zeugnis = null;
        boolean loop = true;
        ArrayList<Zeugnis> alleZeugnisse = new ArrayList<>();

        do {

            System.out.println("auswahl | 1 - Neuer Schüler / 2 - Ausdruck liste / 3 - Ende");
            int i = leser.nextInt();

            if (i == 1) {
                System.out.println("Name");
                String name = leser.next();
                System.out.println("Geburtsdatum");
                String gDatum = leser.next();
                System.out.println("Zeugnis datum");
                String zDatum = leser.next();
                System.out.println("Fächer");
                int fach = leser.nextInt();

                zeugnis = new Zeugnis(name, gDatum, zDatum, fach);
                alleZeugnisse.add(zeugnis);

            } else if (i == 2) {
                for (Zeugnis zeugi : alleZeugnisse) {
                    zeugi.printS();
                }
            }else{
                loop = false;
            }
        }while(loop);
    }
}
