package College.ClassWork.MobilePhoneExample;

public abstract class MobilePhone {
    public String name;
    public int price;

    public MobilePhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void displayPrice() {
        System.out.println(this.name + " price is: " + this.price);
    }

    abstract void call();
    abstract void playGame();

}
