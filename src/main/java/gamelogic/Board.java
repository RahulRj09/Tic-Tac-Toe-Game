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

    void showBoard() {
        for (String[] row : board) {
            System.out.print("\n");
            for (String column : row) {
                System.out.print(column + "|");
            }
            System.out.print("\n");
            System.out.print("___|___|___|");
        }
        System.out.println("\n");
    }

    void updateBoard(Position position, String userInput) {
        board[position.row][position.column] = userInput;
    }

}
