package InnerClasses;

public class Test {
    public static void main(String[] args) {

        /*
 Member Inner Class
        Car car = new Car("BMW");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
 Static Nested Inner Class
        Computer computer = new Computer("HP", "ABC", "Windows");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
        Computer.USB usb2 = new Computer.USB("TYPE-B");
        usb.displayInfo();
        usb2.displayInfo();
*/

        /*
        * Here i'm using anonymous inner class in java
        * Instead of this thing i can also use lambda expression hehee
         */

/*
        ShoppingCart shoppingCart = new ShoppingCart(150);
        CreditCardV0 creditCard = new CreditCardV0("4323");
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("You have paid " + amount + "$ using credit card.");
            }
        });


        shoppingCart.processPayment(amount ->
                System.out.println("You have paid " + amount + "$ using PayPal.")
        );
*/

        Hotel hotel = new Hotel("Sunsine Hotel", 10, 5);
        hotel.reserveRoom("Santosh Phaiju", 5);
        hotel.reserveRoom("Saugat", -1);





    }
}
