public class Osoba {
    String imie;
    String nazwisko;
    int pietro_restauracji;
    int numer_stolika;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Osoba(String imie, String nazwisko, int pietro_restauracji, int numer_stolika) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pietro_restauracji = pietro_restauracji;
        this.numer_stolika = numer_stolika;
    }
    public String getImie() {
        return this.imie;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    public int getPietro_restauracji() {
        return this.pietro_restauracji;
    }
    public int getNumer_stolika() {
        return this.numer_stolika;
    }
    public String wyswietl() {

        return(this.getImie() + " " + this.getNazwisko() + " " + this.getPietro_restauracji() + " " + this.getNumer_stolika());
    }

}
