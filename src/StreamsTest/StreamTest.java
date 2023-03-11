package StreamsTest;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        long count = IntStream.of(-1, 2, 3, 4, 0, 5, -21, -23, -90)
                .filter(x -> x > 0)
                .count();


        IntStream intStSream = "0 1 2 3 4".chars();
//
//
//        System.out.println(count);
    }
}
