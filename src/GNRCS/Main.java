package GNRCS;

import java.util.Collections;
import java.util.Optional;

public class Main {

    public static class Account <T> {
        private T id;

        public T getId() {
            return id;

        }

        Account (T id) {
            this.id = id;
        }
    }



    public static void main(String[] args) {
        Account s = new Account("S");
        System.out.println(s);
    }
}
