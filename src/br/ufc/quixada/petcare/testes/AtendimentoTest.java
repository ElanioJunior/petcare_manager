package br.ufc.quixada.petcare.testes;

import br.ufc.quixada.petcare.exception.HorarioInvalidoException;
import br.ufc.quixada.petcare.exception.HorarioOcupadoException;
import br.ufc.quixada.petcare.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ufc.quixada.petcare.exception.ValidacaoException;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class AtendimentoTest {

    @BeforeEach
    void limparHorarios() throws Exception{
        Field field = Atendimento.class.getDeclaredField("horariosOcupados");
        field.setAccessible(true);
        ((java.util.List<?>) field.get(null)).clear();
    }

    @Test
    void AtendimentoDadosValidos(){
        Tutor tutor = new Tutor("fernando", "12345678912");
        Pet pet = new Pet("toby", "cachorro", 10.0);
        ProcedimentoEstetico servico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");

        Atendimento atendimento =  new Atendimento(tutor, pet, servico, "19:30");
        assertEquals("19:30", atendimento.getHorario());
    }

    @Test
    void HorarioNuloException(){
        assertThrows(HorarioInvalidoException.class, () -> {
            Tutor tutor = new Tutor("fernando", "12345678912");
            Pet pet = new Pet("toby", "cachorro", 10.0);
            ProcedimentoEstetico servico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");

            Atendimento atendimento =  new Atendimento(tutor, pet, servico, null);
        });
    }

    @Test
    void HorarioFormatoErradoException(){
        assertThrows(HorarioInvalidoException.class, () -> {
            Tutor tutor = new Tutor("fernando", "12345678912");
            Pet pet = new Pet("toby", "cachorro", 10.0);
            ProcedimentoEstetico servico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");

            Atendimento atendimento =  new Atendimento(tutor, pet, servico, "abc");
        });
    }

    @Test
    void HorarioOcupadoException(){
        Tutor tutor = new Tutor("fernando", "12345678912");
        Pet pet = new Pet("toby", "cachorro", 10.0);
        ProcedimentoEstetico servico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");

        assertThrows(HorarioOcupadoException.class, () -> {
            Atendimento atendimento1 =  new Atendimento(tutor, pet, servico, "19:30");
            Atendimento atendimento2 =  new Atendimento(tutor, pet, servico, "19:30");
        });
    }
}
