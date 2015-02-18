package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameReferee {
    private GameRules rules;
    private Board board;

    public GameReferee(GameRules gameRules, Board gameBoard){
        this.rules = gameRules;
        this.board = gameBoard;
    }

    public Boolean isValidMove(Integer move){
        return board.spaceIsAvailable(move);
    }

    public Boolean checkForWin(List<Integer> playerMoves){
        return rules.hasAWinner(playerMoves);
    }

    public Boolean checkForTie(){
        return board.boardIsFull();
    }
}
