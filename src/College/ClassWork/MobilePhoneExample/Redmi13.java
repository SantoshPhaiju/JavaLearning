package College.ClassWork.MobilePhoneExample;

public class Redmi13 extends  Android{
    public Redmi13(String name, int price) {
        super(name, price);
    }

    @Override
    public void playGame() {
        System.out.println(name + " is playing game with me...");
    }

    @Override
    public void call() {
        System.out.println(name + " is calling 9837826734...");
    }
}
