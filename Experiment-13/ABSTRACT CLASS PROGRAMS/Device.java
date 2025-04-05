abstract class Device {
    // Default implementation
    public void turnOn() {
        System.out.println("Device is now ON.");
    }

    // Abstract method
    public abstract void operate();
}

class Phone extends Device {
    public void operate() {
        System.out.println("Phone is calling.");
    }
}

class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.turnOn(); // Calls the default implementation
        phone.operate(); // Calls the implemented method
    }
}
