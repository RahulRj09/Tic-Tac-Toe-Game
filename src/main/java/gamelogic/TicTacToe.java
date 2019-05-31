package gamelogic;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] board = new String[][]{
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}
        };
        while (true) {
            for (String[] data : board) {
                System.out.print("\n");
                for (String data1 : data) {
                    System.out.print(data1+"|");
                }
                System.out.print("\n");
                System.out.print("__|__|__|");
            }
            System.out.println("\n");
            System.out.println("First Player X");
            int firstPlayerRow = input.nextInt();
            int firstPlayerColumn = input.nextInt();
            board[firstPlayerRow][firstPlayerColumn] = "x";
            System.out.println("Second Player O");
            int secondPlayerRow = input.nextInt();
            int secondPlayerColumn = input.nextInt();
            board[secondPlayerRow][secondPlayerColumn] = "o";
        }
    }
}
