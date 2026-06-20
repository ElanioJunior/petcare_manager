package br.ufc.quixada.petcare.model;


import br.ufc.quixada.petcare.exception.ValidacaoException;

public class Pet {

    private String nome;
    private String especie;
    private double peso;

    public Pet(String nome, String especie, double peso){
        if (nome == null || nome.isBlank()){
            throw new ValidacaoException("nome invalido");
        }
        if (especie == null || especie.isBlank()){
            throw new ValidacaoException("especie invalido");
        }
        if (peso<=0){
            throw new ValidacaoException("peso invalido");
        }

        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    public String getNome() {

        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

}
