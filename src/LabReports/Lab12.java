package LabReports;

class EncapEx {
    private String name;
    public EncapEx(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Lab12 {
    public static void main(String[] args) {
        EncapEx encapEx = new EncapEx("Santosh Phaiju");
        System.out.println(encapEx.getName());
    }
}
