class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
  
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Invoking the makeSound() method, demonstrating runtime polymorphism
        dog.makeSound();
        cat.makeSound();
    }
}
