package java_projects.tic_tac_toe;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TicTacToe {

    Map<String, String> board = new HashMap<>();





    public void initializeBoard() {
        board.put("A1", " ");
        board.put("A2", " ");
        board.put("A3", " ");
        board.put("B1", " ");
        board.put("B2", " ");
        board.put("B3", " ");
        board.put("C1", " ");
        board.put("C2", " ");
        board.put("C3", " ");

    }

    // Display current board
    public void displayBoard() {
        System.out.println("Current board:");
        System.out.println("A1: " + board.get("A1") + " | A2: " + board.get("A2") + " | A3: " + board.get("A3"));
        System.out.println("B1: " + board.get("B1") + " | B2: " + board.get("B2") + " | B3: " + board.get("B3"));
        System.out.println("C1: " + board.get("C1") + " | C2: " + board.get("C2") + " | C3: " + board.get("C3"));
    }

    public void updateBoard(String column, String symbol) {

        if (board.containsKey(column)) {
            board.put(column, symbol);
            System.out.println("updated " + column + " with " + 1);
        } else {
            System.out.println("Not valid " + column);
        }
    }


    public boolean checkWinner() {
        if (board.get("A1").equals("X") && board.get("A1").equals(board.get("A2"))
                &&  board.get("A3").equals(board.get("A2"))) {
            System.out.println("Winner is X");
            return true;
        }
       // System.out.println (board.keySet() + "key set"); //[A1, B2, C3, A2, B3, A3, C1, B1, C2]
        //System.out.println( board.values() + "board values"); //[x,x,x,]

        //para todos los values con X, pasame la keys de ese match
        var res = board.entrySet().stream()
                .filter(entry -> "X".equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(res);
       // if (res.contains("A1","A2", "A3")) System.out.println("A1 wins");
        /// winnig row A
        List<String> winningRow = Arrays.asList("A1", "A2", "A3");
        //wining diagonal
        List<String> winningDiagonal = Arrays.asList("A1", "B2", "C3");
        if (res.containsAll(winningRow)) {
            System.out.println("Row a wins");
        }

        if (res.containsAll(winningDiagonal)) {
            System.out.println("Diagonal wins");
        }
        return false;


        /*
        private static final List<List<String>> WINNING_COMBINATIONS = Arrays.asList(
        Arrays.asList("A1", "A2", "A3"), // Row A
        Arrays.asList("B1", "B2", "B3"), // Row B
        Arrays.asList("C1", "C2", "C3"), // Row C
        Arrays.asList("A1", "B1", "C1"), // Column 1
        Arrays.asList("A2", "B2", "C2"), // Column 2
        Arrays.asList("A3", "B3", "C3"), // Column 3
        Arrays.asList("A1", "B2", "C3"), // Diagonal 1
        Arrays.asList("A3", "B2", "C1")  // Diagonal 2
    );

    public static boolean checkWin(List<String> playerMoves) {
        for (List<String> combination : WINNING_COMBINATIONS) {
            if (playerMoves.containsAll(combination)) {
                return true;
            }
        }
        return false;
    }*/


        //otra opcion es seleccionar keys, si A1 , A2 y A3 son iguales won
    }
}



