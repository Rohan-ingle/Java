## Card.java

- `compareTo(Card card)`: Compares the current card with another card based on rank and suit.
- `equals(Object obj)`: Checks if the current card is equal to another object, primarily another card.
- `getRank()`: Retrieves the rank of the card.
- `getSuit()`: Retrieves the suit of the card.
- `toString()`: Returns a string representation of the card, showing its rank and suit.

## Deck.java

- `addCard(Card card)`: Adds a card to the deck.
- `clearDeck()`: Removes all cards from the deck.
- `dealHand(int n)`: Deals a hand of `n` cards from the deck.
- `drawCard()`: Draws the top card from the deck.
- `findCard(String rank, String suit)`: Searches for a card with the specified rank and suit in the deck.
- `printDeck()`: Prints all the cards currently in the deck.
- `shuffle()`: Randomly shuffles the cards in the deck.
- `sortDeck()`: Sorts the deck of cards.

## Main.java

- `main(String[] args)`: The entry point of the application, which initializes a `Deck` object and provides a menu for user interaction, allowing the user to perform various operations on the deck like shuffling, drawing, and sorting cards.