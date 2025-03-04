package org.example.Controller;

import org.example.Model.GameEvent;

public class GameEventController {
    GameEvent gameEvent;

    public GameEventController(JogoController jogoController){
        gameEvent = new GameEvent(jogoController);
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
    public void criarPlayer(String nome){
        gameEvent.criarPlayer(nome);
    }
    public void batalhar(){
        gameEvent.batalhar();
    }
    public void iniciarBatalha(){
        gameEvent.iniciarBatalha();
    }
    public boolean confirmarFimJogo(){
        return gameEvent.confirmarFimJogo();
    }
    public void printar() {
        gameEvent.printar();
    }
}
