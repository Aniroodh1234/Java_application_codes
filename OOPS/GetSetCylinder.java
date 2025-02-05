class cylinder{
    private int radius;
    private int height;
    double pi = 3.1415;

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2 * pi * radius * radius + 2 * pi * radius * height;
    }
    public double volume(){
        return pi * radius * radius * height;
    }
}

public class GetSetCylinder{
    public static void main(String[]args){
        cylinder cyl = new cylinder();
        cyl.setRadius(3);
        cyl.setHeight(4);
        System.out.println("the radius of the cylinder is "+cyl.getRadius());
        System.out.println("the radius of the cylinder is "+cyl.getHeight());
        System.out.println("the surface area of the cylinder is " +cyl.surfaceArea());
        System.out.println("the volume of the cylinder is " +cyl.volume());
        }
    }