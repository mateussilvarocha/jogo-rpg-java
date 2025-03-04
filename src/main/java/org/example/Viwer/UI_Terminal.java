package org.example.Viwer;
import org.example.Controller.GameEventController;
import org.example.Controller.JogoController;
import java.util.Scanner;

public class UI_Terminal {
    Scanner scanner = new Scanner(System.in);
    JogoController jogo = new JogoController();
    GameEventController gameEvent = new GameEventController(jogo);

    public void criarPlayer(){
        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        gameEvent.criarPlayer(nomeJogador);
    }

    public void batalhar() {
    System.out.println("\nGerando inimigo...");
        gameEvent.iniciarBatalha();

    System.out.println("\nBatalha iniciando!");
        gameEvent.batalhar();
    }
    public void fimJogo(){

        scanner.close();
    }
    public void run(){
        criarPlayer();
        while (gameEvent.confirmarFimJogo()) { // Verifica após cada batalha
            System.out.println("\nDeseja continuar jogando? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                batalhar();
            } else {
                break;
            }
        }

        fimJogo();
    }

}
