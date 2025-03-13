package LabReports;

interface Employee {
    void work();
    void takeLeave();
}

class Manager implements Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing teams and projects.");
    }

    @Override
    public void takeLeave() {
        System.out.println("Manager is taking a strategic break.");
    }
}


public class Lab20 {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.work();
        manager.takeLeave();
    }
}
