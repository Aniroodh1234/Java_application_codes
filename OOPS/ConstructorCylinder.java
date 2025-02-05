class Cylinder{
    private final int radius;
    private final int height;
    double pi = 3.1415;

    public Cylinder(int r, int h){  //using constructor
        radius = r;
        height = h;
    }
    
    public double volume() {
        return pi * radius * radius * height;
    }
}
public class ConstructorCylinder{
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(3,4);
        System.out.println("Volume: " + cyl.volume());
    }
}
