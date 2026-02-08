/*
 *  Christopher Villarreal
 *  Module 6 Assignment 2
 */

import java.util.Scanner;

public class Fan {
    
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default values for the fan
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /*
        Setters and Getters for Fan
    */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // End of setters and getters.

    public String toString() {

        String speedData;

        if (speed == STOPPED) {
            speedData = "STOPPED";
        } else
            if (speed == SLOW) {
                speedData = "SLOW";
            } else
                if (speed == MEDIUM) {
                    speedData = "MEDIUM";
                } else
                    if (speed == FAST) {
                        speedData = "FAST";
                    } else {
                        // Catch incase no speed value is set or beyond the defined values.
                        speedData = "UNKNOWN";
                    }

        if (on) {
            return "The fan is ON, with a speed of " + speedData + ", a radius of " + radius + ", and the color is " + color + ".";
        } else {
            return "The fan is OFF, with a radius of " + radius + ", and the color is " + color + ".";
        }
    }
}

class TestScript {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Fan defaultFan = new Fan();

        Fan customFan = new Fan(Fan.FAST, true, 10.0, "green");

        System.out.println("== Default Fan Details ==");
        System.out.println(defaultFan);

        System.out.println("\n== Custom Fan Details ==");
        System.out.println(customFan);

        System.out.println("\nNext we will access and modify the custom fan's color. Please enter a new color for the fan: ");

        String newColor = input.nextLine();
        customFan.setColor(newColor);

        // Quick check and feedback to ensure the color was updated.
        if (customFan.getColor().equals(newColor)) {
            System.out.println("Color updated successfully.");
        } else {
            System.out.println("Failed to update color.");
        }

        System.out.println("\n== Updated Custom Fan Details ==");
        System.out.println(customFan);
        
        input.close();
    }
}

/* 
    Code References:
    For checking string equality for the new color inputted from the user, the equals method was used. 
    - https://www.w3schools.com/java/ref_string_equals.asp
    - https://www.reddit.com/r/learnjava/comments/1m07bav/help_me_understand_the_difference_between_and/ (desrtfx's comment)
*/