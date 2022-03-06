public class Kelner extends Osoba{
    int wiek;
    int pietro;
    int wynagrodzenie;

    public Kelner(String imie, String nazwisko, int wiek, int pietro, int wynagrodzenie) {
        super(imie, nazwisko);
        this.wiek = wiek;
        this.pietro = pietro;
        this.wynagrodzenie = wynagrodzenie;
    }
    public Kelner(String imie, String nazwisko, int wiek, int wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    public String wyswietl() {
        return(this.imie + " " + this.nazwisko + " " + this.wiek + " " + this.pietro + " " + this.wynagrodzenie);
    }
    public int getWiek() {
        return this.wiek;
    }
    public int getPietro() {
        return this.pietro;
    }
    public int getWynagrodzenie() {
        return this.wynagrodzenie;
    }

}
