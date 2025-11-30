package interfaces.Animals;

public interface Animal {

    // here access modifier public is automatically added and abstract is also automatically added, no need to write it
    /**
     * After java 8 interface can have static constants and default methods
     */

    // Static constants
    int MAX_AGE = 150;
    int LEGS = 4;

    // abstract methods
    public abstract void eat();

    void sleep();

    // static methods
    static void info() {
        System.out.println("This is an animal interface!");
    }

    // default methods
    default void run() {
        this.eat();
        this.sleep();
        System.out.println("Animal is running");
    }

}
