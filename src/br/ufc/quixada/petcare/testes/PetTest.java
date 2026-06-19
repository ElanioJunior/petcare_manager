package br.ufc.quixada.petcare.testes;

import br.ufc.quixada.petcare.model.Pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ufc.quixada.petcare.exception.ValidacaoException;

public class PetTest {

    @Test
    void petDadosValidos(){
        Pet pet = new Pet("toby", "cachorro", 50);
        assertEquals("toby", pet.getNome());
        assertEquals("cachorro", pet.getEspecie());
        assertEquals(50.0, pet.getPeso());
    }

    @Test
    void nomeNuloException(){
        assertThrows(ValidacaoException.class, () -> {
            Pet pet = new Pet(null, "cachorro", 10.0);
        });
    }

    @Test
    void especieNulaException(){
        assertThrows(ValidacaoException.class, () -> {
            Pet pet = new Pet("toby", null, 15.0);
        });
    }

    @Test
    void pesoZeroException(){
        assertThrows(ValidacaoException.class, () -> {
            Pet pet = new Pet("toby", "cachorro", 0);
        });
    }

    @Test
    void pesoNegativoException(){
        assertThrows(ValidacaoException.class, () -> {
            Pet pet = new Pet("toby", "cachorro", -1);
        });
    }
}
