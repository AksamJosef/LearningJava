import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class CalcPrice {
    public static void h1111() {
    }

    static class Pri {

        private void H() {
            h1111();
        }
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int t0 = monitors / programmers; //сколько мониторов на одного программиста, только целая часть от деления
        return monitors - t0 * programmers;
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(abs(value)) == 1;

    }

    public static void calcCircleRadius(double area) {
        double result = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", result);
    }


    public static void maxLongSqr() {
        BigInteger bInt = BigInteger.valueOf(Long.MAX_VALUE).pow(2);
        System.out.println(bInt.toString());

    }

    public static byte getAgeDiff(byte age1, byte age2) {
        Byte b = 5;
        Short s = 2;
        Integer i = 2;
        Long l = 2L;
        Float f = 2.0f;
        Double d = 2.0;
        Character c = 'd';

        return (byte) Math.abs(age1 - age2);
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        if (value > 1) {
            return (factorial(value - 1).multiply(BigInteger.valueOf(value)));
        } else {
            return result;
        }
    }

    public static BigInteger factorial1(int value) {
        BigInteger result = BigInteger.valueOf(1);
        if (value > 1) {
            for (int i = 1; i < value + 1; i++) {
                System.out.println(BigInteger.valueOf(i));
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        } else {
            return result;
        }
    }

    public static int determineGroup(int age) {
        if ((age >= 7) && (age <= 13)) {
            return 1;
        } else if ((age >= 14) && (age <= 17)) {
            return 2;
        } else if ((age >= 18) && (age <= 65)) {
            return 3;
        } else {
            return -1;
        }
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;

        }
    }

    public static boolean isWeekend1(String weekday) {
        if (weekday == "Saturday" || weekday == "Sunday") {
            return true;
        } else {
            return false;
        }
    }

    public static String isWeekendTernar(String weekday) {
        return (weekday == "Saturday" || weekday == "Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }

    public static void printArray(int[] numbers) {
        System.out.print('[');
        if (numbers.length != 0){
            for (int i = 0; i < numbers.length - 1; i++) {

                System.out.printf("%d, ", numbers[i]);
            }
            System.out.printf("%d]", numbers[numbers.length - 1]);
        } else {
            System.out.print(']');
        }

    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int lenResult = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] >= start) && (numbers[i] <= end)){
                lenResult++;
            }
        }
        int[] result = new int[lenResult];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] >= start) && (numbers[i] <= end)){
                result[counter++] = numbers[i];
            }
        }
        return result;
    }
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length != 0) {
            int halfLength = numbers.length / 2;
            if (numbers.length % 2 == 0) {
                return new int[]{numbers[halfLength - 1], numbers[halfLength]};
            } else {
                return new int[]{numbers[halfLength]};
            }
        } else {
            return new int[]{};
        }
    }

    public static int[] inverseArray(int[] numbers) {
        int[] reversedNumbers = new int[numbers.length];
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            reversedNumbers[counter++] = numbers[i];
        }
        return reversedNumbers;
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] presortedArray = new int[firstArray.length + secondArray.length];
        //firstly merge
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            presortedArray[counter++] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            presortedArray[counter++] = secondArray[i];
        }

        //now sort
        
        for (int i = 0; i < presortedArray.length - 1; i++) {
            for (int j = 0; j < presortedArray.length - 1; j++) {
                if (presortedArray[j] > presortedArray[j+1]) {
                    int temp = presortedArray[j];
                    presortedArray[j] = presortedArray[j+1];
                    presortedArray[j+1] = temp;
                }
            }

        }
        return presortedArray;
    }

    public static void printArray2(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] getArrayMiddle2(int[] numbers) {
        if (numbers.length != 0) {
            if (numbers.length % 2 == 0) {
                return Arrays.copyOfRange(numbers, numbers.length / 2 - 1, numbers.length / 2 + 1);
            } else {
                return Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length / 2 + 1);
            }
        } else {
            return numbers;
        }


    }
    public static int[] mergeAndSort2(int[] firstArray, int[] secondArray) {
        int[] sortedArray = new int[firstArray.length + secondArray.length];
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sortedArray[counter++] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            sortedArray[counter++] = secondArray[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    public static void printOddNumbers(int[] arr) {
        int lenArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                lenArray++;
            }
        }
        int[] array = new int[lenArray];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                array[counter++] = arr[i];
            }
        }

        if (array.length != 0) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.printf("%d,", array[i]);
            }
            System.out.println(array[array.length - 1]);
        } else {
            System.out.println();
        }


    }
    public static void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }

    public static boolean isPalindrome(String text) {
        String formatedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charArray = formatedStr.toCharArray();
        boolean flag = true;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[charArray.length - 1 - i]) {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public static boolean isPalindrome2(String text) {
        StringBuilder sb = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        StringBuilder sb1 = sb.reverse();


        return sb.compareTo(sb.reverse()) == 0;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2("asdfasdfasdfq2r"));
    }
}
