package StreamsTest;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {

    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        }
        return IntStream.rangeClosed(2, value)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .get();

    }

    public static BigInteger streamed(int n) {
        if(n < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, n).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }


    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
