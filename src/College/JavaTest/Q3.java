package College.JavaTest;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean isAdult() {
        return age >= 18;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person person = new Person("Santosh Phaiju", 20);
        person.displayDetails();
        boolean isAdult = person.isAdult();
        if(isAdult) {
            System.out.println("You are a adult ???? Huhhh, I don't think so!!!  ");
        } else {
            System.out.println("Hehe 😁 You are just a kid as of now 😁");
        }
    }
}
