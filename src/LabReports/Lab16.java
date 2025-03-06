package LabReports;


// Write a program to demonstrate inheritance with a subclass and superclass.
class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class Lab16 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
