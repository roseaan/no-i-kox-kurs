public class Main {

    public static void main(String[] args) {
        Osoba klient = new Osoba("Marcelina", "Kasprzyk", 2, 14);
        System.out.println(klient.wyswietl());


        Kelner kelner = new Kelner("Maka", "Paka", 27, 2, 1200);
        System.out.println(kelner.wyswietl());


        Kucharz kucharz = new Kucharz("Józef", "Kożuch", 26, 2400, "wysoki", "desery");
        System.out.println(kucharz.wyswietl());


        Danie danie1 = new Danie("Sernik", 24);
        System.out.println(danie1.wyswietl());


        Szef szef = new Szef("Grzegorz", "Brzęczyszczykiewicz", 32, 3400, 1200);
        System.out.println(szef.wyswietl());
    }
}
