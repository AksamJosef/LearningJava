package GNRCS;
import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.*;

public class NewClass3 {
    public static void show(List<?> list) {
        list.remove(0);
        System.out.println("list " + list);
    }

    public static double summ (List<? extends Number> list) {
        double summ = 0;
        for (Number n : list) {
            summ += n.doubleValue();
        }
        return summ;
    }
    public static void main(String[] args) {
//        String[] strings = {"Assaf", "Josef", "Nigmat", "Ayusha"};
//        DynamicArray<String> dynamicArray = new DynamicArray<>(strings);
//        System.out.println(dynamicArray.get(3));
//
//        System.out.println(dynamicArray);
        Collection<String> d = new ArrayList<>();

        Reader reader = new InputStreamReader(System.in);
        Writer writer = new OutputStreamWriter(System.out);



        BufferedReader br = new BufferedReader(reader);
//        ObjectOutputStream oos = new ObjectOutputStream(System.out);

        File file = new File("123");
//        file.createNewFile();
//        Scanner scanner = new Scanner(file);
        d.add(null);
        System.out.println(d);
        List<? super Integer> listSup = new ArrayList<Number>();

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(summ(listInt));

        List<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(3.15);
        list.add(3.16);

        show(list);
        System.out.println(summ(list));
        
        List<String> listString = new ArrayList<>();
        listString.add("a");
        listString.add("b");
        listString.add("c");

        show(listString);

        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        for (int i = 0; i < array.length(); i++) {
            System.out.print(array.get(i) + " ");
        }

    }
    public static class DynamicArray <T> {
        private T[] dynamicArray = null;
//        public DynamicArray(T[] dynamicArray) {
//            this.dynamicArray = dynamicArray;
//        }

        public int length() {
            return dynamicArray.length;
        }
        public void add(T el) {
            if (dynamicArray != null) {
                dynamicArray = Arrays.copyOf(dynamicArray, dynamicArray.length + 1);
                dynamicArray[dynamicArray.length - 1] = el;
            } else {
                dynamicArray = (T[]) new Object[] {el};
            }

        }

        public void remove(int index) {
            ArrayList<T> list = new ArrayList<>(Arrays.asList(dynamicArray));
            list.remove(index);
            list.get(1);
            dynamicArray = (T[]) list.toArray();

        }
        public T get(int index){
            if (dynamicArray != null) {
                return dynamicArray[index];
            } else return null;

        }

        @Override
        public String toString() {
            return "DynamicArray{" +
                    "dynamicArray=" + Arrays.toString(dynamicArray) +
                    '}';
        }
    }
}
