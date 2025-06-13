package LabReports;


import java.io.*;

class Student implements Serializable {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Lab50 {
    public static void main(String[] args) {
        /*
            Write a Java program that:
            Defines a class Student with name and rollNo as fields and implements Serializable.
            Serializes an object of Student to a file named student.ser.
            Deserializes the object and prints its content.
         */

        Student student = new Student("Santosh", 24);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Student object has been serialized to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("\nDeserialized Student:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
