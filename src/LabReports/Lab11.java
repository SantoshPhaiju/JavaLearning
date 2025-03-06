package LabReports;

class ExampleClass {
    final private int number;
    public ExampleClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Lab11 {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass(100);
        System.out.println(exampleClass.getNumber());
    }
}
