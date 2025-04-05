interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    double length = 5;
    double width = 3;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
