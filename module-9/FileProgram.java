/*
 * Christopher Villarreal
 * Module 9 Assignment 2 - Program 2 
 * 
 */

package module9;

import java.io.*;
import java.util.*;

public class FileProgram {

    public static void main(String[] args) {

        File file = new File("data.file");

        try {

            // Create file if it does not exist
            if (!file.exists()) {
            	System.out.println("'" + file.getName() + 
            			"' doesn't exist. Creating file.");
            	Date currentDate = new Date();
                file.createNewFile();
                System.out.println("'" + file.getName() + 
                		"' has been created on " + currentDate);
            }

            // Opens data.file and appends to existing content
            PrintWriter output = new PrintWriter(new FileWriter(file, true));

            // Write 10 random numbers separated by spaces
            for (int i = 0; i < 10; i++) {
                int randomNumber = (int)(Math.random() * 100);
                output.print(randomNumber + " ");
            }

            // Closes writer
            output.close();

            System.out.println("\nContents have been generated to '" + file.getName() + "'.\n");

            // Reopen file for reading
            Scanner input = new Scanner(file);

            System.out.println("The file contains: ");

            // Read and display file data
            while (input.hasNext()) {
                System.out.print(input.next() + " ");
            }

            input.close();

        } catch (IOException e) {
            System.out.println("An I/O error occurred.");
            e.printStackTrace();
        }
    }
}