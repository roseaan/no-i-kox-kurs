public class Main {

    public static void main(String[] args) {
        Figura_geometryczna figury[] = new Figura_geometryczna[3];
        figury[0] = new Kwadrat(4);
        figury[1] = new Kwadrat(6);
        figury[2] = new Kwadrat(5);
        for (Figura_geometryczna f: figury){
            f.policzPole();
        }
        Kwadrat k = new Kwadrat(5);
        System.out.println(k.getPole());
        k.setA(4);
        System.out.println(k.getPole());

        Prostokat p = new Prostokat(8, 2);
        p.policzPole();
    }
}
