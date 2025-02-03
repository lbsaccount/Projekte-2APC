
class Zeugnis {

    String name;
    String gDatum;
    String zDatum;
    int fach;
    Noten note = new Noten();

    public Zeugnis(String name, String gDatum, String zDatum, int fach) {
        this.name = name;
        this.gDatum = gDatum;
        this.zDatum = zDatum;
        this.fach = fach;
        note.hinzufuegen(fach);
    }

    public void printS(){
        System.out.println("---------------");
        System.out.println("Name " + name);
        System.out.println("Geburts Datum " + gDatum);
        System.out.println("---------------");
        System.out.println("Fächer");
        note.printL();
        System.out.println();
        System.out.println("---------------");
        System.out.println("Zeugnis Datum " + zDatum);

    }
}
