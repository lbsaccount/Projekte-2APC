import java.util.*;

public class Noten {

    Scanner leser = new Scanner(System.in);
    ArrayList<Fach> fachListe = new ArrayList<>();

    public void hinzufuegen(int anzahlFaecher) {
        for (int i = 0; i < anzahlFaecher; i++) {
            System.out.println("Gegenstand Namen:");
            String name = leser.next();

            System.out.println(name + " Note:");
            int note = leser.nextInt();

            Fach fach = new Fach(name, note);
            fachListe.add(fach);

            System.out.println("Erfolgreich eingefügt");
        }
    }

    public void printL() {
        Collections.sort(fachListe, Comparator.comparing(fach -> fach.name));

        for (Fach fach : fachListe) {
            System.out.println(fach.name + ": " + fach.note);
        }

        System.out.print("Durchschnitt: " + durchschnitt());
    }

    public double durchschnitt() {
        int summe = 0;

        for (Fach fach : fachListe) {
            summe += fach.note;
        }

        return (double) summe / fachListe.size();
    }
}
