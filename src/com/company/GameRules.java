package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameRules{
    public GameRules(){}

    public List<List> findWinningRows(Integer boardSize){
        List<List> winningRowCombos = new ArrayList<List>();
        Integer spaceNum = 1;
        while(winningRowCombos.size() < boardSize){
            List<Integer> winningRow = new ArrayList<Integer>();
            while(winningRow.size() < boardSize){
                winningRow.add(spaceNum);
                spaceNum++;
            }
            winningRowCombos.add(winningRow);
        }
        return winningRowCombos;
    }





}
