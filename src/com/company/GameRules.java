package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameRules{

    private Integer boardSize;
    public GameRules(Integer boardSize){
        this.boardSize = boardSize;
    }

    public List<List> findWinningRows(){
        List<List> winningRowCombos = new ArrayList<List>();
        Integer spaceNum = 1;
        while(winningRowCombos.size() < boardSize){
            List<Integer> winner = findWinningRow(spaceNum, boardSize);
            winningRowCombos.add(winner);
            spaceNum = winner.get(boardSize - 1) + 1;
        }
        return winningRowCombos;
    }

    public List<Integer> findWinningRow(Integer spaceNum, Integer rowLength) {
        List<Integer> winningRow = new ArrayList<Integer>();
        while (winningRow.size() < rowLength) {
            winningRow.add(spaceNum);
            spaceNum++;
        }
        return winningRow;
    }

    public List<List> findWinningColumns(){
        List<List> winningColumnCombos = new ArrayList<List>();
        Integer spaceNum = 1;
        while(winningColumnCombos.size() < boardSize){
            List<Integer> winner = findWinningColumn(spaceNum, boardSize);
            winningColumnCombos.add(winner);
            ++spaceNum;
        }
        return winningColumnCombos;
    }

    public List<Integer> findWinningColumn(Integer spaceNum, Integer columnSize) {
        List<Integer> winningColumn = new ArrayList<Integer>();
        while (winningColumn.size() < columnSize) {
            winningColumn.add(spaceNum);
            spaceNum += columnSize;
        }
        return winningColumn;
    }
}
