public class Main {

    public static void main(String[] args) {
        Osoba os = new Osoba("marcelina", "kasprzyk", 16);
        System.out.println(os.wyswietl());

        Uczen uczens = new Uczen("marcelina", "kasprzyk", 16, "elektronik", 1);
        uczens.wyswietl();
        System.out.println(uczens.wyswietl());

        Pracownik prac = new Pracownik("szymon", "siuba", 420, "nauczyciel", 3);
        prac.wyswietl();
        System.out.println(prac.wyswietl());

        Szef szef = new Szef("grzegorz", "brzęczyszczykiewicz", 32, "dyrektor", 2000, 800);
        szef.wyswietl();


        Osoba tablicaOsoby[] = new Osoba[5];
        tablicaOsoby[0] = new Osoba("Marcelina", "Kasprzyk", 16);
        tablicaOsoby[1] = new Pracownik("Szymon", "Siuba", 420, "nauczyciel", 3);
        tablicaOsoby[2] = new Szef("Grzegorz", "Brzęczyszczykiewicz", 32, "dyrektor", 2000, 800);
        tablicaOsoby[3] = new Uczen("Baba", "Bibi", 24, "elektronik", 2);
        tablicaOsoby[4] = new Student("ZIGZAK", "MAGKLIN", 12);

        for (Osoba osoba: tablicaOsoby) {
                System.out.println(osoba.wyswietl());}

    }
}