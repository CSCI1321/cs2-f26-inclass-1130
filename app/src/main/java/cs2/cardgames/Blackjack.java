package cs2.cardgames;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {

  private static class Hand {
    // Field
    private ArrayList<Card> hand;

    // Constructor
    public Hand() {
      hand = new ArrayList<Card>();
      // hand = Deck.emptyDeck();
    }

    // Methods
    public void add(Card c) {
      hand.add(c);
    }

    public int getTotal() {
      int score = 0;
      boolean hasAce = false;
      for (int i = 0; i < hand.size(); i++) {
        if (hand.get(i).isFaceCard()) {
          score += 10;
        } else {
          score += hand.get(i).getRank();
          if (hand.get(i).getRank() == 1) {
            hasAce = true;
          }
        }
      }
      if (hasAce && score + 10 <= 21) {
        score += 10;
      }
      return score;
    }

    public boolean busted() {
      if (getTotal() > 21)
        return true;
      else
        return false;
    }

    public String toString() {
      return hand.toString();
    }

    public String dealerToString() {
      String result = "[";
      result += hand.get(0) + ", ??]";
      return result;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Deck deck = Deck.standardDeck();
    deck.shuffle();

    //Non-static nested class
    // Blackjack game = new Blackjack();
    // Blackjack.Hand player = game.new Hand();
    // Blackjack.Hand dealer = game.new Hand();

    //Static nested class
    Blackjack.Hand player = new Blackjack.Hand();
    Blackjack.Hand dealer = new Blackjack.Hand();

    player.add(deck.deal());
    dealer.add(deck.deal());
    player.add(deck.deal());
    dealer.add(deck.deal());

    System.out.println("Player has: " + player.toString() + " (" + player.getTotal() + ")");
    System.out.println("Dealer has: " + dealer.dealerToString());

    if (dealer.getTotal() == 21) {
      System.out.println("Dealer has Blackjack - game is over");
      if (player.getTotal() == 21) {
        System.out.println("Tie game!");
      } else {
        System.out.println("Dealer wins!");
      }
    } else {
      boolean keepGoing = true;
      while (keepGoing) {
        System.out.println("Hit or Stay? (hit/stay)");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("h")) {
          player.add(deck.deal());
          System.out.println("Player has: " + player.toString() + " (" + player.getTotal() + ")");
          if (player.getTotal() > 21) {
            System.out.println("Player BUSTED!");
            keepGoing = false;
          }
        } else {
          keepGoing = false;
        }
      }
    }

    System.out.println("Dealer reveals: " + dealer.toString() + " (" + dealer.getTotal() + ")");
    while (dealer.getTotal() < 17) {
      System.out.println("Dealer hits");
      dealer.add(deck.deal());
      System.out.println("Dealer has: " + dealer.toString() + " (" + dealer.getTotal() + ")");
    }

    // Tie
    if (dealer.getTotal() == player.getTotal() || (dealer.busted() && player.busted())) {
      System.out.println("TIE GAME!");
    }
    // Player wins
    if (dealer.busted() || (!player.busted() && player.getTotal() > dealer.getTotal())) {
      System.out.println("PLAYER WINS!");
    }
    // Dealer wins
    if (player.busted() || (!dealer.busted() && dealer.getTotal() > player.getTotal())) {
      System.out.println("DEALER WINS!");
    }

    input.close();
  }

}