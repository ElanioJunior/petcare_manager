package br.ufc.quixada.petcare.testes;

import br.ufc.quixada.petcare.exception.CPFInvalidoException;
import br.ufc.quixada.petcare.model.Pet;
import br.ufc.quixada.petcare.model.Tutor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.ufc.quixada.petcare.exception.ValidacaoException;

public class TutorTest {

    @Test
    void tutorDadosValidos(){
        Tutor tutor = new Tutor("fernando", "12345678912");
        assertEquals("fernando", tutor.getNome());
        assertEquals("12345678912", tutor.getCpf());
    }

    @Test
    void nomeInvalidoException(){
        assertThrows(ValidacaoException.class, () -> {
            Tutor tutor = new Tutor(null, "12345678912");
        });
    }

    @Test
    void cpfNuloException(){
        assertThrows(ValidacaoException.class, () -> {
            Tutor tutor = new Tutor("fernando", null);
        });
    }

    @Test
    void cpfTamanhoErradoException(){
        assertThrows(CPFInvalidoException.class, () -> {
            Tutor tutor = new Tutor("fernando", "123");
        });
    }

    @Test
    void adicionarPetTest(){
        Tutor tutor = new Tutor("fernando", "12345678912");
        Pet pet = new Pet("toby", "cachorro", 10.0);

        tutor.adicionarPet(pet);

        assertEquals(1, tutor.getPets().size());
    }


}
