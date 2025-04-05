class Car {
    private int speed;

    public void setSpeed(int s) {
        if (s >= 0 && s <= 200)
            speed = s;
    }

    public int getSpeed() {
        return speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(120);
        System.out.println("Car speed: " + c.getSpeed() + " km/h");
    }
}
