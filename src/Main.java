import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String playAgain;
        do {
            Scanner scanner = new Scanner(System.in);
            playAgain = "Y";
            String playerAChoice;

            do {
                System.out.println("Player A Choice either R(rock), P(paper), or S(Scissors)");
                playerAChoice = scanner.nextLine().toUpperCase();

                if (!playerAChoice.equals("R") &&
                        !playerAChoice.equals("P") &&
                        !playerAChoice.equals("S")) {
                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }

            } while (!playerAChoice.equals("R") &&
                    !playerAChoice.equals("P") &&
                    !playerAChoice.equals("S"));
            String playerBChoice;

            do {
                System.out.println("Player B Choice either R(rock), P(paper), or S(Scissors)");
                playerBChoice = scanner.nextLine().toUpperCase();

                if (!playerBChoice.equals("R") &&
                        !playerBChoice.equals("P") &&
                        !playerBChoice.equals("S")) {
                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }

            } while (!playerBChoice.equals("R") &&
                    !playerBChoice.equals("P") &&
                    !playerBChoice.equals("S"));
            if (playerBChoice.equals(playerAChoice)) {
                System.out.println("It's a tie!");
            } else if (playerAChoice.equals("R") && playerBChoice.equals("S")) {
                System.out.println("Rock beats scissors, player A wins!");
            } else if (playerAChoice.equals("P") && playerBChoice.equals("R")) {
                System.out.println("Paper beats rock, player A wins!");
            } else if (playerAChoice.equals("S") && playerBChoice.equals("P")) {
                System.out.println("Scissors beats paper, player A wins!");
            } else if (playerBChoice.equals("R") && playerAChoice.equals("S")) {
                System.out.println("Rock beats scissors, player B wins!");
            } else if (playerBChoice.equals("P") && playerAChoice.equals("R")) {
                System.out.println("Paper beats rock, player B wins!");
            } else if (playerBChoice.equals("S") && playerAChoice.equals("P")) {
                System.out.println("Scissors beats paper, player B wins!");
            } else if (playerAChoice.equals(playerBChoice)){
                System.out.println("It's a tie!");
            } else if (playerAChoice.equals("R") && playerBChoice.equals("P")) {
                System.out.println("Paper beats rock, player B wins!");
            } else if (playerAChoice.equals("P") && playerBChoice.equals("S")) {
                System.out.println("Scissors beats paper, player B wins!");
            } else if (playerAChoice.equals("S") && playerBChoice.equals("R")) {
                System.out.println("Rock beats Scissors, player B wins!");
            } else if (playerBChoice.equals("R") && playerAChoice.equals("P")) {
                System.out.println("Paper beats rock, player A wins!");
            } else if (playerBChoice.equals("P") && playerAChoice.equals("S")) {
                System.out.println("Scissors beats paper, player A wins!");
            } else if (playerBChoice.equals("S") && playerAChoice.equals("R")) {
                System.out.println("Rock beats scissors, player A wins!");
            }

            System.out.println("Would you like to play again? (Y/N)");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}
