package cs2.cardgames;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	// Fields
	private ArrayList<Card> cards;

	// Constructor
	public Deck() {
		this.cards = new ArrayList<Card>();
	}

	// Factory
	public static Deck emptyDeck() {
		return new Deck();
	}
	public static Deck standardDeck() {
		Deck d = new Deck();
		for (int i = 0; i < Card.SUITS.length; i++) { // Loop over all suits
			for (int r = 1; r <= 13; r++) { // Loop over all ranks
				d.cards.add(new Card(r, Card.SUITS[i])); // Create cards and add them to the deck
			}
		}
		return d;
	}

	// Methods
	public String toString() {
		return cards.toString();
	}

	public void shuffle() {
		Collections.shuffle(cards); // The Collections class has a static shuffle method
	}

	public void add(Card c) {
		cards.add(c);
	}

	public Card getCard(int i) {
		return cards.get(i);
	}

	public Card deal() {
		return cards.remove(0);
	}

	public int size() {
		return cards.size();
	}

	// Main tester
	public static void main(String[] args) {
		Deck myDeck = Deck.standardDeck();
		System.out.println(myDeck);
	}

}

