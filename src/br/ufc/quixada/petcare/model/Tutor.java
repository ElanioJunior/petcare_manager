package br.ufc.quixada.petcare.model;

import br.ufc.quixada.petcare.exception.CPFInvalidoException;
import br.ufc.quixada.petcare.exception.ValidacaoException;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String nome;
    private String cpf;
    private List<Pet> pets;

    public Tutor(String nome, String cpf){
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            throw new CPFInvalidoException("CPF invalido");
        }
        if (nome == null || nome.isBlank()){
            throw new ValidacaoException("nome invalido");
        }
        this.pets = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarPet(Pet pet){
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
