package TratamentoExcecoes.ExcecoesPersonalizadas.exceptions;

/*
 * Exception - compilador obriga a trata
 * RunTimeException - não obriga a tratar o erro
 */
public class DomainException extends Exception {
  private static final long serialVersionUID = 1L;

  public DomainException(String message) {
    super(message);
  }
}
