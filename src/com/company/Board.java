package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 1/23/15.
 */
public class Board {

    public Map<Integer, String> boardSpaces;

    public Board(int boardSize) {
        boardSpaces = createBoard(boardSize);
    }


    public Map createBoard(int boardSize) {
        Map emptySpaces = new HashMap<Integer, String>();
        String emptySpace = "";
        int numBoardSpaces = boardSize * boardSize;
        int spaceNum = 1;
        while(spaceNum <= numBoardSpaces){
            emptySpaces.put(spaceNum, emptySpace);
            ++spaceNum;
        }
        return emptySpaces;
        }
    }
