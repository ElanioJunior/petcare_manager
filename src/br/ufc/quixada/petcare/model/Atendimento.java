package br.ufc.quixada.petcare.model;

import br.ufc.quixada.petcare.exception.HorarioInvalidoException;
import br.ufc.quixada.petcare.interfaces.Agendavel;

public class Atendimento implements Agendavel {
    private Tutor tutor;
    private Pet pet;
    private Servico servico;
    private String horario;

    public Atendimento(Tutor tutor, Pet pet, Servico servico, String horario){
        if (!horario.matches("\\d{2}:\\d{2}")){
            throw new HorarioInvalidoException("Horario invalido");
        }
        this.tutor = tutor;
        this.pet = pet;
        this.servico = servico;
        this.horario = horario;
    }

    @Override
    public boolean agendar(String data, String hora) {
        return true;
    }

    @Override
    public boolean cancelar() {
        return true;
    }

    public String gerarResumo(){
        return "Tutor: " + tutor.getNome() +
                "\nPet: " + pet.getNome() +
                "\nServiço: " + servico.getDescricao() +
                "\nValor: R$" + servico.calcularValor();
    }

    public String getHorario() {
        return horario;
    }

}
