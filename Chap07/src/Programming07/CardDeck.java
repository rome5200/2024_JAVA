package Programming07;


import java.util.ArrayList;
import java.util.Iterator;

public class CardDeck implements Iterable<String> {
    private ArrayList<String> cards;

    public CardDeck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String value : values) {
            cards.add(value);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new CardIterator(cards);
    }

    private static class CardIterator implements Iterator<String> {
        private final ArrayList<String> cards;
        private int currentIndex;

        public CardIterator(ArrayList<String> cards) {
            this.cards = cards;
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < cards.size();
        }

        @Override
        public String next() {
            String card = cards.get(currentIndex);
            currentIndex++;
            return "next()가 반환하는 값: " + card;
        }
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Iterator<String> iterator = deck.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
