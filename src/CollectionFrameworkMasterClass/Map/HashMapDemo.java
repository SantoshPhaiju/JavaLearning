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
      /*
 HashMap Internal Working (Java)

 - HashMap internally uses an array of buckets:
     Node<K, V>[] table;

 - Each index in this array is called a "bucket".

 - Data is stored based on the hash of the key:
     index = hash(key) % array_size

 - Each bucket can contain multiple entries in case of collision.
   Collision is handled using:
     1. Linked List (default)
     2. Red-Black Tree (if entries exceed threshold, Java 8+)

 - Each entry inside a bucket (Node) contains 4 things:
     1. int hash       -> hash value of the key
     2. K key          -> the key
     3. V value        -> the value
     4. Node<K,V> next -> reference to next node (for chaining)

 - If multiple keys map to the same bucket:
     -> They are linked using 'next' pointer (linked list)
     -> Converted to balanced tree if size > 8 (Java 8+)

 - Key Points:
     • Not based on ArrayList (uses array internally)
     • Provides O(1) average time complexity
     • Allows one null key and multiple null values
*/
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
