package br.ufc.quixada.petcare.exception;

public class CampoObrigatorioException extends RuntimeException {
    public CampoObrigatorioException(String campo) {
        super("Campo obrigatorio não preenchido: " + campo);
    }
}
