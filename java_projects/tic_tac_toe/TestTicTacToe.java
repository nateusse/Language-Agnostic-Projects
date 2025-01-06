package java_projects.tic_tac_toe;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTicTacToe {

    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
        game.initializeBoard();
    }

    @Test
    public void testInitializeBoard() {
        assertEquals(" ", game.board.get("A1"));
        assertEquals(" ", game.board.get("B2"));
        assertEquals(" ", game.board.get("C3"));
    }

    @Test
    public void testUpdateBoardValidMove() {
        //boolean result = game.updateBoard("A1", "X");
       // assertTrue(result);
        //assertEquals("X", game.board.get("A1"));
    }

    @Test
    public void testUpdateBoardInvalidMove() {
        //game.updateBoard("A1", "X");
       // boolean result = game.updateBoard("A1", "O");
       // assertFalse(result);
        assertEquals("X", game.board.get("A1"));
    }

    @Test
    public void testCheckWinner() {
        /*game.updateBoard("A1", "X");
        game.updateBoard("A2", "X");
        game.updateBoard("A3", "X");
        assertTrue(game.checkWinner("X"));*/
    }
}
