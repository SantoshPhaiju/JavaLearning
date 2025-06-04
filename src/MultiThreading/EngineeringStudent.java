package MultiThreading;

public class EngineeringStudent implements Student {

    @Override
    public String getBio(String name) {
        return name + " is an engineering student";
    }
}
