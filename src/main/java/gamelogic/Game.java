package gamelogic;

public class Game {
    private Board board = new Board();
    private Turn turn = new Turn();
    private int count = 0;

    public String winnerChecker() {
        String symbol = turn.getSymbol();
        if (board.board[0][0].equals(symbol) && board.board[0][1].equals(symbol) && board.board[0][2].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[1][0].equals(symbol) && board.board[1][1].equals(symbol) && board.board[1][2].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[2][0].equals(symbol) && board.board[2][1].equals(symbol) && board.board[2][2].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[0][0].equals(symbol) && board.board[1][0].equals(symbol) && board.board[2][0].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[0][1].equals(symbol) && board.board[1][1].equals(symbol) && board.board[2][1].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[0][2].equals(symbol) && board.board[1][2].equals(symbol) && board.board[2][2].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[0][0].equals(symbol) && board.board[1][1].equals(symbol) && board.board[2][2].equals(symbol)) {
            return "Win" + symbol;
        } else if (board.board[0][2].equals(symbol) && board.board[1][1].equals(symbol) && board.board[2][0].equals(symbol)) {
            return "Win" + symbol;
        }
        return null;
    }

    boolean isRunning() {
        if (count == 9) {
            return false;
        }
        count++;
        if (winnerChecker() == null) {
            return true;
        }
        return false;
    }

    void playGame(Position position) {
        board.updateBoard(position, turn.changeTurn());
    }

    void display() {
        board.showBoard();
    }

}
