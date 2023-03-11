package GenericsCollections;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();

        while (scanner.hasNextInt()) {
            queue.addFirst(scanner.nextInt());
        }

        int order = queue.size() - 1;
        for (Integer i : queue) {
            if (order % 2 != 0) {
                System.out.print(i + " ");

            }
            --order;
        }
    }
}
