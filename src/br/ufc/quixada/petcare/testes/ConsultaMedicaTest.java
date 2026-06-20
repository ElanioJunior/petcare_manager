package br.ufc.quixada.petcare.testes;

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
    void dataInvalidaException(){
        assertThrows(ValidacaoException.class, () -> {
            ConsultaMedica consultaMedica = new ConsultaMedica(null, "consulta basica", "paulo", "12345");
        });
    }

    @Test
    void descricaoInvalidaException(){
        assertThrows(ValidacaoException.class, () -> {
            ConsultaMedica consultaMedica = new ConsultaMedica("20/06/2026", null, "paulo", "12345");
        });
    }

    @Test
    void nomeVeterinarioInvalidoException(){
        assertThrows(ValidacaoException.class, () -> {
            ConsultaMedica consultaMedica = new ConsultaMedica("20/06/2026", "consulta basica", null, "12345");
        });
    }

    @Test
    void crmvInvalidoException(){
        assertThrows(ValidacaoException.class, () -> {
            ConsultaMedica consultaMedica = new ConsultaMedica("20/06/2026", "consulta basica", "paulo", null);
        });
    }


}
