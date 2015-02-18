package com.company;
import java.util.ArrayList;
import java.util.List;

public class GameRules{
    private Integer boardSize;
    private List<List> allWinningCombos = new ArrayList<List>();

    public GameRules(Integer boardSize){
        this.boardSize = boardSize;
        findAllWinningCombos();
    }

    public Boolean isAWinner(List combo){
        return allWinningCombos.contains(combo);
    }

    public Boolean hasAWinner(List<List> playerCombinations){
        for(List combo : playerCombinations){
            if(isAWinner(combo)){ return true; }
        }
        return false;
    }

    public List<List> generateMovePermutations(List<Integer> playerMoves){
        if(playerMoves.size() == 0){
            List<List> result = new ArrayList();
            result.add(new ArrayList<Integer>());
            return result;
        }

        Integer firstElement = playerMoves.remove(0);
        List<List>  allPlayerMoveCombos= new ArrayList();
        List<List>  allPermutations = generateMovePermutations(playerMoves);
        for(List<Integer> subSet : allPermutations ){
            for(Integer index = 0; index <= subSet.size(); index++) {
                List<Integer> temp = new ArrayList<Integer>(subSet);
                temp.add(index, firstElement);
                allPlayerMoveCombos.add(temp);
            }
        }
        return allPlayerMoveCombos;
    }

    public List<List> getAllWinningCombos(){
        return allWinningCombos;
    }

    public void findAllWinningCombos(){
        List<List> winningRows = findWinningRows();
        List<List> winningColumns = findWinningColumns();
        List<Integer> winningLeftDiagonal = findWinningLeftDiagonal();
        List<Integer> winningRightDiagonal = findWinningRightDiagonal();
        addCombosToListOfAllWinners(winningRows);
        addCombosToListOfAllWinners(winningColumns);
        allWinningCombos.add(winningLeftDiagonal);
        allWinningCombos.add(winningRightDiagonal);
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
