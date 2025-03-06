package LabReports;


// Write a program that demonstrates the usage of super to call a superclass method.
class NewAnimal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class NewDog extends NewAnimal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof!");
        super.makeSound();
    }
}

public class Lab17 {
    public static void main(String[] args) {
        NewDog myDog = new NewDog();

        myDog.makeSound();
    }
}
