package College.OOP.LivingBeingExample;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human("Santosh");
        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa");
        Bird parrot = new Bird("Parrot");


        human.eat();
        human.sleep();
        human.walk();

        parrot.walk();
        parrot.eat();
        parrot.sleep();

        mufasa.type = LionType.KING_LION;
        simba.type = LionType.PRINCE_LION;
        simba.eat();
        String simbaDetails = simba.getDetails();
        String mufasaDetails = mufasa.getDetails();
        System.out.println(mufasaDetails);
        System.out.println(simbaDetails);

    }
}
