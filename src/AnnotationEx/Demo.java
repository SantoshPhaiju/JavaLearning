package AnnotationEx;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name();

    int version();
}

@MyAnnotation(name = "John", version = 1)
class User {
}

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        MyAnnotation annot = user.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annot.name() + " " + annot.version());
    }
}
