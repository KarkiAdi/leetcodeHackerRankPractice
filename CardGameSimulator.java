
// importing necessary classes
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

// individual card blueprint
class Card {
    // default attribute values to specify not a card
    public String color = "";
    public int value = -100;

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }
}

// main simulator class
class Main {
    // class attribute to keep track of cards left after withdrawal
    static int cardsLeft = 52;

    // removes count number of random cards from the deck
    public static ArrayList<Card> withDraw(Card[] deck, int count) {
        Random random = new Random();
        int cardIdx;
        ArrayList<Card> cardsRemoved = new ArrayList<>();
        while (count > 0 && cardsLeft > 0) {
            cardIdx = random.nextInt(52);
            if (deck[cardIdx].value != -100) {
                Card currentCard = new Card(deck[cardIdx].color, deck[cardIdx].value);
                cardsRemoved.add(currentCard);
                deck[cardIdx].value = -100;
                deck[cardIdx].color = "";
                cardsLeft -= 1;
                count -= 1;
            }
        }
        return cardsRemoved;
    }

    public static void CardGameSimulator(String args[]) {
        String[] colors = { "Spade", "Heart", "Diamond", "Club" };
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        Card[] deck = new Card[52];
        int index = 0;
        // generating each card and adding it to the deck
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card newCard = new Card(colors[i], values[j]);
                deck[index] = newCard;
                index += 1;
            }
        }
        // simulation of card withdrawal
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cards you want to withdraw!");
        int noOfWithDrawals = input.nextInt();
        if (noOfWithDrawals >= 0 && noOfWithDrawals <= 52) {
            ArrayList<Card> cardsRemoved = new ArrayList<>();
            cardsRemoved = withDraw(deck, noOfWithDrawals);
            for (int idx = 0; idx < cardsRemoved.size(); idx++) {
                System.out.println(" " + cardsRemoved.get(idx).color + " , " + cardsRemoved.get(idx).value);
            }
        } else {
            System.out.println("The entered number of withdrawals is invalid.");
        }
    }

}