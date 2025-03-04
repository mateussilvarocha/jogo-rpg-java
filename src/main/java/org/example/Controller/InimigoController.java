package org.example.Controller;
import org.example.Model.Inimigo;

public class InimigoController implements InimigoInterface{
    private String nome;
    private int vida;
    private int dano;
    private Inimigo inimigo;

    public InimigoController(String nome, int vida, int dano, Inimigo inimigo){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.inimigo = inimigo;
    }

    @Override
    public void receberDano(int danoInimigo){
        this.vida -= danoInimigo;
    }
    @Override
    public int getDano(){
        return this.dano;
    }
    @Override
    public int getVida(){
        return this.vida;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
}

interface InimigoInterface{

    void receberDano(int danoInimigo);
    int getDano();
    int getVida();
    String getNome();

}
