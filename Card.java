/* PROBLEM: Design the data structures for a generic deck
of cards. Explain how you would subclass it to implement
particular card games. */

public class Card {
	private int value;
	private int suit;
	// 1 = hearts, 2 = diamonds, 3 = spades, 4 = clubs

	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}

	public int getValue() { return value; }

	public int getSuit() {return suit; }

	public String getNameOfSuit() {
		switch (suit) {
			case 1: 
				return "Hearts";
			case 2: 
				return "Diamonds";
			case 3: 
				return "Spades";
			case 4: 
				return "Clubs";
			default:
				throw new RuntimeException("Suit number is not between 1 and 4.");
		}
	}
}

class BlackJackCard extends Card {
	public BlackJackCard(int value, int suit) {
		super(value, suit);
	}

	// Uses blackjack point values
	public int getValue() {
		int value = super.getValue();
		if (value == 1) return 11;
		else if (value < 10) return value;
		else return 10;
	}
}