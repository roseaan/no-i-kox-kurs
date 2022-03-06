public class Szef extends Osoba{
    int premia;

    public String wyswietl() {

        return(super.wyswietl() + " " + this.premia);
    }

    public Szef(String imie, String nazwisko, int wiek, int wynagrodzenie, int premia) {
        super(imie, nazwisko, wiek, wynagrodzenie);
        this.premia = premia;
    }
}
