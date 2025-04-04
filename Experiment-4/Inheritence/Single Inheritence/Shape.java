// Parent class
class Shape {
    double length = 5;
    double width = 3;

    void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

// Child class
class Rectangle extends Shape {
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.displayDimensions(); // inherited method
        rect.calculateArea();     // method in child class
    }
}
