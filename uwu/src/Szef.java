public class Szef extends Pracownik{
    private int premia;

    public String wyswietl() {
        return (super.wyswietl() + " " + this.premia);
    }

    public Szef(String imie, String nazwisko, int wiek, String stanowisko, int wynagrodzenie, int premia) {
        super(imie, nazwisko, wiek, stanowisko, wynagrodzenie);
        this.premia = premia;
    }
    public int getPremia() {
        return this.premia = premia;
    }
}
