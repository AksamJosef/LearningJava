package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NewClass {

    public static void fileOpen() {
        File file = new File("asdf");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            e.printStackTrace();
            StackTraceElement[] ste = e.getStackTrace();
//            System.out.println(Arrays.toString(new StackTraceElement[]{ste[ste.length-2]}));
        }
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements;
        try {
            throw new IllegalStateException();
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Error e) {
            System.out.println("Error");
        } finally {
            System.out.println("privet");
        }

//        int index = stackTraceElements.length-1;
//        return stackTraceElements[1].getMethodName().equals("main") ? null : stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
        return null;
    }
    public static void anotherMethod() {
        anotherMethod2();
    }

    public static void anotherMethod2() {
        anotherMethod3();
    }
    public static void anotherMethod3() {
//        System.out.println(getCallerClassAndMethodName());
    }
    public static class MyException2 extends Exception {

    }

    public static void main(String[] args) {
//        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
//        anotherMethod2();
//        getCallerClassAndMethodName();
    }
}
