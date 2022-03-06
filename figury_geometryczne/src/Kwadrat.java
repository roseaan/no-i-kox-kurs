public class Kwadrat extends Figura_geometryczna{
    private int a;
    public Kwadrat(int a) {
        this.a = a;
        super.setPole (policzPole());
        super.setObwod (4*a);
    }
    public void setA(int a) {
        this.a = a;
        super.setPole(a*a);
        super.setObwod(4*a);
    }
    public int getA() {
        return a;
    }
    public  double policzPole(){
        System.out.println("Pole kwadratu = "+super.getPole());
        super.setPole(a*a);
        return a*a;
    }
    public double policzObwod() {
        System.out.println("Obwód kwadratu = ");
        return 4*a;
    }

}
