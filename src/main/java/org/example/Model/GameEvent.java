package org.example.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe gerenciadora de eventos
class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public void adcionar(String tipoEvent, EventListener listener) {
        listeners.computeIfAbsent(tipoEvent, k -> new ArrayList<>()).add(listener);
    }

    public void remover(String tipoEvent, EventListener listener) {
        List<EventListener> users = listeners.get(tipoEvent);
        if (users != null) {
            users.remove(listener);
        }
    }

    public void notificar(String tipoEvent, String data) {
        List<EventListener> users = listeners.get(tipoEvent);
        if (users != null) {
            for (EventListener listener : users) {
                listener.update(data);
            }
        }
    }
}

// Classe principal que emite eventos
class Editor {
    public EventManager events;

    public Editor() {
        this.events = new EventManager();
    }
    //ações do jogador:

//    public void openFile(String path) {
//        this.file = new File(path);
//        events.notify("open", file.getName());
//    }
//
//    public void saveFile() {
//        if (file != null) {
//            // Simulando a gravação do arquivo
//            events.notify("save", file.getName());
//        }
//    }
}

// Interface para os ouvintes de eventos
interface EventListener {
    void update(String filename);
}


// Classe principal do jogo
public class GameEvent {
    public EventManager events;
    private String gameState;

    public GameEvent() {
        this.events = new EventManager();
    }

    public void startGame() {
        this.gameState = "started";
        events.notificar("start", "O jogo começou!");
    }

    public void endGame() {
        this.gameState = "ended";
        events.notificar("end", "O jogo terminou!");
    }
    public void printar(){
        System.out.println("Botão clicado!");
    }
    public void scorePlayer(String playerName) {
        events.notificar("score", playerName + " marcou um ponto!");
    }
}


// Ouvinte que exibe mensagens no console
class ConsoleListener implements EventListener {
    @Override
    public void update(String message) {
        System.out.println("[EVENTO]: " + message);
    }
}


// Ouvinte que simula o envio de notificações
class NotificationListener implements EventListener {
    private String playerName;

    public NotificationListener(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String message) {
        System.out.println("[NOTIFICAÇÃO] para " + playerName + ": " + message);
    }
}


//// Classe de aplicação para testar o jogo
//class GameApplication {
//    public static void main(String[] args) {
//        Game game = new Game();
//
//        ConsoleListener consoleLogger = new ConsoleListener();
//        game.events.adcionar("start", consoleLogger);
//        game.events.adcionar("end", consoleLogger);
//        game.events.subscribe("score", consoleLogger);
//
//        NotificationListener player1Notification = new NotificationListener("Jogador 1");
//        game.events.adcionar("score", player1Notification);
//
//        // Testando os eventos do jogo
//        game.startGame();
//        game.playerScored("Jogador 1");
//        game.endGame();
//    }
//}
