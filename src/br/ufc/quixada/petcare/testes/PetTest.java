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
}
