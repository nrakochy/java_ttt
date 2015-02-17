package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    public Map<Integer, String> boardSpaces;
    private String emptySpace = "";

    public Board(int boardSize) {
        boardSpaces = createBoard(boardSize);
    }


    public Map<Integer, String> createBoard(int boardSize) {
        Map<Integer, String> emptySpaces = new HashMap<Integer, String>();
        int numBoardSpaces = boardSize * boardSize;
        int spaceNum = 1;
        while (spaceNum <= numBoardSpaces) {
            emptySpaces.put(spaceNum, emptySpace);
            ++spaceNum;
        }
        return emptySpaces;
    }

    public int getBoardSize() {
        return boardSpaces.size();
    }

    public List<Integer> findOpenSpaces(){
        List<Integer> openSpaces = new ArrayList();
        for (Map.Entry<Integer, String> space : boardSpaces.entrySet()){
            String spaceValue = space.getValue();
            if(spaceValue == emptySpace){
                openSpaces.add(space.getKey());
            }
        }
        return openSpaces;
    }

}

