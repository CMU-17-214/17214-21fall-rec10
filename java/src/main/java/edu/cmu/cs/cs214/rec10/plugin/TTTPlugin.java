package edu.cmu.cs.cs214.rec10.plugin;

import edu.cmu.cs.cs214.rec10.framework.core.GameFramework;
import edu.cmu.cs.cs214.rec10.framework.core.GamePlugin;
import edu.cmu.cs.cs214.rec10.games.Memory;
import edu.cmu.cs.cs214.rec10.games.TicTacToe;

import java.util.List;

public class TTTPlugin implements GamePlugin<String> {
    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;

    private static final List<String> WORDS =
            List.of("Apple", "Boat", "Car", "Dog", "Eagle", "Fish", "Giraffe", "Helicopter");

    private static final String GAME_NAME = "TicTacToe";
    private static final String UNKNOWN_SQUARE_STRING = "?";
    private static final String BLANK_SQUARE_STRING = "";
    private static final String SELECT_FIRST_CARD_MSG = "Select first card.";
    private static final String SELECT_SECOND_CARD_MSG = "Select second card.";
    private static final String MATCH_FOUND_MSG = "You found a match!  Select first card.";
    private static final String NOT_A_MATCH_MSG = "That was not a match.  Select first card.";
    private static final String PLAYER_WON_MSG = "Player %d won!";
    private static final String PLAYERS_TIED_MSG = "Players %s tied.";

    private GameFramework framework;
    private TicTacToe game;
    private int firstIndexSelected;
    private int secondIndexSelected;
    private int numberOfCardsSelected;
    private boolean matchFound;

    @Override
    public String getGameName() {
        return GAME_NAME;
    }

    @Override
    public int getGridWidth() {
        return WIDTH;
    }

    @Override
    public int getGridHeight() {
        return HEIGHT;
    }

    @Override
    public void onRegister(GameFramework f) {
        this.framework = f;
    }

    @Override
    public void onNewGame() {

    }

    @Override
    public void onNewMove() {

    }

    @Override
    public boolean isMoveValid(int x, int y) {
        return game.isValidPlay(x,y);
    }

    @Override
    public boolean isMoveOver() {
        return true;
    }

    @Override
    public void onMovePlayed(int x, int y) {

    }

    @Override
    public boolean isGameOver() {
        return game.isOver();
    }

    @Override
    public String getGameOverMessage() {
        return null;
    }

    @Override
    public void onGameClosed() {

    }

    @Override
    public String currentPlayer() {
        return null;
    }
}
