package interfaces;


// Interfaces can only contain static constants and abstract methods
// Interface -> blueprint for class
// interface tends to provide -> multiple inheritance and abstraction


import interfaces.Animals.Animal;
import interfaces.Animals.Cat;
import interfaces.Animals.Dog;

public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.sleep();
        myDog.eat();
        System.out.println("from dog " + Dog.MAX_AGE);
        System.out.println("from animal interface " + Animal.LEGS);
        Animal.info();
        myDog.run();
        myCat.run();
    }
}
