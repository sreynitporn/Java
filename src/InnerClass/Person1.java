package InnerClass;

public class Person1 {
    // Main class
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        Animal animal = new Dog();

        // Calling the makeSound() method on the object
        animal.makeSound();
    }
}
