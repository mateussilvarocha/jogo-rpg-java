package org.example.Viwer;

import org.example.Controller.GameEventController;
import org.example.Controller.JogoController;

import javax.swing.*;

public class TelaInicio {
    private JPanel panel;
    JogoController jogo = new JogoController();
    GameEventController game = new GameEventController(jogo);


    public TelaInicio() {
        JButton button = new ButtonBuilder("Clique Aqui")
                .withIcon("icon.png")
                .withColor("#FF5733")
                .withActionListener( e ->game.printar())
                .build();

        JLabel label = new LabelBuilder("Texto de Exemplo")
                .withColor("#0000FF")
                .build();

        PanelDirector panelDirector = new PanelDirector();
        panel = panelDirector.createDefaultPanel(label, button);
    }

    public JPanel iniciar(){
        return panel;
    }
}
