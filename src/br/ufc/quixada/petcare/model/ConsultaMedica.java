package br.ufc.quixada.petcare.model;

import br.ufc.quixada.petcare.exception.CampoObrigatorioException;

public class ConsultaMedica extends Servico{
    private String nomeVeterinario;
    private String crmv;

    public ConsultaMedica(String data, String descricao, String nomeVeterinario, String crmv){
        super(data, descricao);

        if (nomeVeterinario == null || nomeVeterinario.isBlank()) {
            throw new CampoObrigatorioException("nomeVeterinario");
        }
        if (crmv==null || crmv.isBlank()) {
            throw new CampoObrigatorioException("crmv");
        }
        this.nomeVeterinario = nomeVeterinario;
        this.crmv = crmv;
    }

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    @Override
    public double calcularValor() {
        return 150.0;
    }
}
