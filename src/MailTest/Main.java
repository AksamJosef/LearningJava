package MailTest;

public class Main {
    public static class IllegalPackageException extends Exception {
        public IllegalPackageException(){
            super("IllegalPackageException");
        }
    }
    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException() {
            super("StolenPackageException");
        }
    }
    public static void main(String[] args) {
        String s = "stones instead of 123";

//        System.out.println(s.contains("stones"));
        if (s.contains("stones")) {
            try {
                throw new StolenPackageException();
            } catch (StolenPackageException e) {
                throw new StolenPackageException();
            }
        }

    }
}
