public class Kucharz extends Osoba {
    String poziom_zaawansowania;
    String specjalizacja;

    public String wyswietl() {

        return(super.wyswietl() + " " + this.poziom_zaawansowania + " " + this.specjalizacja);
    }

    public Kucharz(String imie, String nazwisko, int wiek, int wynagrodzenie, String poziom_zaawansowania, String specjalizacja) {
        super(imie, nazwisko, wiek, wynagrodzenie);
        this.poziom_zaawansowania = poziom_zaawansowania;
        this.specjalizacja = specjalizacja;
    }
    public Kucharz(String imie, String nazwisko, int wiek, int wynagrodzenie) {
        super(imie, nazwisko, wiek, wynagrodzenie);
    }
    public String getPoziom_zaawansowania() {
        return this.poziom_zaawansowania;
    }
    public String getSpecjalizacja() {
        return this.specjalizacja;
    }
}
