package LabReports;

// Write a program that demonstrates method overriding with a subclass.

class Android {
    void playSong() {
        System.out.println("Playing android song");
    }
}

class Redmi extends Android {
    @Override
    void playSong() {
        System.out.println("Playing redmi song");
    }
}


public class Lab18 {
    public static void main(String[] args) {
        Redmi myRedmi = new Redmi();
        myRedmi.playSong();
    }
}
