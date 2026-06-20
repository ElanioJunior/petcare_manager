package br.ufc.quixada.petcare.interfaces;

public interface Agendavel {
    boolean agendar(String data, String hora);
    boolean cancelar();

}
