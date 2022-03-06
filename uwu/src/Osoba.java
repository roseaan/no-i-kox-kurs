public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    public Osoba() {}
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Osoba(int wiek) {
        this.wiek = wiek;
    }
    public Osoba(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getWiek() {
        return this.wiek;
    }

    public String wyswietl() {
        return(this.getImie() + " " + this.getNazwisko() + " " + this.getWiek());
    }
}
