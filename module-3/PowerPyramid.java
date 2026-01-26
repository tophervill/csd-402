// Christopher Villarreal
// CSD 402 Module 3 Assignment 2

public class PowerPyramid {

    public static void main(String[] args) {
        printPyramid(7);
    }

    public static void printPyramid(int totalRows) {

        // Longest row used to ensure correct alignment
        String longestRow = buildRow(totalRows - 1);
        int maxRowLength = longestRow.length();

        for (int currentRow = 0; currentRow < totalRows; currentRow++) {

            String currentLine = buildRow(currentRow);

            // Calculate spaces needed to center the row
            int leftSpacing = (maxRowLength - currentLine.length()) / 2;

            // Print left leading spaces
            printSpaces(leftSpacing);

            // Print numbers
            System.out.print(currentLine);

            // Print spaces so @ lines up correctly across all lines
            int rightSpacing = maxRowLength - leftSpacing - currentLine.length();
            printSpaces(rightSpacing + 1); // space before @

            // Print the @ symbol
            System.out.println("@");
        }
    }

    // Builds one row of numbers (ex: "1 2 4 2 1")
    public static String buildRow(int rowIndex) {
        String rowText = "";
        int number = 1;

        // Increasing values
        for (int i = 0; i <= rowIndex; i++) {
            rowText += number + " ";
            number *= 2;
        }

        // Decreasing values
        number /= 4;
        for (int i = 0; i < rowIndex; i++) {
            rowText += number + " ";
            number /= 2;
        }

        return rowText.trim();
    }

    // Prints a specific number of spaces
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
