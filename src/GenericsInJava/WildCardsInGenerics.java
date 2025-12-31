package GenericsInJava;

import java.util.ArrayList;

public class WildCardsInGenerics {
    public static void main(String[] args) {

    }

    // instead of doing this here we can use wildcards for readonly operation <?>
    public <T> void printArrayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    // we are able to do this here because we are not doing any write operation or returning anything from this method which would break the type safety, but we are just reading the data so we can do this okay.
    public void printArrayList2(ArrayList<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // if we were returning the value then we must have to use type parameters like this:
    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }
}
