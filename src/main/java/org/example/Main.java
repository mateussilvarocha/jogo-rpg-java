package org.example;
import org.example.Viwer.UI_Descktop;
import org.example.Viwer.TelaInicio;

//Model (Modelo) → Responsável pelos dados e regras de negócio.
//View (Visão) → Interface gráfica que exibe as informações ao usuário.
//Controller (Controlador) → Gerencia as interações entre a View e o Model.

public class Main {
    public static void main(String[] args) {
        UI_Descktop ui= new UI_Descktop();
        ui.run(new TelaInicio());
    }
}