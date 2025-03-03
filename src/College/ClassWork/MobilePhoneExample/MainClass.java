package College.ClassWork.MobilePhoneExample;

public class MainClass {
    public static void main(String[] args) {
        MobilePhone myRedmiPhone = new Redmi13("Redmi 13 5G", 34000);
        MobilePhone IPhone14Pro = new IOS("IPhone 14 Pro", 232000);
        MobilePhone IPhone16 = new IPhone16("IPhone 16", 164000);


        myRedmiPhone.call();
        myRedmiPhone.playGame();
        myRedmiPhone.displayPrice();

        IPhone14Pro.call();
        IPhone14Pro.playGame();
        IPhone14Pro.displayPrice();

        IPhone16.call();
        IPhone16.playGame();
        IPhone16.displayPrice();




    }
}
