abstract class Shape {
    // Abstract methods
    public abstract void draw();
    public abstract double area();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area of the circle: " + circle.area());
    }
}
