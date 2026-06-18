package br.ufc.quixada.petcare.model;

import java.util.ArrayList;

public class Pet {
    private String nome;
    private String especie;
    private double peso;

    public Pet(String nome, String especie, double peso){
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
