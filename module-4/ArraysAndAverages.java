/**
 *  Christopher Villarreal
 *  Module 4 Assignment 2
 */

public class ArraysAndAverages {

    public static void main(String[] args) {

        // Arrays
        short[] shortArray = { 2, 4, 6, 8, 10 };
        int[] intArray = { 10, 20, 30, 40, 50, 60, 70 };
        long[] longArray = { 100L, 200L, 300L, 400L, 500L, 600L };
        double[] doubleArray = { 8.0, 8.5, 9.0, 9.2, 9.5, 9.8, 10.0 };

        System.out.println("Module 4 Assignment 2 - Arrays and Averages\n");

        // Display short array and average
        System.out.print("short array elements: ");
        for (short n : shortArray) {
            System.out.print(n + " ");
        }
        System.out.println("\nAverage (short): " + average(shortArray));
        System.out.println();


        // Display int array and average
        System.out.print("int array elements:  ");
        for (int n : intArray) {
            System.out.print(n + " ");
        }
        System.out.println("\nAverage (int):   " + average(intArray));
        System.out.println();


        // Display long array and average
        System.out.print("long array elements:  ");
        for (long n : longArray) {
            System.out.print(n + " ");
        }
        System.out.println("\nAverage (long):  " + average(longArray));
        System.out.println();


        // Display double array and average
        System.out.print("double array elements:  ");
        for (double n : doubleArray) {
            System.out.print(n + " ");
        }
        System.out.println("\nAverage (double): " + average(doubleArray));
    }

    public static short average(short[] array) {
        int sum = 0;
        for (short n : array) {
            sum += n;
        }
        short value = (short) (sum / array.length);
        return value;
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int n : array) {
            sum += n;
        }
        int value = (int) (sum / array.length);
        return value;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long n : array) {
            sum += n;
        }
        long value = sum / array.length;
        return value;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double n : array) {
            sum += n;
        }
        double value = sum / array.length;
        return value;
    }
}