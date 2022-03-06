public class Uczen extends Osoba{

    private String szkola;
    private int klasa;

    public Uczen() {}

    public String wyswietl() {

        return (super.wyswietl()+ " " + this.szkola + " " + this.klasa);
    }

    public Uczen(String imie, String nazwisko, int wiek, String szkola, int klasa) {
        super(imie, nazwisko, wiek);
        this.szkola = szkola;
        this.klasa = klasa;
    }

    public String getSzkola() {
        return this.szkola = szkola;
    }

    public int getKlasa() {
        return this.klasa = klasa;
    }

}
