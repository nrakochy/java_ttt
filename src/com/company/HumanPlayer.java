package com.company;

public class HumanPlayer implements PlayerInterface {
    private String playerSymbol;
    private UIService ui;

    public HumanPlayer(String playerSymbol, UIService ui){
        this.playerSymbol = playerSymbol;
        this.ui = ui;
    }

    @Override
    public String getPlayerSymbol() {
        return playerSymbol;
    }

    @Override
    public String makeMove() {
        return ui.getUserInput();
    }
}
