package escoba;
import java.util.ArrayList;

public abstract class Player {
    protected String name;
    private int points;
    private int escobas;
    protected ArrayList<Card> hand; // Debe ser protected para poder usarlo en las clases hijas
    private ArrayList<Card> capturedCards;
    
    
    //métodos
    public Player(String name, int points, int escobas){
        this.name = name;
        this.points = points;
        this.escobas = escobas;
        this.hand = new ArrayList<>();
        this.capturedCards = new ArrayList<>();
    }

    public String getName() { return name; }
    public ArrayList<Card> getHand(){ return hand;}
    public ArrayList<Card> getCapturedCards() { return capturedCards; }
    public void receiveCard(Card cardr){ hand.add(cardr); } // Añadimos cartas a nuestra mano

    public void captureCards(ArrayList<Card> cards) {
        capturedCards.addAll(cards);
    }
    
    public int getEscobas(){
        return escobas;
    }

    public void addEscoba() { this.escobas++; }
    
    public int getPoints(){
        return points;
    }
    
    public void addPoints(int pts) { this.points += pts; }
    
    //toString
    
}
