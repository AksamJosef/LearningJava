package GNRCS;

import java.util.Optional;

public class OptClass {

    public static void main(String[] args) {
        Example<String> ex = new Example<>();
        ex.someMethod(1);

    }
}

class Example<T> {
    public void someMethod(Object obj) {
        T newObj = (T) obj;
        Optional<T> optionalT = Optional.empty();
    }
}