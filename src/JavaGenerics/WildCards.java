package JavaGenerics;

import java.util.ArrayList;

public class WildCards {
    public static void main(String[] args) {

    }

    // while doing readonly kam we can use wild card type <?>
    public void printArrayList(ArrayList<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }

    }

    // but while doing returning wala kam we have to use generic types
    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }
}
