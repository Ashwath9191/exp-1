abstract class Animal {
    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Calls concrete method
        dog.sound(); // Calls implemented abstract method
    }
}
