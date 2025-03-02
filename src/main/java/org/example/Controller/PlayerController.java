package org.example.Controller;

class PlayerController implements PlayerInterface{

    private String nome;
    private int vida;
    private int dano;

    public PlayerController(String nome){
        this.nome = nome;
        this.vida = 100;
        this.dano = 5;
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
interface PlayerInterface{

    void receberDano(int danoInimigo);
    int getDano();
    int getVida();
    String getNome();

}
