package org.example;
import org.example.Viwer.UI_Descktop;
import org.example.Viwer.TelaInicio;
import org.example.Viwer.UI_Terminal;

//Model (Modelo) → Responsável pelos dados e regras de negócio.
//View (Visão) → Interface gráfica que exibe as informações ao usuário.
//Controller (Controlador) → Gerencia as interações entre a View e o Model.

public class Main {
    public static void main(String[] args) {
        UI_Terminal ui = new UI_Terminal();
        ui.run();
//        UI_Descktop ui= new UI_Descktop();
//        ui.run(new TelaInicio());
    }
}