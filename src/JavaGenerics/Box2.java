package JavaGenerics;

public class Box2 {

    // Here we go with the generic constructor
    public <T extends Number> Box2(T value) {

    }

    public static void main(String[] args) {
        Box2 box2 = new Box2(12);
    }
}
