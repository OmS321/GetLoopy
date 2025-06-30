import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args) {
        int rollCount = 0; // Tracks number of rolls
        int die1;
        int die2;
        int die3;
        int total;

        Scanner in = new Scanner(System.in); // Scanner for user input

        boolean done = false; // Flag to control the loop
        String userInput; // User input for rolling again

        System.out.printf("Roll # \t Die 1\t Die 2\t Die 3\t Total\n");
        System.out.printf("--------------------------------------\n");

        do
        {
            do
            {
                die1 = (int) (Math.random() * 6) + 1; // Roll die 1
                die2 = (int) (Math.random() * 6) + 1; // Roll die 2
                die3 = (int) (Math.random() * 6) + 1; // Roll die 3

                total = die1 + die2 + die3; // Calculate total

                rollCount++; // Increment roll count

                System.out.printf("%6d \t\t %d \t\t %d \t\t %d \t %4d\n", rollCount, die1, die2, die3, total);
            }
            while (die1 != die2 || die1 != die3 || die2 != die3);

            do
            {
                System.out.println("Would you like to go again? (Y/N)");
                userInput = in.nextLine();
                userInput = userInput.trim().toUpperCase(); // Normalize input

                if (userInput.equals("N"))
                {
                    done = true; // Exit loop if user chooses not to roll again
                }
                else if (userInput.equals("Y"))
                {
                    done = false;
                    rollCount = 0;

                    System.out.printf("Roll # \t Die 1\t Die 2\t Die 3\t Total\n");
                    System.out.printf("--------------------------------------\n");

                }
                else
                {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }
            while (!userInput.equals("Y") && !userInput.equals("N"));
        }
        while (!done);
    }
}

