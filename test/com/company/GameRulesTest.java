package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GameRulesTest {
    Integer boardSize3 = 3;
    Integer boardSize4 = 4;
    public GameRules rules3x3 = new GameRules(boardSize3);
    public GameRules rules4x4 = new GameRules(boardSize4);

    @Test
    public void correctlyReturnsListOfAllWinningRowCombos3x3() throws Exception {
        List<Integer> winningRow1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<Integer> winningRow2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        List<Integer> winningRow3 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
        List<List> winningRowCombos = new ArrayList<List>();
        winningRowCombos.add(winningRow1);
        winningRowCombos.add(winningRow2);
        winningRowCombos.add(winningRow3);
        assertEquals("Did not return 9 open spaces", winningRowCombos, rules3x3.findWinningRows());
    }

    @Test
    public void correctlyReturnsListOfAllWinningRowCombos4x4() throws Exception {
        List<Integer> winningRow1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        List<Integer> winningRow2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8));
        List<Integer> winningRow3 = new ArrayList<Integer>(Arrays.asList(9, 10, 11, 12));
        List<Integer> winningRow4 = new ArrayList<Integer>(Arrays.asList(13, 14, 15, 16));
        List<List> winningRowCombos = new ArrayList<List>();
        winningRowCombos.add(winningRow1);
        winningRowCombos.add(winningRow2);
        winningRowCombos.add(winningRow3);
        winningRowCombos.add(winningRow4);
        assertEquals("Did not return 9 open spaces", winningRowCombos, rules4x4.findWinningRows());
    }

    @Test
    public void correctlyReturnsListOfWinningCombosForSingleRow3x3() throws Exception {
        Integer spaceNum = 1;
        Integer rowLength = 3;
        List<Integer> winningRow1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        assertEquals("Did not return winning row combo for 3x3", winningRow1, rules3x3.findWinningRow(spaceNum, rowLength));
    }

    @Test
    public void correctlyReturnsListOfWinningCombosForSingleRow4x4() throws Exception {
        Integer spaceNum = 1;
        Integer rowLength = 4;
        List<Integer> winningRow1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertEquals("Did not return winning row combo for 4x4", winningRow1, rules3x3.findWinningRow(spaceNum, rowLength));
    }
}