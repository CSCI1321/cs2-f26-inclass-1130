package cs2.cardgames;

import java.util.ArrayList;

public class Blackjack {
  public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
      this.cards = new ArrayList<Card>();
    }

    public void addCard(Card c) {
      this.cards.add(c);
    }

    public String toString() {
      return this.cards.toString() + " (" + getHandValue() + ")";
    }

    public String dealerToString() {
      String ret = "[--";
      for (int i = 1; i < cards.size(); i++) {
        Card c = cards.get(i);
        ret += ", " + c.toString();
  public static void main(String[] args) {
    Deck deck = Deck.standardDeck();
    deck.shuffle();


      }
      return ret + "]";
    }

    public int getHandValue() {
      int total = 0;
      boolean isAce = false;
      for (int i = 0; i < cards.size(); i++) {
        Card c = cards.get(i);
        if (c.getRank() == 1)
          isAce = true;
        if (c.getRank() <= 10) {
          total += c.getRank();
        } else {
          total += 10;
        }
      }
      if (isAce && total + 10 <= 21) {
        return total + 10;
      } else {
        return total;
      }
    }
  }

  public static void main(String[] args) {
    Deck deck = Deck.standardDeck();
    deck.shuffle();

    Hand player = new Hand();
    Hand dealer = new Hand();
    player.addCard(deck.deal());
    dealer.addCard(deck.deal());
    player.addCard(deck.deal());
    dealer.addCard(deck.deal());

    System.out.println("Player has " + player);
    System.out.println("Dealer has " + dealer.dealerToString());
  }

}
