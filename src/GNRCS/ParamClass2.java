package GNRCS;

public class ParamClass2 {
    public static void main(String[] args) {
        Pairrrrr<String, Integer> pair1 = new Pairrrrr<>("Hellooooo", 19);
        System.out.println("Values is: " + pair1.getVal1() + " " + pair1.getVal2());

        Pairrrrr<Integer, Character> pair2 = new Pairrrrr<>(19, (char)19);
        System.out.println(pair2.getVal1() + " " + pair2.getVal2());
    }
}

class Pairrrrr<V1, V2> {
    private V1 val1;
    private V2 val2;

    public Pairrrrr(V1 val1, V2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V1 getVal1() {
        return val1;
    }

    public V2 getVal2() {
        return val2;
    }
}