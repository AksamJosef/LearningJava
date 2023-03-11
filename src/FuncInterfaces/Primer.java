package FuncInterfaces;

import org.w3c.dom.Node;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

interface Inter1 {
    int abc(String s);
}


public class Primer {
    static void def (Inter1 i) {
        System.out.println(i.abc("HELLOOOOOOO"));
    }


    class Primer2 implements Comparable{
        int value;

        public Primer2(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Primer2{" +
                    "value=" + value +
                    '}';
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }




    public static void main(String[] args) {
        def(String::length);

        Stack<String> list = new Stack<>();

        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");


        list.pop();


        ArrayList<?> list2 = new ArrayList<>();

        list2.add(null);

        Queue<String> queue = new ArrayDeque<>();


        Stack<String> stack = new Stack<>();

        stack.add("2");
        stack.add("23");
        stack.pop();
        System.out.println(stack);

        queue.add("S");
        queue.add("T");
        queue.add("R");
        queue.add("I");

        String s = queue.peek();
        System.out.println(queue);
        String s1 = queue.poll();

        System.out.println(s1.equals(s));
        System.out.println(queue);

        Deque<String> deque = new ArrayDeque<>();


        Map<String, String> map = new HashMap<>();

        map.put(null, null);
        map.put(null, "2");
        map.put("2", null);

        System.out.println(map);


        Hashtable<String, String> ht = new Hashtable<>();

        Set<String> set = new HashSet<>();

        IntStream intStream = IntStream.of(new int[]{1, 2, 3, 4});

        int[] array = {1,2,3};
        IntStream array1 = IntStream.of(array);


        boolean b = array1.anyMatch(x -> x == 1);
        System.out.println(b);
    }
}
