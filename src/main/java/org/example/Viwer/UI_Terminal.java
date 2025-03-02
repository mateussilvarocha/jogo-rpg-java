package org.example.Viwer;
import org.example.Controller.JogoController;
import java.util.Scanner;

public class UI_Terminal {
    Scanner scanner = new Scanner(System.in);
    JogoController jogo = new JogoController();
    public void criarPlayer(){
        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        jogo.criarPlayer(nomeJogador);
    }

    public void batalhar() {
    System.out.println("\nGerando inimigo...");
    jogo.iniciarBatalha();

    System.out.println("\nBatalha iniciando!");
    jogo.batalhar();
    }
    public void fimJogo(){

        scanner.close();
    }
    public void run(){
        criarPlayer();
        while (jogo.confirmarFimJogo()) { // Verifica após cada batalha
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
