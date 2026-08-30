package StreamsTelusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Consumer<Integer> con = System.out::println;
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        nums.forEach(con);
//        nums.forEach(System.out::println);

//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }

//        for (int n: nums) {
//            System.out.println(n);
//        }

//        nums.forEach(System.out::println);
        // We can use stream only once not multiple times
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);


//        s1.forEach(System.out::println);
        s3.forEach(System.out::println);
//        s1.forEach(System.out::println);

//        int sum = 0;
//        for (int n : nums) {
//            if (n % 2 == 0) {
//                n = n * 2;
//                sum = sum + n;
//            }
//        }

        // * Stream API


        System.out.println(nums);
    }
}
