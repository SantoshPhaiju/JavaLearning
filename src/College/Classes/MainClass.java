package College.Classes;

public class MainClass {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();

        bike.setColor("blue");
        bike.setPrice(500000.3F);
        bike.setName("Pulsar NS 200");
        bike.setVehicleType(Vehicle.type.TWO_WHEELER);
        bike.setId(1);

        System.out.println("Vehicle id is: " + bike.getId());
        System.out.println("Vehicle color is: " + bike.getColor());
        System.out.println("Vehicle name is: " + bike.getName());
        System.out.println("Vehicle price is: " + bike.getPrice());
        System.out.println("Vehicle type is: " + bike.getVehicleType());
    }
}
