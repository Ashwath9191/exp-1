abstract class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void honk();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void honk() {
        System.out.println(brand + " car honks.");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.honk();
    }
}
