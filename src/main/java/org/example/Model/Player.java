package org.example.Model;

public class Player {
    private String nome;
    private int _health;
    private int dano;

    // Construtor
    public Player(String nome) {
        this.nome = setNome(nome);
        this._health = setVida(100);
        this.dano = setDano(5);
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    // Getter e Setter para vida (já existe uma lógica personalizada no setter)
    public int getVida() {
        return _health;
    }

    public int setVida(int vida) {
        this._health = vida < 0 ? 0 : vida;
        return vida;
    }

    // Getter e Setter para dano
    public int getDano() {
        return dano;
    }

    public int setDano(int dano) {
        this.dano = dano;
        return dano;
    }



    // Método para receber dano
    public void receberDano(int danoInimigo) {
        setVida(getVida() - danoInimigo); // Atualizando a vida com o método setter
    }
}
