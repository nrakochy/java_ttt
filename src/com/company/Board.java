package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private Map<Integer, String> boardSpaces;
    private String emptySpace = "";

    public Board(Integer boardSize) {
        boardSpaces = createBoard(boardSize);
    }

    public Map<Integer, String> createBoard(Integer boardSize) {
        Map<Integer, String> emptySpaces = new HashMap<Integer, String>();
        Integer numBoardSpaces = boardSize * boardSize;
        Integer spaceNum = 1;
        while (spaceNum <= numBoardSpaces) {
            emptySpaces.put(spaceNum, emptySpace);
            ++spaceNum;
        }
        return emptySpaces;
    }

    public Map<Integer, String> getBoardSpaces(){
        return boardSpaces;
    }

    public Integer getBoardSize() {
        return boardSpaces.size();
    }

    public List<Integer> findOpenSpaces(){
        List<Integer> openSpaces = new ArrayList();
        for(Map.Entry<Integer, String> space : boardSpaces.entrySet()){
            String spaceValue = space.getValue();
            if(spaceValue == emptySpace){
                openSpaces.add(space.getKey());
            }
        }
        return openSpaces;
    }

    public Map<Integer, String> applyMoveToBoard(Integer spaceNum, String playerSymbol ){
        boardSpaces.put(spaceNum, playerSymbol);
        return boardSpaces;
    }

    public Boolean spaceIsAvailable(Integer spaceNum){
        return boardSpaces.get(spaceNum) == emptySpace;
    }

    public Boolean boardIsFull(){
        return findOpenSpaces().size() == 0;
    }

}

