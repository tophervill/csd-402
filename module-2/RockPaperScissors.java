import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock (1), paper (2), or scissors (3):");
        int userChoice = input.nextInt();

        int computerChoice = (int) (Math.random() * 3) + 1;
        String userSelection = "";
        String computerSelection = "";

        if (userChoice == 1) {
            userSelection = "Rock";
        } else if (userChoice == 2) {
            userSelection = "Paper";
        } else if (userChoice == 3) {
            userSelection = "Scissors";
        } else {
            System.out.println("Invalid input");
            return;
        }

        // Computer's selection choice
        if (computerChoice == 1) {
            computerSelection = "Rock";
        } else if (computerChoice == 2) {
            computerSelection = "Paper";
        } else {
            computerSelection = "Scissors";
        }

        System.out.println("You chose: " + userSelection);
        System.out.println("Computer chose: " + computerSelection );

        System.out.println("");

        // Game Conditions
        if (userChoice == computerChoice) {
            System.out.println("It's a tie! You both selected " + userSelection);
        } else if (userChoice == 1 && computerChoice == 2) {
            // Rock vs Paper
            System.out.println("You lost! " + computerSelection + " beats " + userSelection + ".");
        } else if (userChoice == 1 && computerChoice == 3) {
            // Rock vs Scissors
            System.out.println("You won! " + userSelection + " beats " + computerSelection + ".");
        } else if (userChoice == 2 && computerChoice == 1) {
            // Paper vs Rock
            System.out.println("You won! " + userSelection + " beats " + computerSelection + ".");
        } else if (userChoice == 2 && computerChoice == 3) {
            // Paper vs Scissors
            System.out.println("You lost! " + computerSelection + " beats " + userSelection + ".");
        } else if (userChoice == 3 && computerChoice == 1) {
            // Scissors vs Rock
            System.out.println("You lost! " + computerSelection + " beats " + userSelection + ".");
        } else if (userChoice == 3 && computerChoice == 2) {
            // Scissors vs Paper
            System.out.println("You won! " + userSelection + " beats " + computerSelection + ".");
        }

        input.close();
    }
}