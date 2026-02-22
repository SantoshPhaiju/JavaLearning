package CollectionFrameworkMasterClass.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FruitMap {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        HashMap<NewPerson, String> map = new HashMap<>();
        NewPerson p1 = new NewPerson("Alice", 1);
        NewPerson p2 = new NewPerson("Bob", 2);
        NewPerson p3 = new NewPerson("Alice", 1);

        map.put(p1, "Engineer"); // hashcode --> index
        map.put(p2, "Designer"); // hashcode --> index
        map.put(p3, "Manager"); // hashcode --> index


        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90);
        map1.put("Neha", 92);
        map1.put("Shubham", 99);

        map.forEach((key, value) -> System.out.println(key.getName() + " -> " + value));

    }
}

class NewPerson {
    private String name;
    private int id;

    // when we make custom class for using hashmaps, write custom hashcode method and equals method for making nodes or instances equal and unique.
    public NewPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        NewPerson other = (NewPerson) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
