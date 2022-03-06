public class Pracownik extends Osoba{
    private String stanowisko;
    private int wynagrodzenie;

    public Pracownik() {}

    public String wyswietl() {

        return (super.wyswietl() + " " + this.stanowisko + " " + this.wynagrodzenie + "zł");
    }

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko, int wynagrodzenie) {
        super(imie, nazwisko, wiek);
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }
    public String getStanowisko() {
       return this.stanowisko = stanowisko;
    }

    public int getWynagrodzenie() {
        return this.wynagrodzenie = wynagrodzenie;
    }


}
