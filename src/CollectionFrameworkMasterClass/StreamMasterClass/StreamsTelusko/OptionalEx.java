package CollectionFrameworkMasterClass.StreamMasterClass.StreamsTelusko;

import java.util.Arrays;
import java.util.List;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Santosh", "Navin", "Laxmi", "John", "Kishor");
        String name = names.stream()
                .filter(str -> str.contains("z"))
                .findFirst()
                .orElse("Not found");
        System.out.println(name);
//        Optional<String> name = names.stream()
//                .filter(str -> str.contains("z"))
//                .findFirst();
//        System.out.println(name.orElse("Not found"));

    }
}
