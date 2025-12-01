package InnerClasses;

public class Test {
    public static void main(String[] args) {

        // Member Inner Class
//        Car car = new Car("BMW");
//        Car.Engine engine = car.new Engine();
//        engine.start();
//        engine.stop();

        // Static Nested Inner Class
        Computer computer = new Computer("HP", "ABC", "Windows");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
        Computer.USB usb2 = new Computer.USB("TYPE-B");
        usb.displayInfo();
        usb2.displayInfo();
    }
}
