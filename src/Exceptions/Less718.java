package Exceptions;

public class Less718 {
    class MyNewException extends Exception{
        public MyNewException(String message) {
            super(message);
        }
    }
    public void testExp() throws MyNewException {
        throw new MyNewException("Hello");
    }

    public static void main(String[] args) throws MyNewException {
        Less718 les = new Less718();
        les.testExp();
    }
}
