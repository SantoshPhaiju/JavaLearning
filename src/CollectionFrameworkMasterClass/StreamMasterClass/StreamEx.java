package CollectionFrameworkMasterClass.StreamMasterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

//        int sum = nums.stream().map(i -> i * 2).reduce(0, (a, b) -> a + b);
        int sum = nums.stream().map(i -> i * 2).reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
