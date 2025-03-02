package org.example.Controller;
import org.example.Model.Player;
//import org.example.Viwer.PlayerView;

public class PlayerController{

    private Player _player;
//    private PlayerView _view;

    public PlayerController(String nome){
        _player = new Player(nome);
//        _view = new PlayerView();
    }
//    public void MostrarStatus()
//    {
//        {} infoplayer = _view.InfoPlayer(_player);
//        return infoplayer;
//    }
    public void receberDano(int danoInimigo) {
       _player.receberDano(danoInimigo);
    }

    public int getDano() {
        return _player.getDano();
    }

    public int getVida() {
        return _player.getVida();
    }

    public String getNome() {
        return _player.getNome();
    }


}
