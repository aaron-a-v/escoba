package escoba;
import java.util.ArrayList;
import java.util.Collections;

public class Table {
    private ArrayList<Card> deck;
    private ArrayList<Card> onTableCards;

    public Table(){
        deck = new ArrayList<>(); // Establecemos el ArrayList de la baraja
        onTableCards = new ArrayList<>(); // Establecemos el ArrayList del pozo
        String[] sticks = {"coins", "cups", "swords", "sticks"}; // Establecemos los nombres de los palos
        for (String s : sticks) { // Ejecutamos el bucle para los cuatro palos
            for (int i = 1; i <= 12; i++){ // Ejecutamos un segundo bucle para las diez cartas de cada palo, teniendo así 40
                if (i == 8 || i == 9) {continue;} // Saltamos el 8 y el 9
                deck.add(new Card(i, s)); // Añadimos a cada número un palo y lo metemos en el ArrayList de la baraja
            }
        }
    }
    
    public void shuffleDeck() {
        Collections.shuffle(deck);
    } // Barajamos las cartas
    public Card drawCard() {
        if (!deck.isEmpty()) {
            return deck.remove(0);
        }
        return null;
    }

    public ArrayList<Card> getOnTableCards() {
        return onTableCards;
    }

    public void addCardToTable(Card card) {
        onTableCards.add(card);
    }

    public void removeCardsFromTable(ArrayList<Card> cards) {
        onTableCards.removeAll(cards);
    }

    public boolean isDeckEmpty() {
        return deck.isEmpty();
    }
}
