package College.ClassWork.MobilePhoneExample;

public class IPhone16 extends IOS{
    public IPhone16(String name, int price) {
        super(name, price);
    }

    @Override
    public void call() {
        System.out.println(name + " is making a call...");
    }

    @Override
    public void playGame() {
        System.out.println(name + " is playing PES 2025...");
    }
}
