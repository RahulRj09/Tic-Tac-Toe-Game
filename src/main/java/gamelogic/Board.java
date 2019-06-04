package gamelogic;

public class Board {
    private String[][] board;

    private Board() {
        this.board = new String[][]{
                {" 00", " 01", " 02"},
                {" 10", " 11", " 12"},
                {" 20", " 21", " 22"}
        };
    }

    private void showBoard() {
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

    private void updateBoard(int row, int column, String userInput) {
        board[row][column] = userInput;
    }

    public static void main(String[] args) {
        Board demo = new Board();
        demo.showBoard();
        demo.updateBoard(0, 0, " X ");
        demo.showBoard();
        demo.updateBoard(1, 1, " O ");
        demo.showBoard();

    }
}
