package College.Classes;

public class Vehicle {
    private int id;
    private String name;
    private float price;
    private String color;
    public enum type {
        TWO_WHEELER, FOUR_WHEELER
    }

    private type vehicleType;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private void drive() {
        System.out.println(this.name + " is running in road.");
    }


}
