package com.tasks3.carddeck;

import java.util.*;

public class Deck {

  static List<Suit> suitlist = Arrays.asList(Suit.values);
  static List<Rank> ranklist = Arrays.asList(Rank.values);

  private List<Card> cards;
  private ListIterator<Card> cardListIterator;

  public Deck() {
    super();
    initDeck();
  }

  public List<Card> getCards() {
    return cards;
  }

  public void initDeck() {
    this.cards = new LinkedList<Card>();
    for (int i = 0; i <= (suitlist.size() - 1); i++) {
      for (int j = 0; j <= (ranklist.size() - 1); j++) {
        Card card = new Card(ranklist.get(j), suitlist.get(i));
        this.cards.add(card);
      }
    }
    initIterator();
  }

  //Перемішує колоду у випадковому порядку
  public void shuffle() {
    Collections.shuffle(this.cards);
  }

  public void order() {
    Deck deck = new Deck();
    deck.initDeck();
    List<Card> cards = deck.getCards();

    Collections.sort(
      cards,
      new Comparator<Card>() {
        public int compare(Card c1, Card c2) {
          int r1 = ranklist.indexOf(c1.getRank());
          int r2 = ranklist.indexOf(c2.getRank());
          int s1 = suitlist.indexOf(c1.getSuit());
          int s2 = suitlist.indexOf(c2.getSuit());
          return (s1 < s2)
            ? -1
            : ((s1 == s2) ? (r1 < r2) ? -1 : ((r1 == r2) ? 0 : 1) : 1);
        }
      }
    );
  }

  public void initIterator() {
    cardListIterator = cards.listIterator(cards.size());
  }

  public boolean hasNext() {
    return cardListIterator.hasNext();
  }

  public Card drawOne() {
    if (cardListIterator.hasPrevious()) {
      return cardListIterator.previous();
    } else {
      return null;
    }
  }
}
