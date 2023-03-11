package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    public static int sumOfStream(InputStream inputStream) throws IOException {
        byte[] byteArray;
        byte by;
//        inputStream.read(byteArray);
        byteArray = inputStream.readAllBytes();
        System.out.println(Arrays.toString(byteArray));
        int sum = 0;
        for (byte b : byteArray) {
            sum += b;
        }
        inputStream.close();
        return sum;

    }


    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] byteArray;
        byteArray = inputStream.readAllBytes();
        for (byte b : byteArray) {
            if (b % 2 == 0) {
                outputStream.write(b);
            }
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
    }
    public class Exc extends Throwable {

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        char[] charBuff = new char[1024];
        StringBuilder sb = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);

        for (int i; (i = reader.read(charBuff, 0, charBuff.length)) > 0 ;) {
            sb.append(charBuff, 0, i);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws RuntimeException {
//        System.out.println(readAsString(System.in, StandardCharsets.US_ASCII));


    }
}
