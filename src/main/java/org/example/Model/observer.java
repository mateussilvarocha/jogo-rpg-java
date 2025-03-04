package org.example.Model;

import java.util.*;

// Interface do Observer (Observador)
interface Observador {
    void combate();
    void cura();
    void tesouro();
    void armadilha();

}

// Classe Observável (Subject)
class Notificador {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void notificarObservadores(String evento) {
        for (Observador obs : observadores) {
            switch (evento) {
                case "combate" ->obs.combate();
                case "cura" -> obs.cura();
                case "tesouro" -> obs.tesouro();
                case "armadilha" -> obs.armadilha();
            }
        }
    }
}

// Classe concreta que implementa Observer
class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
    @Override
    public void combate(){
        System.out.println(nome + " está lutando contra um inimigo! ⚔️");
    }
    @Override
    public void tesouro() {
        System.out.println(nome + " encontrou um baú de ouro! 💰");
    }
    @Override
    public void cura(){
        System.out.println(nome + " usou uma poção e recuperou a vida! 🩹");
    }
    public void armadilha(){
        System.out.println(nome + " caiu em uma armadilha e perdeu vida! ☠️");
    }



}

// Sistema de eventos com um mapa de ações
public class SistemaEventos {
    private Map<String, Runnable> eventos;
    private Notificador notificador;

    public SistemaEventos(Notificador notificador) {
        this.notificador = notificador;
        eventos = new HashMap<>();

        // Adicionando eventos ao mapa
        eventos.put("combate", () -> notificador.notificarObservadores("combate"));
        eventos.put("cura", () -> notificador.notificarObservadores("cura"));
        eventos.put("tesouro", () -> notificador.notificarObservadores("tesouro"));
        eventos.put("armadilha", () -> notificador.notificarObservadores("armadilha"));
    }

    // Método para acionar um evento pelo nome
    public void acionarEvento(String nome) {
        Runnable evento = eventos.get(nome);
        if (evento != null) {
            evento.run();
        } else {
            System.out.println("🚫 Evento desconhecido: " + nome);
        }
    }

    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        SistemaEventos sistema = new SistemaEventos(notificador);

        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");

        notificador.adicionarObservador(usuario1);
        notificador.adicionarObservador(usuario2);

        // Testando eventos
        sistema.acionarEvento("combate");
        sistema.acionarEvento("cura");
        sistema.acionarEvento("tesouro");
        sistema.acionarEvento("armadilha");
        sistema.acionarEvento("evento_inexistente"); // Caso de evento não encontrado

        // Removendo um usuário e testando novamente
        notificador.removerObservador(usuario1);
        sistema.acionarEvento("combate");
    }
}
