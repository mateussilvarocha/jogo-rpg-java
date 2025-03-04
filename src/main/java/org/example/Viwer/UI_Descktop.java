package org.example.Viwer;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class UI_Descktop {
    JFrame frame;


    public UI_Descktop() {
        // Cria a janela
        frame = new JFrame("Minha Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar
        frame.setSize(400, 300); // Define o tamanho da janela


    }
    public void telaInicio(TelaInicio telaInicio){
        JPanel panel = telaInicio.iniciar();
        frame.add(panel);
    }



    public void run(TelaInicio telaInicio){
        telaInicio(telaInicio);


        // Tornar a janela visível
        frame.setVisible(true);

    }
}


// Builder para JButton
class ButtonBuilder {
    private JButton button;

    public ButtonBuilder(String text) {
        button = new JButton(text);
    }

    public ButtonBuilder withIcon(String iconPath) {
        button.setIcon(new ImageIcon(iconPath));
        return this;
    }

    public ButtonBuilder withColor(String colorHex) {
        button.setBackground(Color.decode(colorHex));
        return this;
    }

    public ButtonBuilder withSize(int width, int height) {
        button.setPreferredSize(new Dimension(width, height));
        return this;
    }

    public ButtonBuilder withActionListener(ActionListener actionListener) {
        button.addActionListener(actionListener);
        return this;
    }

    public JButton build() {
        return button;
    }
}

// Diretor para ButtonBuilder
class ButtonDirector {
    public static JButton createDefaultButton(String text, ActionListener actionListener) {
        return new ButtonBuilder(text)
                .withColor("#DDDDDD")
                .withSize(100, 40)
                .withActionListener(actionListener)
                .build();
    }
}

// Builder para JLabel
class LabelBuilder {
    private JLabel label;

    public LabelBuilder(String text) {
        label = new JLabel(text);
    }

    public LabelBuilder withIcon(String iconPath) {
        label.setIcon(new ImageIcon(iconPath));
        return this;
    }

    public LabelBuilder withColor(String colorHex) {
        label.setForeground(Color.decode(colorHex));
        return this;
    }

    public LabelBuilder withSize(int width, int height) {
        label.setPreferredSize(new Dimension(width, height));
        return this;
    }

    public JLabel build() {
        return label;
    }
}

// Diretor para LabelBuilder
class LabelDirector {
    public static JLabel createDefaultLabel(String text) {
        return new LabelBuilder(text)
                .withColor("#000000")
                .withSize(100, 30)
                .build();
    }
}

// Builder para JPanel
class PanelBuilder {
    private JPanel panel;

    public PanelBuilder() {
        panel = new JPanel();
    }

    public PanelBuilder withLayout(LayoutManager layout) {
        panel.setLayout(layout);
        return this;
    }

    public PanelBuilder withBackgroundColor(String colorHex) {
        panel.setBackground(Color.decode(colorHex));
        return this;
    }

    public PanelBuilder withSize(int width, int height) {
        panel.setPreferredSize(new Dimension(width, height));
        return this;
    }

    public PanelBuilder addComponent(Component component) {
        panel.add(component);
        return this;
    }

    public JPanel build() {
        return panel;
    }
}

// Diretor para PanelBuilder
class PanelDirector {
    public static JPanel createDefaultPanel(Component... components) {
        PanelBuilder builder = new PanelBuilder()
                .withLayout(new FlowLayout())
                .withBackgroundColor("#FFFFFF")
                .withSize(300, 200);
        // Adiciona todos os componentes passados como argumento
        for (Component component : components) {
            builder.addComponent(component);
        }

        return builder.build();
    }
}







