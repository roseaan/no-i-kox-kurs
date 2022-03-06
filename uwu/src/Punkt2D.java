public class Punkt2D {
    public int x;
    int y;

    public Punkt2D(){}
    public Punkt2D(int x){
        this.x = x;
    }
    public Punkt2D(int abc, int y) {
         this.x = abc;
         this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void wyswietl() {
        System.out.println("x=" + this.x + ",y=" + this.y);
    }
}
