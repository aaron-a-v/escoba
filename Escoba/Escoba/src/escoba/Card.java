package escoba;

public class Card {
    private int num;
    private String stick;

    //métodos
    public Card() {
    }

    public Card(int num, String stick) {
        this.num = num;
        
        if (stick.equals("coins") || stick.equals("cups") || stick.equals("swords") || stick.equals("sticks")) {
            this.stick = stick;
        }
    }
    
    public int getNum(){
        return num;
    }
    
    
    public String getStick(){
        return stick;
    }

    // Valor de la carta para sumar 15 en la Escoba
    public int getValue() {
        if (num == 10) return 8;  // Sota
        if (num == 11) return 9;  // Caballo
        if (num == 12) return 10; // Rey
        return num;               // Del 1 al 7 suman su propio valor
    }
    
    public String toString(){
        String nameCard = String.valueOf(num);
        if (num == 10) nameCard = "jack";
        if (num == 11) nameCard = "horse";
        if (num == 12) nameCard = "king";
        if (num == 1) nameCard = "as";
        return nameCard + " of " + stick;
    }
    
    
}
