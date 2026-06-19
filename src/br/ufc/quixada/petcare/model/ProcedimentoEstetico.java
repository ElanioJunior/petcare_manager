package br.ufc.quixada.petcare.model;
import br.ufc.quixada.petcare.exception.CampoObrigatorioException;

class ProcedimentoEstetico extends Servico{
    private String tipoServico;

    public ProcedimentoEstetico(String data, String descricao, String tipoServico){
        super(data, descricao);
        if (tipoServico.isEmpty()){
            throw new CampoObrigatorioException("tipoServico");
        }
        this.tipoServico = tipoServico;
    }

    @Override
    public double calcularValor(){
        return 80.0;
    }

    public String getTipoServico() {
        return tipoServico;
    }

}
