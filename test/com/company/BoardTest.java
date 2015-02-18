package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class BoardTest {
    int boardSize3 = 3;
    int boardSize4 = 4;
    String playerSymbol = "O";

    public Board board3 = new Board(boardSize3);
    public Board board4 = new Board(boardSize4);


    @Test
    public void verify3x3BoardCreationRendersHashMapWithLengthOf9() throws Exception {
        assertEquals("Did not create 3x3 board", 9, board3.getBoardSpaces().size());
    }

    @Test
    public void verify4x4BoardCreationRendersHashMapWithLengthOf16() throws Exception {
        assertEquals("Did not create 3x3 board", 16, board4.getBoardSpaces().size());
    }

    @Test
    public void verifyCorrectBoardSpacesReturnedOn3x3() throws Exception {
        Integer boardSize = 9;
        assertEquals("Did not return 9 for board with 9 spaces", boardSize, board3.getBoardSize());
    }

    @Test
    public void verifyCorrectBoardSpacesReturnedOn4x4() throws Exception {
        Integer boardSize = 16;
        assertEquals("Did not return 9 for board with 16 spaces", boardSize, board4.getBoardSize());
    }

    @Test
    public void correctlyFindsSpacesOnTheBoardWhichHaveNotBeenPlayedYet3x3() throws Exception {
        List<Integer> openBoard = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals("Did not return 9 open spaces", openBoard, board3.findOpenSpaces());

    }

    @Test
    public void correctlyFindsSpacesOnTheBoardWhichHaveNotBeenPlayedYet4x4() throws Exception {
        List<Integer> openBoard =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
        assertEquals("Did not return 16 open spaces", openBoard, board4.findOpenSpaces());
    }

    @Test
    public void correctlyreplacesEmptySpaceWithPlayerSymbol3x3() throws Exception {
        Integer spaceNum = 1;
        board3.applyMoveToBoard(spaceNum, playerSymbol);
        assertEquals("Did not add player symbol to empty space", playerSymbol, board3.getBoardSpaces().get(spaceNum));
    }

    @Test
    public void correctlyreplacesEmptySpaceWithPlayerSymbol4x4() throws Exception {
        Integer spaceNum = 2;
        board3.applyMoveToBoard(spaceNum, playerSymbol);
        assertEquals("Did not add player symbol to empty space", playerSymbol, board3.getBoardSpaces().get(spaceNum));
    }

    @Test
    public void correctlyReturnsTrueIfSpaceIsAvailableForMove3x3() throws Exception {
        Integer spaceNum1 = 1;
        Integer spaceNum2 = 2;
        board3.applyMoveToBoard(spaceNum1, playerSymbol);
        assertTrue(board3.spaceIsAvailable(spaceNum2));
    }

    @Test
    public void correctlyReturnsFalseIfSpaceIsNotAvailableForMove3x3() throws Exception {
        Integer spaceNum1 = 1;
        board3.applyMoveToBoard(spaceNum1, playerSymbol);
        assertFalse(board3.spaceIsAvailable(spaceNum1));
    }
    @Test
    public void correctlyReturnsTrueIfSpaceIsAvailableForMove4x4() throws Exception {
        Integer spaceNum1 = 1;
        Integer spaceNum2 = 2;
        board4.applyMoveToBoard(spaceNum1, playerSymbol);
        assertTrue(board4.spaceIsAvailable(spaceNum2));
    }

    @Test
    public void correctlyReturnsFalseIfSpaceIsNotAvailableForMove4x4() throws Exception {
        Integer spaceNum1 = 1;
        board4.applyMoveToBoard(spaceNum1, playerSymbol);
        assertFalse(board4.spaceIsAvailable(spaceNum1));
    }

    @Test
    public void returnsTrueIfNoOpensSpacesOnTheBoard() throws Exception {
        board3.applyMoveToBoard(1, playerSymbol);
        board3.applyMoveToBoard(2, playerSymbol);
        board3.applyMoveToBoard(3, playerSymbol);
        board3.applyMoveToBoard(4, playerSymbol);
        board3.applyMoveToBoard(5, playerSymbol);
        board3.applyMoveToBoard(6, playerSymbol);
        board3.applyMoveToBoard(7, playerSymbol);
        board3.applyMoveToBoard(8, playerSymbol);
        board3.applyMoveToBoard(9, playerSymbol);
        assertTrue(board3.boardIsFull());
    }

    @Test
    public void returnsFalseOnNewBoardFullOfEmptySpaces() throws Exception {
        assertFalse(board3.boardIsFull());
    }
}
