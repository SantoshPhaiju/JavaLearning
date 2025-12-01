package InnerClasses;

public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os;

    // Static Nested Inner Class
    static class USB {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayInfo() {
            System.out.println("USB Type: " + type);
        }
    }

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Model: " + model + " Operating System: " + osName);
        }
    }


}
