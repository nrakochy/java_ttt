package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GameRulesTest {

        Integer boardSize3 = 3;
        GameRules rules3x3 = new GameRules(boardSize3);
        List<Integer> winning3x3Row1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<Integer> winning3x3Row2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        List<Integer> winning3x3Row3 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
        List<Integer> winning3x3Column1 = new ArrayList<Integer>(Arrays.asList(1, 4, 7));
        List<Integer> winning3x3Column2 = new ArrayList<Integer>(Arrays.asList(2, 5, 8));
        List<Integer> winning3x3Column3 = new ArrayList<Integer>(Arrays.asList(3, 6, 9));
        List<Integer> winning3x3LeftDiagonal = new ArrayList<Integer>(Arrays.asList(1, 5, 9));
        List<Integer> winning3x3RightDiagonal = new ArrayList<Integer>(Arrays.asList(3, 5, 7));
        List<List<Integer>> winning3x3Combos = Arrays.asList(
                        winning3x3Row1, winning3x3Row2, winning3x3Row3,
                        winning3x3Column1, winning3x3Column2, winning3x3Column3,
                        winning3x3LeftDiagonal, winning3x3RightDiagonal);


        Integer boardSize4 = 4;
        GameRules rules4x4 = new GameRules(boardSize4);
        List<Integer> winning4x4Row1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        List<Integer> winning4x4Row2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8));
        List<Integer> winning4x4Row3 = new ArrayList<Integer>(Arrays.asList(9, 10, 11, 12));
        List<Integer> winning4x4Row4 = new ArrayList<Integer>(Arrays.asList(13, 14, 15, 16));
        List<Integer> winning4x4Column1 = new ArrayList<Integer>(Arrays.asList(1, 5, 9, 13));
        List<Integer> winning4x4Column2 = new ArrayList<Integer>(Arrays.asList(2, 6, 10, 14));
        List<Integer> winning4x4Column3 = new ArrayList<Integer>(Arrays.asList(3, 7, 11, 15));
        List<Integer> winning4x4Column4 = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));
        List<Integer> winning4x4LeftDiagonal = new ArrayList<Integer>(Arrays.asList(1, 6, 11, 16));
        List<Integer> winning4x4RightDiagonal = new ArrayList<Integer>(Arrays.asList(4, 7, 10, 13));
        List<List<Integer>> winning4x4Combos = Arrays.asList(
                winning4x4Row1, winning4x4Row2, winning4x4Row3, winning4x4Row4,
                winning4x4Column1, winning4x4Column2, winning4x4Column3, winning4x4Column4,
                winning4x4LeftDiagonal, winning4x4RightDiagonal);

    @Test
    public void correctlyReturnsListOfAllWinningRowCombos3x3() throws Exception {
        List<List> winningRowCombos = new ArrayList<List>();
        winningRowCombos.add(winning3x3Row1);
        winningRowCombos.add(winning3x3Row2);
        winningRowCombos.add(winning3x3Row3);
        assertEquals("Did not return winning combo rows on 3x3", winningRowCombos, rules3x3.findWinningRows());
    }


    @Test
    public void correctlyReturnsListOfWinningCombosForSingleRow3x3StartingWithNum1() throws Exception {
        Integer spaceNum = 1;
        assertEquals("Did not return single row combo for 3x3", winning3x3Row1, rules3x3.findWinningRow(spaceNum, boardSize3));
    }

    @Test
    public void correctlyReturnsSingleWinningColumn3x3StartingWithNum1() throws Exception {
        Integer spaceNum = 1;
        assertEquals("Did not return all winning row combos for 3x3", winning3x3Column1, rules3x3.findWinningColumn(spaceNum, boardSize3));
    }

    @Test
    public void correctlyReturnsListOfWinningColumnsFor3x3() throws Exception {
        List<List> winningColumnCombos = new ArrayList<List>();
        winningColumnCombos.add(winning3x3Column1);
        winningColumnCombos.add(winning3x3Column2);
        winningColumnCombos.add(winning3x3Column3);
        assertEquals("Did not return winning column combos for 3x3", winningColumnCombos, rules3x3.findWinningColumns());
    }


    @Test
    public void correctlyReturnsWinningLeftDiagonal3x3() throws Exception {
        assertEquals("Did not return single winning left diagonal 3x3", winning3x3LeftDiagonal, rules3x3.findWinningLeftDiagonal());
    }

    @Test
    public void correctlyReturnsWinningRightDiagonal3x3() throws Exception {
        assertEquals("Did not return winning right diagonal 3x3", winning3x3RightDiagonal, rules3x3.findWinningRightDiagonal());
    }

    @Test
    public void correctlyReturnsAllWinningCombinations3x3Board() throws Exception {
        assertEquals("Did not return single row combo for 3x3", winning3x3Combos, rules3x3.getAllWinningCombos());
    }

    @Test
    public void correctlyReturnsListOfAllWinningRowCombos4x4() throws Exception {
        List<List> winningRowCombos = new ArrayList<List>();
        winningRowCombos.add(winning4x4Row1);
        winningRowCombos.add(winning4x4Row2);
        winningRowCombos.add(winning4x4Row3);
        winningRowCombos.add(winning4x4Row4);
        assertEquals("Did not return winning combo rows on 4x4", winningRowCombos, rules4x4.findWinningRows());
    }

    @Test
    public void correctlyReturnsListOfWinningCombosForSingleRow4x4() throws Exception {
        Integer spaceNum = 1;
        assertEquals("Did not return single row combo for 4x4", winning4x4Row1, rules3x3.findWinningRow(spaceNum, boardSize4));
    }


    @Test
    public void correctlyReturnsSingleWinningColumn4x4() throws Exception {
        Integer spaceNum = 1;
        assertEquals("Did not return all winning row combos for 4x4", winning4x4Column1, rules4x4.findWinningColumn(spaceNum, boardSize4));
    }

    @Test
    public void correctlyReturnsListOfWinningColumnsFor4x4() throws Exception {
        List<List> winningColumnCombos = new ArrayList<List>();
        winningColumnCombos.add(winning4x4Column1);
        winningColumnCombos.add(winning4x4Column2);
        winningColumnCombos.add(winning4x4Column3);
        winningColumnCombos.add(winning4x4Column4);
        assertEquals("Did not return winning column combos for 4x4", winningColumnCombos, rules4x4.findWinningColumns());
    }

    @Test
    public void correctlyReturnsWinningLeftDiagonal4x4() throws Exception {
        assertEquals("Did not return single winning left diagonal 4x4", winning4x4LeftDiagonal, rules4x4.findWinningLeftDiagonal());
    }

    @Test
    public void correctlyReturnsWinningRightDiagonal4x4() throws Exception {
        assertEquals("Did not return winning right diagonal 4x4", winning4x4RightDiagonal, rules4x4.findWinningRightDiagonal());
    }

    @Test
    public void correctlyReturnsListOfAllWinningCombos4x4() throws Exception {
        assertEquals("Did not return all winning combinations", winning4x4Combos, rules4x4.getAllWinningCombos());
    }

    @Test
    public void returnsTrueIfListIsAWinningCombo3x3() throws Exception {
        List<Integer> winnerRow = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertTrue("Did not evaluate list as winning combo", rules3x3.isAWinner(winning3x3Row1, winnerRow));
    }

    @Test
    public void returnsTrueIfListHasAWinningCombo3x3RegardlessOfOrder() throws Exception {
        List<Integer> winnerRow = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 3));
        assertTrue("Did not evaluate list as winning combo", rules3x3.isAWinner(winning3x3Row1, winnerRow));
    }

    @Test
    public void returnsTrueIfListIsAWinningCombo4x4() throws Exception {
        List<Integer> winnerRow = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertTrue("Did not evaluate list as winning combo", rules4x4.isAWinner(winning4x4Row1, winnerRow));
    }

    @Test
    public void returnsFalseIfListIsANotWinningCombo3x3() throws Exception {
        List<Integer> loserRow = new ArrayList<Integer>(Arrays.asList(1, 3, 9, 4));
        assertFalse("Did not evaluate list as winning combo", rules3x3.hasAWinner(loserRow));
    }


    @Test
    public void returnsFalseIfListIsANotWinningComboLessThan3Elements() throws Exception {
        List<Integer> loserRow = new ArrayList<Integer>(Arrays.asList(1, 3));
        assertFalse("Did not evaluate list as winning combo", rules3x3.hasAWinner(loserRow));
    }

    @Test
    public void returnsFalseIfListIsLosingComboLessThan4Elements() throws Exception {
        List<Integer> loserRow = new ArrayList<Integer>(Arrays.asList(1, 3, 9));
        assertFalse("Did not evaluate list as winning combo", rules4x4.hasAWinner(loserRow));
    }

    @Test
    public void returnsFalseIfListDoesNotHaveWinningCombo4x4() throws Exception {
        List<Integer> loserRow = new ArrayList<Integer>(Arrays.asList(1, 3, 9, 10));
        assertFalse("Did not evaluate list as winning combo", rules4x4.hasAWinner(loserRow));
    }
}