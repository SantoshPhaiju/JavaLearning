package College.OOP.LivingBeingExample;

public class Bird extends LivingBeing {
    public Bird(String name) {
        super(name);
    }

    int wings = 2;

    @Override
    public void walk() {
        System.out.println(name + " is flying on " + wings + " wings");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on the nest 🪹");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating chara");
    }
}
