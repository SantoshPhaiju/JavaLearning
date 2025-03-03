package College.ClassWork.MobilePhoneExample;

public class IOS extends MobilePhone {
    public IOS(String name, int price) {
        super(name, price);
    }

    public void call() {
        System.out.println("IOS is making a call...");
    }

    public void playGame() {
        System.out.println("Game is being played in IOS...");
    }
}
