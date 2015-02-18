package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameRules{

    private Integer boardSize;
    public List<List> allWinningCombos;

    public GameRules(Integer boardSize){
        this.boardSize = boardSize;
        allWinningCombos = new ArrayList<List>();
    }

    public List<List> findAllWinningCombos(){
        List<List> winningRows = findWinningRows();
        List<List> winningColumns = findWinningColumns();
        List<Integer> winningLeftDiagonal = findWinningLeftDiagonal();
        List<Integer> winningRightDiagonal = findWinningRightDiagonal();
        addCombosToListOfAllWinners(winningRows);
        addCombosToListOfAllWinners(winningColumns);
        allWinningCombos.add(winningLeftDiagonal);
        allWinningCombos.add(winningRightDiagonal);
        return allWinningCombos;
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

    public List<Integer> findWinningLeftDiagonal() {
        Integer spaceNum = 1;
        List<Integer> winningLeftDiagonal = new ArrayList<Integer>();
        while (winningLeftDiagonal.size() < boardSize) {
            winningLeftDiagonal.add(spaceNum);
            spaceNum = spaceNum + boardSize + 1;
        }
        return winningLeftDiagonal;
    }

    public List<Integer> findWinningRightDiagonal() {
        Integer spaceNum = boardSize;
        List<Integer> winningRightDiagonal = new ArrayList<Integer>();
        while (winningRightDiagonal.size() < boardSize) {
            winningRightDiagonal.add(spaceNum);
            spaceNum = (spaceNum + boardSize) - 1;
        }
        return winningRightDiagonal;
    }

    private void addCombosToListOfAllWinners(List<List> winningCombos){
        for(List combo : winningCombos){
            allWinningCombos.add(combo);
        }
    }
}
