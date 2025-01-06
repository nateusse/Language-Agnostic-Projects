package java_projects.tic_tac_toe;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        /* TIC TAC TOE*/
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.initializeBoard();
        ticTacToe.displayBoard();


        var winner = ticTacToe.checkWinner();
        while(!winner) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter column and row number:");
            String column = scanner.nextLine();
            System.out.println("Please symbol:");
            String symbol = scanner.nextLine();
            ticTacToe.updateBoard(column, symbol);
            ticTacToe.displayBoard();
            winner = ticTacToe.checkWinner();

        }




    }
}
