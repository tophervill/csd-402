import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rock (1), paper (2), or scissors (3): ");
        int userChoice = input.nextInt();
        // Randomize a number 1 - 3
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Prepare string variables
        String userSelection = "";
        String computerSelection = "";

        // User's selection choice
        switch (userChoice) {
            case 1: userSelection = "Rock"; break;
            case 2: userSelection = "Paper"; break;
            case 3: userSelection = "Scissors"; break;
        }

        // Computer's selection choice
        switch (computerChoice) {
            case 1: computerSelection = "Rock"; break;
            case 2: computerSelection = "Paper"; break;
            case 3: computerSelection = "Scissors"; break;
        }

        // Print out what User & Computer chose
        System.out.println("You chose: " + userSelection);
        System.out.println("Computer chose: " + computerSelection );

        System.out.println("");

        // Game Conditions
        if (userChoice == computerChoice) {
            System.out.println("It's a tie! You both selected " + userSelection);
        } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You won! " + userSelection + " beats " + computerSelection);
        } else {
            System.out.println("You lost! " + computerSelection + " beats " + userSelection);
        }

        input.close();
    }
}