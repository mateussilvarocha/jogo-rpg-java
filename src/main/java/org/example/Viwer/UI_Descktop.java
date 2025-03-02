package org.example.Viwer;
import javax.swing.*;
import java.awt.event.ActionListener;

public class UI_Descktop {
    JFrame frame;
    JPanel panel;
    public UI_Descktop() {
        // Cria a janela
        frame = new JFrame("Minha Janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento ao fechar
        frame.setSize(400, 300); // Define o tamanho da janela

        // Cria um botão
        JButton button = new JButton("Clique Aqui");

        // Adiciona uma ação ao botão
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Botão clicado!"));

        // Adiciona o botão à janela
        frame.getContentPane().add(button);

    }
    public void preBotton(){
    // Ação para os botões
        ActionListener actionListener = e -> JOptionPane.showMessageDialog(frame, "Botão clicado!");

        // Criando diferentes botões usando o ButtonFactory
        JButton button1 = ButtonFactory.createButton("Botão Simples", actionListener);
        JButton button2 = ButtonFactory.createButtonWithIcon("Botão com Ícone", "path/to/icon.png", actionListener);
        JButton button3 = ButtonFactory.createButtonWithColor("Botão Colorido", actionListener, "#FF5733");

        // Painel para adicionar os botões

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

    }
    public void panel(){
        panel = new JPanel();
        frame.getContentPane().add(panel);
    }
    public void run(){
        panel();
        preBotton();
        // Tornar a janela visível
        frame.setVisible(true);

    }
}

class ButtonFactory {

    // Método para criar um botão com o texto fornecido
    public static JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com ícone
    public static JButton createButtonWithIcon(String text, String iconPath, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setIcon(new ImageIcon(iconPath));
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com texto e cor personalizada
    public static JButton createButtonWithColor(String text, ActionListener actionListener, String colorHex) {
        JButton button = new JButton(text);
        button.setBackground(java.awt.Color.decode(colorHex)); // Define a cor do fundo
        button.addActionListener(actionListener);
        return button;
    }
}
class LabelFactory {

    // Método para criar um botão com o texto fornecido
    public static JButton createLabel(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com ícone
    public static JButton createLabelWithIcon(String text, String iconPath, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setIcon(new ImageIcon(iconPath));
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com texto e cor personalizada
    public static JButton createLabelWithColor(String text, ActionListener actionListener, String colorHex) {
        JButton button = new JButton(text);
        button.setBackground(java.awt.Color.decode(colorHex)); // Define a cor do fundo
        button.addActionListener(actionListener);
        return button;
    }
}
class PanelFactory {

    // Método para criar um botão com o texto fornecido
    public static JButton createPanel(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com ícone
    public static JButton createPanelWithIcon(String text, String iconPath, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setIcon(new ImageIcon(iconPath));
        button.addActionListener(actionListener);
        return button;
    }

    // Método para criar um botão com texto e cor personalizada
    public static JButton createPanelWithColor(String text, ActionListener actionListener, String colorHex) {
        JButton button = new JButton(text);
        button.setBackground(java.awt.Color.decode(colorHex)); // Define a cor do fundo
        button.addActionListener(actionListener);
        return button;
    }
}



