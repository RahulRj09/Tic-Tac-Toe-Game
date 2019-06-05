package gamelogic;

public class Turn {
    private int count = 0;
    String symbol;

    String changeTurn() {
        if (count % 2 == 0) {
            this.symbol = " X ";
        } else {
            this.symbol = " O ";
        }
        count++;
        return symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
