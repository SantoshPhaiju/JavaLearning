package College.ClassWork.MobilePhoneExample;

public class Android extends MobilePhone {
    public Android(String name, int price) {
        super(name, price);
    }

    public void call() {
        System.out.println("Calling mobile phone with mobile phone number");
    }

    public void playGame() {
        System.out.println("Playing mobile phone with mobile phone number");
    }

}
