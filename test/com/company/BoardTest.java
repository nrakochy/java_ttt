package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


public class BoardTest {
    int boardSize3 = 3;
    int boardSize4 = 4;
    public Board board3 = new Board(boardSize3);
    public Board board4 = new Board(boardSize4);


    @Test
    public void verify3x3BoardCreationRendersHashMapWithLengthOf9() throws Exception {
        assertEquals("Did not create 3x3 board", 9, board3.boardSpaces.size());
    }

    @Test
    public void verify4x4BoardCreationRendersHashMapWithLengthOf16() throws Exception {
        assertEquals("Did not create 3x3 board", 16, board4.boardSpaces.size());
    }

    @Test
    public void verifyCorrectBoardSpacesReturnedOn3x3() throws Exception {
        assertEquals("Did not return 9 for board with 9 spaces", 9, board3.getBoardSize());
    }

    @Test
    public void verifyCorrectBoardSpacesReturnedOn4x4() throws Exception {
        assertEquals("Did not return 9 for board with 16 spaces", 16, board4.getBoardSize());
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
}
