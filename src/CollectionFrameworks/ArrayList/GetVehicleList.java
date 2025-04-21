package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetVehicleList {
    public static void main(String[] args) {

        List <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("TESLA", "BLACK"));
        vehicles.add(new Vehicle("BMW", "BLUE"));
        vehicles.add(new Vehicle("MERCEDES", "WHITE"));
        vehicles.add(new Vehicle("FERRARI", "YELLOW"));

        vehicles.forEach(vehicle -> System.out.println(vehicle.getName()));

    }
}
