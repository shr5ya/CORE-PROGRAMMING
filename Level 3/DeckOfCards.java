import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int NUM_CARDS_IN_DECK = suits.length * ranks.length;

    public static String[] initializeDeck() {
        String[] deck = new String[NUM_CARDS_IN_DECK];
        int cardIndex = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[cardIndex++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < NUM_CARDS_IN_DECK; i++) {
            int randomCardNumber = i + random.nextInt(NUM_CARDS_IN_DECK - i);

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int numCardsPerPlayer) {
        if (numPlayers * numCardsPerPlayer > NUM_CARDS_IN_DECK) {
            System.out.println("Error: Not enough cards in the deck to distribute. Maximum cards for " + numPlayers + " players is " + (NUM_CARDS_IN_DECK / numPlayers));
            return null;
        }

        String[][] players = new String[numPlayers][numCardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numCardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                if (cardIndex < NUM_CARDS_IN_DECK) {
                    players[j][i] = deck[cardIndex++];
                }
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " has the following cards:");
            for (String card : players[i]) {
                System.out.println(" - " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int numCardsPerPlayer = scanner.nextInt();

        String[] deck = initializeDeck();

        String[] shuffledDeck = shuffleDeck(deck);

        String[][] players = distributeCards(shuffledDeck, numPlayers, numCardsPerPlayer);

        printPlayersCards(players);

        scanner.close();
    }
}
