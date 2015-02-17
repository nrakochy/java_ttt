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


    @Test
    public void correctlyReturnsSingleWinningColumn3x3() throws Exception {
        Integer spaceNum = 1;
        Integer columnSize = 3;
        List<Integer> winningColumn1 = new ArrayList<Integer>(Arrays.asList(1, 4, 7));
        assertEquals("Did not return winning row combo for 3x3", winningColumn1, rules3x3.findWinningColumn(spaceNum, columnSize));
    }

    @Test
    public void correctlyReturnsSingleWinningColumn4x4() throws Exception {
        Integer spaceNum = 1;
        Integer columnSize = 4;
        List<Integer> winningColumn1 = new ArrayList<Integer>(Arrays.asList(1, 5, 9, 13));
        assertEquals("Did not return winning row combo for 3x3", winningColumn1, rules4x4.findWinningColumn(spaceNum, columnSize));
    }

    @Test
    public void correctlyReturnsListOfWinningColumnsFor3x3() throws Exception {
        List<Integer> winningColumn1 = new ArrayList<Integer>(Arrays.asList(1, 4, 7));
        List<Integer> winningColumn2 = new ArrayList<Integer>(Arrays.asList(2, 5, 8));
        List<Integer> winningColumn3 = new ArrayList<Integer>(Arrays.asList(3, 6, 9));
        List<List> winningColumnCombos = new ArrayList<List>();
        winningColumnCombos.add(winningColumn1);
        winningColumnCombos.add(winningColumn2);
        winningColumnCombos.add(winningColumn3);
        assertEquals("Did not return winning column combos for 3x3", winningColumnCombos, rules3x3.findWinningColumns());
    }


    @Test
    public void correctlyReturnsListOfWinningColumnsFor4x4() throws Exception {
        List<Integer> winningColumn1 = new ArrayList<Integer>(Arrays.asList(1, 5, 9, 13));
        List<Integer> winningColumn2 = new ArrayList<Integer>(Arrays.asList(2, 6, 10, 14));
        List<Integer> winningColumn3 = new ArrayList<Integer>(Arrays.asList(3, 7, 11, 15));
        List<Integer> winningColumn4 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        List<List> winningColumnCombos = new ArrayList<List>();
        winningColumnCombos.add(winningColumn1);
        winningColumnCombos.add(winningColumn2);
        winningColumnCombos.add(winningColumn3);
        winningColumnCombos.add(winningColumn4);
        assertEquals("Did not return winning column combos for 4x4", winningColumnCombos, rules4x4.findWinningColumns());
    }
}