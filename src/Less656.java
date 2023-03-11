import java.util.Arrays;


public class Less656 {
    public static void main(String[] args) {
        byte[] byteS = {97, 98, 99, 100, 101, 102};
        AsciiCharSequence ACS = new AsciiCharSequence(byteS);
//        for (int i = 0; i < byteS.length; i++) {
//            System.out.println(ACS.charAt(i));
//        }
        System.out.println(ACS.toString());
//        System.out.println(ACS.length());

    }

    public static class AsciiCharSequence implements CharSequence {
        private final byte[] byteArray;

        public AsciiCharSequence(byte[] byteArray) {
            this.byteArray = byteArray;
        }

        @Override
        public int length() {
            return byteArray.length;
        }

        @Override
        public char charAt(int index) {
            return (char)(byteArray[index] & 0xff);
        }

        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(byteArray, start, end));
        }

        @Override
        public String toString() {
            return new String(byteArray);
        }


    }

}
