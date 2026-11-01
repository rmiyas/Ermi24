abstract class Animal {

    // Encapsulation
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstraction
    abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    // Polymorphism
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating Objects
        Dog dog = new Dog("Bobby", 3);
        Cat cat = new Cat("Kitty", 2);

        System.out.println("DOG INFORMATION");
        dog.displayInfo();
        dog.makeSound();

        System.out.println();

        System.out.println("CAT INFORMATION");
        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        // Runtime Polymorphism
        Animal animal1 = new Dog("Rocky", 4);
        Animal animal2 = new Cat("Luna", 1);

        animal1.makeSound();
        animal2.makeSound();
    }
}
