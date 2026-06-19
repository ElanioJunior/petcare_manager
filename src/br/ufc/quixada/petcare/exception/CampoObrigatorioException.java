package br.ufc.quixada.petcare.exception;

public class CampoObrigatorioException extends RuntimeException {
  public CampoObrigatorioException(String message) {
    super(message);
  }
}
