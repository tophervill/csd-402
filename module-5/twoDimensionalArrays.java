/*
    Christopher Villarreal
    Module 5 Assignment 2    
*/

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int[][] intArray = {
            { 3, 6, 5 },
            { 5, 2, 7, 9 },
            { 4, 8 }
        };

        double[][] doubleArray = {
            { 3.5, 4.0, 3.7 },
            { 8.7, 9.9 },
            { 1.0, -4.5, 7.7, 9.1 }
        };

        System.out.println("2D Arrays and output of Largest and Smallest Values\n");

        // Start of int array output
        // Prep methods to find values or largest or smallest within provided arrays
        int[] largestIntLoc = locateLargest(intArray);
        int[] largestDoubleLoc = locateLargest(doubleArray);

        int[] smallestIntLoc = locateSmallest(intArray);
        int[] smallestDoubleLoc = locateSmallest(doubleArray);

        System.out.println("The contents of the 2D int array are: ");
        print2D(intArray);

        System.out.println();

        System.out.println("The largest int location is in row[" + largestIntLoc[0]
            + "] column[" + largestIntLoc[1] + "] with a value of " 
            + intArray[largestIntLoc[0]][largestIntLoc[1]]
        );

        System.out.println("The smallest int location is in row[" + smallestIntLoc[0]
            + "] column[" + smallestIntLoc[1] + "] with a value of " 
            + intArray[smallestIntLoc[0]][smallestIntLoc[1]]
        );

        // End of int array output
        // Start of double array output
        System.out.println("\nThe contents of the 2D double array are: ");
        print2D(doubleArray);

        System.out.println();

        System.out.println("The largest double location is in row[" + largestDoubleLoc[0]
            + "] column[" + largestDoubleLoc[1] + "] with a value of " 
            + doubleArray[largestDoubleLoc[0]][largestDoubleLoc[1]]
        );

        System.out.println("The smallest double location is in row[" + smallestDoubleLoc[0]
            + "] column[" + smallestDoubleLoc[1] + "] with a value of " 
            + doubleArray[smallestDoubleLoc[0]][smallestDoubleLoc[1]]
        );

    }

    // Method to find the largest int value and return the location of the array (row and column).
    public static int[] locateLargest(int[][] arrayParam) {

        int bestRow = 0;
        int bestCol = 0;
        int bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int col = 0; col < arrayParam[row].length; col++) {

                // Checks and updates if a larger value is found
                if (arrayParam[row][col] > bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }

    // Method to find the largest double value and return the location of the array (row and column).
    public static int[] locateLargest(double[][] arrayParam) {

        int bestRow = 0;
        int bestCol = 0;
        double bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int col = 0; col < arrayParam[row].length; col++) {

                // Checks and updates if a larger value is found
                if (arrayParam[row][col] > bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }

    // Smallest values
    // Methods to locate the smallest value and return the location of the array.
    public static int[] locateSmallest(int[][] arrayParam) {

        int bestRow = 0;
        int bestCol = 0;
        int bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int col = 0; col < arrayParam[row].length; col++) {

                // Checks and updates if a smaller value is found
                if (arrayParam[row][col] < bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }

    public static int[] locateSmallest(double[][] arrayParam) {

        int bestRow = 0;
        int bestCol = 0;
        double bestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int col = 0; col < arrayParam[row].length; col++) {

                // Checks and updates if a smaller value is found
                if (arrayParam[row][col] < bestValue) {
                    bestValue = arrayParam[row][col];
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        return new int[] { bestRow, bestCol };
    }


    /* 
        Display Helpers to make output look nice and clear to read.
    */

    // to print out the int array
    public static void print2D(int[][] arrayParam) {
        for (int row = 0; row < arrayParam.length; row++) {
            System.out.print("row " + row + ": ");
            for (int col = 0; col < arrayParam[row].length; col++) {
                System.out.print(arrayParam[row][col] + " ");
            }
            System.out.println();
        }
    }

    // to print out the double array
    public static void print2D(double[][] arrayParam) {
        for (int row = 0; row < arrayParam.length; row++) {
            System.out.print("row " + row + ": ");
            for (int col = 0; col < arrayParam[row].length; col++) {
                System.out.print(arrayParam[row][col] + " ");
            }
            System.out.println();
        }
    }

}
