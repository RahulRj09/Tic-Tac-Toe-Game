package gamelogic;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);
    boolean result = false;
    private static String[][] createBoard() {
        String[][] board = new String[][]{
                {" 00", " 01", " 02"},
                {" 10", " 11", " 12"},
                {" 20", " 21", " 22"}
        };

        return board;
    }

    public static void showBoard(String[][] board) {
        for (String[] boardData : board) {
            System.out.print("\n");
            for (String boardData1 : boardData) {
                System.out.print(boardData1 + "|");
            }
            System.out.print("\n");
            System.out.print("___|___|___|");
        }
        System.out.println("\n");
    }

    private static String[][] updateBoard(String[][] board) {
        System.out.println("Which place you want to put 'X / O' so just Enter the position number from the table ");
        System.out.println("First Player X");
        System.out.println("Enter the Row position '0'");
        int firstPlayerRow = input.nextInt();
        System.out.println("Enter the Column position '1'");
        int firstPlayerColumn = input.nextInt();
        board[firstPlayerRow][firstPlayerColumn] = " X ";
        if(winnerChecker(board," X ")){
            System.out.println("Winner X");

        }
        showBoard(board);
        System.out.println("Second Player O");
        System.out.println("Enter the Row position '0'");
        int secondPlayerRow = input.nextInt();
        System.out.println("Enter the Column position '1'");
        int secondPlayerColumn = input.nextInt();
        board[secondPlayerRow][secondPlayerColumn] = " O ";
        if(winnerChecker(board," O ")){
            System.out.println("winner O");
        }
        return board;
    }

    private static boolean winnerChecker(String[][] board, String a) {
        if (board[0][0].equals(a) && board[0][1].equals(a) && board[0][2].equals(a)) {
            return true;
        } else if (board[1][0].equals(a) && board[1][1].equals(a) && board[1][2].equals(a)) {
            return true;
        } else if (board[2][0].equals(a) && board[2][1].equals(a) && board[2][2].equals(a)) {
            return true;
        } else if (board[0][0].equals(a) && board[1][1].equals(a) && board[2][2].equals(a)) {
            return true;
        } else if (board[0][2].equals(a) && board[1][1].equals(a) && board[2][0].equals(a)) {
            return true;
        }else if (board[0][0].equals(a) && board[1][0].equals(a) && board[2][0].equals(a)) {
            return true;
        }else if (board[0][1].equals(a) && board[1][1].equals(a) && board[2][1].equals(a)) {
            return true;
        }else if (board[0][2].equals(a) && board[1][2].equals(a) && board[2][2].equals(a)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[][] board = createBoard();
        boolean b = false;
        while (true) {
            showBoard(board);
            updateBoard(board);
        }
    }
}
