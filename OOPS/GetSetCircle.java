class Circle {
    private int radius;
    private final double pi = 3.1415;

    public void setPerimeter(int r) {
        radius = r;
    }

    public String getPerimeter() {
        return "the perimeter of the circle is " + 2 * pi * radius;
    }

    public void setArea(int r) {
        radius = r;
    }

    public String getArea() {
        return "the area of the circle is " + pi * radius * radius;
    }
}

public class GetSetCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setPerimeter(3);
        System.out.println(cir.getPerimeter());
        cir.setArea(3);
        System.out.println(cir.getArea());
    }
}