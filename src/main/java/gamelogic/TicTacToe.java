package gamelogic;


import java.util.Scanner;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);

    private static Position getPosition() {
        System.out.println("Which place you want to put 'X / O' so just Enter the position number from the table ");
        System.out.println("Enter the Row position '0'");
        int row = input.nextInt();
        System.out.println("Enter the Column position '1'");
        int column = input.nextInt();
        return new Position(row, column);
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.display());
        while (game.isRunning()) {
            System.out.println("Player turn");
            game.playGame(getPosition());
            System.out.println(game.display());
        }
        if (game.winnerChecker() == null) {
            System.out.println("Game Over");
            return;
        }
        System.out.println(game.winnerChecker());

    }
}
