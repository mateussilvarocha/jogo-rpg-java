package org.example.Controller;

import org.example.Model.GameEvent;

public class GameEventController {
    GameEvent gameEvent;

    public GameEventController(){
        gameEvent = new GameEvent();
    }
    public void startGame() {
       gameEvent.startGame();
    }

    public void endGame() {
        gameEvent.endGame();
    }

    public void scorePlayer(String playerName) {
       gameEvent.scorePlayer(playerName);
    }

    public void printar() {
        gameEvent.printar();
    }
}
