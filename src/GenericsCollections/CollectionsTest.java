package GenericsCollections;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class CollectionsTest {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> resultSet = new HashSet<>();
        resultSet.addAll(set1);
        resultSet.addAll(set2);
        for (T t : set1) {
            for(T y : set2) {
                if (t.equals(y)) {
                    resultSet.remove(t);
                }
             }
        }
        return resultSet;
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Scanner scanner = new Scanner(reader);
        Map<String, Long> result = new HashMap<>();
        while (scanner.hasNext()) {
            String sTemp = scanner.next();
            Long iTemp = scanner.nextLong();
            result.put(sTemp, iTemp);
        }


        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> setR = new HashSet<>();
        setR.addAll(set1);
        setR.addAll(set2);
//        System.out.println(setR);

        File file = new File("1234");
        Reader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader);

        Map<String, Long> result = new HashMap<>();
        while (scanner.hasNext()) {
            String sTemp = scanner.next();
            Long iTemp = scanner.nextLong();
            if (result.containsKey(sTemp)) {
                result.put(sTemp, result.get(sTemp) + iTemp);
            } else {
                result.put(sTemp, iTemp);
            }

//            System.out.println(result);
        }



//        InputStreamReader reader1 = new InputStreamReader(System.in);
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        //        Scanner scanner1 = new Scanner(reader1);
//        while (scanner.hasNext()) {
//            list.add(scanner1.nextInt());
//        }

        List<Integer> list = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(list);
        System.out.println("Hello");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.remove(i);
                System.out.println(list);
            }
        }

        System.out.println(list);

//        System.out.println(map);

//        System.out.println(symmetricDifference(set1, set2));

//        System.out.println(getSalesMap(reader));
    }
}
