package GNRCS;

public class ParamClass {
    public static void main(String[] args) {
        Info <String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(19);
        System.out.println(info2);
        Integer i = info2.getValue();


    }
}
class Info <T> { // T - type placeholder.
    // в парам классе не д б статичных переменных
    // private static T val2; -- нельзя!

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "^_^ value is " + value;
    }
}