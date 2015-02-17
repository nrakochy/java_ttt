package com.company;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class BoardTest {
    int boardSize3 = 3;
    int boardSize4 = 4;
    public Board board3 = new Board(boardSize3);
    public Board board4 = new Board(boardSize4);


    @Test
    public void verify3x3BoardCreationRendersHashMapWithLengthOf9() {
        assertEquals("Did not create 3x3 board", 9, board3.boardSpaces.size());
    }

    @Test
    public void verify4x4BoardCreationRendersHashMapWithLengthOf16() {
        assertEquals("Did not create 3x3 board", 16, board4.boardSpaces.size());
    }
}
