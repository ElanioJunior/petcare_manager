package br.ufc.quixada.petcare.testes;

import br.ufc.quixada.petcare.model.ProcedimentoEstetico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ufc.quixada.petcare.exception.ValidacaoException;

public class ProcedimentoEsteticoTest {

    @Test
    void ProcedimentoEsteticoDadosValidos(){
        ProcedimentoEstetico procedimentoEstetico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");
        assertEquals("20/06/2026", procedimentoEstetico.getData());
        assertEquals("serviço basico, cliente regula a tosa a cada 3 semanas", procedimentoEstetico.getDescricao());
        assertEquals("tosa", procedimentoEstetico.getTipoServico());
    }

    @Test
    void DataInvalidaException(){
        assertThrows(ValidacaoException.class, () -> {
            ProcedimentoEstetico procedimentoEstetico = new ProcedimentoEstetico(null, "serviço basico, cliente regula a tosa a cada 3 semanas", "tosa");

        });
    }

    @Test
    void DescricaoInvalidaException(){
        assertThrows(ValidacaoException.class, () -> {
            ProcedimentoEstetico procedimentoEstetico = new ProcedimentoEstetico("20/06/2026", null, "tosa");

        });
    }

    @Test
    void TipoServicoInvalidoException(){
        assertThrows(ValidacaoException.class, () -> {
            ProcedimentoEstetico procedimentoEstetico = new ProcedimentoEstetico("20/06/2026", "serviço basico, cliente regula a tosa a cada 3 semanas", null);

        });
    }

}
