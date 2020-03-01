package edu.cscc;
import java.util.*;
/**
 * Code for Lab 7 Main Class
 * @author nikolasBall
 * @version 1.0
 **/

public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * @param args String[] expects an array of Strings<br>
     * The  public static void main(String[] args) is the Access Modifier making the main() method public<br>
     * The return type is void, and this means that the Java main method does not return anything<br>
     * The String[] args stores the Java command line arguments and is an array of specific type: java.lang.String<br>
     * The String h_pick is referring to human<br>
     * The String c_pick is referring to computer<br>
     * The String known as answer holds the input<br>
     * If invalid, then boolean is returned<br>
     * The output consists of the user asking to make a choice of
     * if the input is valid, that being applied to the
     * output, again asking the user to input a choice, and checks if the isValidPick method on the
     * RPSLSpock class. If not valid then output not valid and then it enters the do while loop to have user
     * re-input a valid response
     **/
    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            /**
             * @param isComputerWin  beats h_pick)
             * This is using the if else loop to compare h_pick to the method isComputerWin
             **/
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}
