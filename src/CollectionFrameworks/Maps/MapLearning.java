package CollectionFrameworks.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PrintArray extends ArrayList<String> {

}

public class MapLearning {
    public static void main(String[] args) {
        String myString = "santosh is the best in the java world And Java is made for santosh";

        // here need to count how many times the word occurs in the string
        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("santosh", 0);
        String[] splittedstring = myString.split(" ");
        for (String string : splittedstring) {
            System.out.println(string);
        }
        System.out.println(wordCount.get("santosh"));
        for (String word : myString.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
