package br.ufc.quixada.petcare;

import br.ufc.quixada.petcare.model.*;

public class Main {
    public static void main(String[] args){
        Tutor tutor = new Tutor("joão", "12345678912");
        Pet pet = new Pet("toby", "cachorro", 15.0);
        tutor.adicionarPet(pet);
        ConsultaMedica servico = new ConsultaMedica("10/07/2026", "checar ferida na patinha", "pedro", "12345" );
        Atendimento atendimento = new Atendimento(tutor, pet, servico, "12:00");
        //atendimento.agendar("10/07/2026", "10:00");

        System.out.println(atendimento.gerarResumo());
        System.out.println();

        try {
            Atendimento atendimento1 = new Atendimento(tutor, pet, servico, "12:00");
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }

        atendimento.cancelar();
        System.out.println("atendimento cancelado");
        System.out.println();

        ProcedimentoEstetico estetico = new ProcedimentoEstetico("18/06/2026", "tosa basica", "tosa");
        Atendimento atendimento2 =  new Atendimento(tutor, pet, estetico, "11:00");
        //atendimento2.agendar("18/07/2026", "11:00");

        System.out.println(atendimento2.gerarResumo());
    }

}
