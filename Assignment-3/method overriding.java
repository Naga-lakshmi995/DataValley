// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // Method overloading
    void makeSound(String sound) {
        System.out.println("Dog " + sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks

        // Overloaded method call
        dog.makeSound("howls"); // Output: Dog howls
    }
}
