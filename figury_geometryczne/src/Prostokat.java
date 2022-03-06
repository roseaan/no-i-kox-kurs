public class Prostokat extends Figura_geometryczna{
    private int a;
    private int b;

    public Prostokat (int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double policzPole() {
        setPole(a*b);
        System.out.println("Pole prostokątu = "+super.getPole());
        return a*b;
    }
}
