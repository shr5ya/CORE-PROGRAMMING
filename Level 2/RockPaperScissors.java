import java.util.Scanner;


public class RockPaperScissors {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "";
        }
    }

    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] getGameStats(int numGames, int playerWins, int computerWins) {
        double playerWinPercentage = (double) playerWins / numGames * 100;
        double computerWinPercentage = (double) computerWins / numGames * 100;

        return new String[][]{
            {"Player", String.valueOf(playerWins), String.format("%.2f%%", playerWinPercentage)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercentage)}
        };
    }
    
    public static void displayTable(String[][] data, String[] headers) {
        if (data.length == 0 || headers.length == 0) {
            System.out.println("No data to display.");
            return;
        }
        int[] colWidths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            colWidths[i] = getLength(headers[i]);
        }
        for (String[] row : data) {
            for (int j = 0; j < row.length; j++) {
                if (getLength(row[j]) > colWidths[j]) {
                    colWidths[j] = getLength(row[j]);
                }
            }
        }
        
        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", headers[i]);
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", "=".repeat(colWidths[i]));
        }
        System.out.println();
        
        for (String[] row : data) {
            System.out.print("|");
            for (int j = 0; j < row.length; j++) {
                System.out.printf(" %-" + (colWidths[j] + 1) + "s |", row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Rock-Paper-Scissors ---");
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        int playerWins = 0;
        int computerWins = 0;
        for (int i = 1; i <= numGames; i++) {
            System.out.println("\nRound " + i + ": Choose your move (Rock, Paper, or Scissors): ");
            String playerChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
            }
            System.out.println("--- Round " + i + " ---");
            System.out.println("Player chooses: " + playerChoice);
            System.out.println("Computer chooses: " + computerChoice);
            System.out.println("Winner: " + winner);
            System.out.println();
        }

        System.out.println("--- Final Stats ---");
        String[][] stats = getGameStats(numGames, playerWins, computerWins);
        String[] headers = {"Player/Computer", "Wins", "Win Percentage"};
        displayTable(stats, headers);
        
        scanner.close();
    }
}
