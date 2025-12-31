package JavaGenerics;

interface Printable {
    public void print();
}

interface MyBox {
    public void display();
}

class MyNumber extends Number implements Printable, MyBox {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void display() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }


    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

// yo vaneko k ho vaney, T ko thau ma testo class matra aauna milxa jun class le chai Number class lai extend gareko hos and then Printable ra MyBox interface lai implement gareko hos. okay sir. ani tyo class chai hya MyNumber xa jasle duabai condition fulfill gareko xa okay!

// ani hya multiiple boundation lagauda chai first vaneko jaile class hunxa and the second chai jaile interface hunxa.
class Boxx<T extends Number & Printable & MyBox> {
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class MyNewBox implements MyBox {
    @Override
    public void display() {
        System.out.println("MyNewBox: ");
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(16);
        MyNewBox myBox = new MyNewBox();
        // here this will give error because MyNewBox doesn't implements Printable and extends Number which is the mandatory bound of Boxx class. all the bounds are mandator okay.
//        Boxx<MyNewBox> newBox = new Boxx<MyNewBox>(myBox);
        Boxx<MyNumber> box = new Boxx<>(myNumber);
        box.display();
    }
}
