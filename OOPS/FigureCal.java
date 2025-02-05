class Square{
    int sides;  // these are atributes or properties
    public int perimeter(){
        return 4*sides;
    }
    public int area(){
        return sides*sides;
    }

}

class Rectangle{
    int side1;
    int side2;    // these are atributes or properties
    public int perimeter(){
        return 2*(side1+side2);
    }
    public int area(){
        return side1*side2;
    }

}


class Circle{
    int radius;    // these are atributes or properties
    double pi = 3.1415;

    public double perimeter(){
        return 2*pi*radius;
    }
    public double area(){
        return pi*radius*radius;
    }

}

public class FigureCal{
    public static void main(String[]args){
        Square sq = new Square();
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();

        
        sq.sides = 3;
        rec.side1 = 2;
        rec.side2 = 3;
        cir.radius = 3;
        System.out.print("the perimeter of the square is "+sq.perimeter());
        System.out.print("\nthe area of the square is "+sq.area());

        System.out.print("\nthe perimeter of the rectangle is "+rec.perimeter());
        System.out.print("\nthe area of the rectangle is "+rec.area());

        System.out.print("\nthe perimeter of the circle is "+cir.perimeter());
        System.out.print("\nthe area of the circle is "+cir.area());
    }

}