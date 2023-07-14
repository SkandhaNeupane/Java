abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("Rufus", 3);
        Animal cat = new Cat("Fluffy", 2);
        
        dog.makeSound();
        cat.makeSound();
    }
}
