package br.ufc.quixada.petcare.model;

public abstract class Servico {
    private String data;
    private String descricao;

    public Servico(String data, String descricao){
        this.data=data;
        this.descricao=descricao;
    }

    public abstract double calcularValor();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
