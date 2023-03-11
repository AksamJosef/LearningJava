package IO;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class NumsTest {


    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        char[] charBuff = new char[1024];
        StringBuilder sb = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);

        for (int i; (i = reader.read(charBuff, 0, charBuff.length)) > 0 ;) {
            sb.append(charBuff, 0, i);
        }
        reader.close();
        return sb.toString();
    }

    public static void writeToSystemOut(double result) throws IOException {
        String formattedSum = String.format("%.6f", result);
        Writer writer = new OutputStreamWriter(System.out);
        writer.write(formattedSum);
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        String inputed = readAsString(System.in, StandardCharsets.UTF_8);


        String[] strings = inputed.split("^|\\s|$");
        double sum = 0;

        for (int i = 0; i < strings.length; i++) {
            try{
                sum += Double.parseDouble(strings[i]);
            } catch (NumberFormatException ignored) { }
        }
//        System.out.printf("%.6f", sum);

        writeToSystemOut(sum);

    }
}
