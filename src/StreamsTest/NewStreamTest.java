package StreamsTest;

import java.math.BigInteger;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewStreamTest {
    public static int getSector(int num) {
        return (num / 10) % 1000;
    }

    public static int recourse(int seed) {
        return recourse(seed * seed / 10) % 1000;
    }
    public static IntStream pseudoRandomStream(int seed) {

        return IntStream.iterate(seed, x -> (x * x / 10) % 1000);

    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> al = stream.toList();

        T min = al.stream().min(order).orElse(null);
        T max = al.stream().max(order).orElse(null);
        minMaxConsumer.accept(min, max);
    }


    public static BigInteger factorial(int value) {
        return null;
    }


    public static void main(String[] args) {

        Map<String, Integer>  map = new TreeMap<>();
        map = new Scanner(System.in)//.next().split("(?U)[^\\p{L}\\p{Digit}]+")
                .tokens()
                .flatMap(x -> Stream.of(x.toLowerCase().split("(?U)[^\\p{L}\\p{Digit}]+")))
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));


        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed().thenComparing(Map.Entry.<String, Integer> comparingByKey()))
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));

//        List<String> list = new ArrayList<>();
//
//
//        while (scanner.hasNext()) {
//            list.add(scanner.next().toLowerCase());
//        }
//        Map<String, Integer> map = list.stream()
//                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
//mama mama mama myla myla myla fa fa sol sol sol sol
//        System.out.println(map);
//        map.entrySet().stream()
////                .sorted(Comparator.comparing(e -> e.getValue()))
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .limit(10)
////                .sorted(Comparator.comparing(e -> e.getKey()))
////                .sorted(Map.Entry.<String, Integer>comparingByKey())
//                .forEach(k -> System.out.println(k.getKey()));

//        System.out.println(map);

    }
}
