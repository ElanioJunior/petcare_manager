package br.ufc.quixada.petcare.testes;

import br.ufc.quixada.petcare.model.Pet;
import br.ufc.quixada.petcare.model.Servico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ufc.quixada.petcare.exception.ValidacaoException;
import br.ufc.quixada.petcare.model.ConsultaMedica;

public class ConsultaMedicaTest {
    @Test
    void ConsultaMedicaDadosValidos(){
        ConsultaMedica consultaMedica = new ConsultaMedica("20/06/2026", "consulta basica", "paulo", "12345");
        assertEquals("20/06/2026", consultaMedica.getData());
        assertEquals("consulta basica", consultaMedica.getDescricao());
        assertEquals("paulo", consultaMedica.getNomeVeterinario());
        assertEquals("12345", consultaMedica.getCrmv());
    }

    @Test
    void DataInvalidaException(){
        assertThrows(ValidacaoException.class, () -> {
            ConsultaMedica consultaMedica = new ConsultaMedica(null, "consulta basica", "paulo", "12345");
            ConsultaMedica consultaMedica = new ConsultaMedica("", "consulta basica", "paulo", "12345");
            ConsultaMedica consultaMedica = new ConsultaMedica("    ", "consulta basica", "paulo", "12345");


        })
    }


}
