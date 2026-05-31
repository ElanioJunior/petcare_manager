package br.ufc.quixada.petcare.model;

public abstract class Servico {
    private String data;
    private String descricao;

    public Servico(String data, String descricao){
        this.data=data;
        this.descricao=descricao;
    }

}
