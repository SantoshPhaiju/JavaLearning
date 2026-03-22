package CollectionFrameworkMasterClass.Map;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
//        Phone phone = new Phone("Apple", "16 pro max");
        /*
         * Used in caching
         */
        Phone phone1 = new Phone("Nokia", "Express Music");
        WeakReference<Phone> phone = new WeakReference<>(new Phone("Apple", "16 pro max"));
        System.out.println(phone.get());
        System.gc();

        try {
            Thread.sleep(5000);
        } catch (Exception ignored) {

        }

        System.out.println(phone.get());
    }
}

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone: {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
