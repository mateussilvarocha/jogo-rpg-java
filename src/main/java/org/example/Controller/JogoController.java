package org.example.Controller;
import org.example.Model.Inimigo;

public class JogoController {
    private PlayerController player;
    private InimigoController inimigo;

    public JogoController(){
    }
    public void criarPlayer(String nome){
        player = new PlayerController(nome);
    }
    public void criarInimigo(String nome, int dano, int vida){
        inimigo = new InimigoController(nome, dano, vida, new Inimigo());
    }
    public void balanceadorInimigo(){
        String nome = "Inimigo";
        int vida = 20 ;
        int dano = 5;
        this.criarInimigo(nome, vida, dano);
    }
    public void zerarInimigo(){
        inimigo = null;
    }
    public void zerarPlayer(){
        player = null;
    }
    public void iniciarBatalha(){
        balanceadorInimigo();
    }
    public void batalhar(){
        if (player == null || inimigo == null) {
            System.out.println("O jogo ainda não está pronto. Certifique-se de criar o jogador e o inimigo antes da batalha.");
            return;
        }
        while(player.getVida() > 0 && inimigo.getVida() > 0){
            inimigo.receberDano(player.getDano());
            System.out.println(inimigo.getNome() + " recebeu " + player.getDano() + " de dano. Vida restante: " + inimigo.getVida());

            if(inimigo.getVida() > 0) {
                player.receberDano(inimigo.getDano());
                System.out.println(player.getNome() + " recebeu " + inimigo.getDano() + " de dano. Vida restante: " + player.getVida());
            }
        }
        if(inimigo.getVida()<=0){
            System.out.println("O player venceu");
            zerarInimigo();
            iniciarBatalha();
        }else {
            System.out.println("O inimigo venceu. Fim de Jogo!");
            zerarPlayer();
        }
    }
    public boolean confirmarFimJogo(){
        return player != null;
    }
}
