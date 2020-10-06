public class Punkt3D extends Punkt2D{
    protected double z;
    Punkt3D(){
        super();
        z = 0.0;
    }
    Punkt3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    @Override
    public String toString(){
        StringBuilder ch = new StringBuilder();
        ch.append(super.toString());
        ch.append("Współrzędna z = ").append(z).append("\n");
        return ch.toString();
    }
}

public class Punkt2D {
    protected double x,y;
    Punkt2D(){
        x = 0.0;
        y = 0.0;
    }
    Punkt2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    Punkt2D(Punkt2D punkt){
        x = punkt.x;
        y = punkt.y;
    }
    @Override
    public String toString(){
        StringBuilder ch = new StringBuilder();
        ch.append("Współrzędna x = ").append(x).append("\n");
        ch.append("Współrzędna y = ").append(y).append("\n");
        return ch.toString();
    }
}

public class Z5B {

    public static void main(String[] args) {
        Punkt3D p = new Punkt3D(5, 2, 8.5);
        System.out.print(p);
    }
}
