package College.OOP.LivingBeingExample;

public class Human extends LivingBeing {

    Human(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating PaniPuri 😝😋");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in bed");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking on " + legs + " legs");
    }
}
