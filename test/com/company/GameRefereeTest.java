package com.company;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class GameRefereeTest {

    Integer boardSize3 = 3;
    GameRules rules = new GameRules(boardSize3);
    Board board = new Board(boardSize3);
    GameReferee game = new GameReferee(rules, board);

    @Test
    public void IsAValidMoveReturnsFalseIfSpaceDoesNotExistOnBoard () throws Exception {
        Integer spaceNum = 10;
        assertFalse("Did not return false for non-existent space", game.isValidMove(spaceNum));
    }

    @Test
    public void returnsFalseIfSpaceOnBoardAlreadyTaken () throws Exception {
        Integer spaceNum = 1;
        String playerSymbol = "X";
        board.applyMoveToBoard(spaceNum, playerSymbol);
        assertFalse("Did not return false for space already occupied", game.isValidMove(spaceNum));
    }

    @Test
    public void IsAValidMoveReturnsTrueIfSpaceNumIsAvailable () throws Exception {
        Integer spaceNum = 1;
        assertTrue("Did not return true for open space", game.isValidMove(spaceNum));
    }

    @Test
    public void returnsFalseIfMovesAreStillAvailableOnTheBoard () throws Exception {
        assertFalse("Did not return false for board with moves available", game.checkForTie());
    }

    @Test
    public void returnsTrueIfNoMovesAreStillAvailableOnTheBoard () throws Exception {
        String playerSymbol = "X";
        board.applyMoveToBoard(1, playerSymbol);
        board.applyMoveToBoard(2, playerSymbol);
        board.applyMoveToBoard(3, playerSymbol);
        board.applyMoveToBoard(4, playerSymbol);
        board.applyMoveToBoard(5, playerSymbol);
        board.applyMoveToBoard(6, playerSymbol);
        board.applyMoveToBoard(7, playerSymbol);
        board.applyMoveToBoard(8, playerSymbol);
        board.applyMoveToBoard(9, playerSymbol);
        assertTrue("Did not return true for open space", game.checkForTie());
    }
}