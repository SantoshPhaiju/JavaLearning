package CollectionFrameworkMasterClass.StreamMasterClass.StreamsTelusko;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Santosh", "Navin", "Harsh", "John", "Kishor");
        // Print everything in capital

//        List<String> uNames = names.stream()
//                .map(str -> str.toUpperCase()).toList();

        // syntax: ClassName::MethodName
        List<String> uNames = names.stream()
                .map(String::toUpperCase).toList();

        uNames.forEach(System.out::println); // using method reference
        System.out.println(names);
        System.out.println(uNames);

    }
}
