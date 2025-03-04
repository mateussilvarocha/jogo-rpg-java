package org.example.Controller;
import org.example.Model.Inimigo;
import org.example.Model.JogoModel;

public class JogoController {
    private PlayerController player;
    private InimigoController inimigo;
    private JogoModel jogo;

    public JogoController(){
        jogo = new JogoModel(player, inimigo);
    }
    public void criarPlayer(String nome){
        jogo.criarPlayer(nome);
    }
}
