public abstract class Figura_geometryczna {
    private double pole;
    private double obwod;
    public void setPole(int pole) {
        this.pole = pole;
    }
    public double getPole() {
        return pole;
    }
    public void setPole(double pole) {
        this.pole = pole;
    }
    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public abstract double policzPole();

    public double policzObwod() {
        System.out.println("Obwód figury = ");
        return 0;
    }
}
