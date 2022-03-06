public class Danie{
    String nazwa;
    int cena;

    public String wyswietl() {

        return(this.nazwa + " " + this.cena);
    }

    public Danie(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public String getNazwa() {
        return this.nazwa;
    }
    public int getCena() {
        return this.cena;
    }
}
