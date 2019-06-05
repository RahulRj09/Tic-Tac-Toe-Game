package gamelogic;

public class Board {
    public String[][] board;

    Board() {
        this.board = new String[][]{
                {" 00", " 01", " 02"},
                {" 10", " 11", " 12"},
                {" 20", " 21", " 22"}
        };
    }

    String showBoard() {
        String newBoard = "";
        for (String[] row : this.board) {
            newBoard += "\n";
            for (String column : row) {
                newBoard += column + "|";
            }
            newBoard += "\n";
            newBoard += "___|___|___|";
        }
        newBoard += "\n";
        return newBoard;
    }

    void updateBoard(Position position, String userInput) {
        board[position.row][position.column] = userInput;
    }

}
