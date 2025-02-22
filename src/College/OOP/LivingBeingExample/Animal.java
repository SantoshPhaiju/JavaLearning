package College.OOP.LivingBeingExample;

public class Animal extends LivingBeing {
    public Animal(String name) {
        super(name);
    }

    public int legs = 4;

    @Override
    public void walk() {
        System.out.println("Animal is walking on " + legs + " legs");
    }


}
