package CollectionFrameworkMasterClass.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
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

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
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

        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Santosh", 1);
        Person p2 = new Person("Saugat Gautam", 2);
        Person p3 = new Person("Santosh", 1);

        p1.display();

        map.put(p1, "Java Developer"); // hashcode1 --> index1
        map.put(p2, "App Developer"); // hashcode2 --> index2
//      map.put(p3, "Java Instructor"); // hashcode3 --> index3, -> here we are using the default Object methods like hashcode and equals so this will not be       equal because it internally uses memory location to generate the hashcode so they will never be equal
        map.put(p3, "Java Instructor"); // hashcode1 --> index1, -> here we have created our own hashcode and equals method in the person class so this will be equal

        System.out.println(map);
        System.out.println(p1);

        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));


        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Santosh", 90); // hashcode1 --> index1
        map1.put("Messi", 92); // hashcode2 --> index2
        map1.put("Santosh", 99); // hashcode1 --> index1 --> equals() --> replace
        System.out.println(map1);
    }
}
