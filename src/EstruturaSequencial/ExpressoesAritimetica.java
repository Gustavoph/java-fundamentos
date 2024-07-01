package EstruturaSequencial;

public class ExpressoesAritimetica {
  public static void main(String[] args) {
    int adicao = 1 + 1;
    int subtracao = 2 - 1;
    int multiplicacao = 2 * 2;
    int divisao = 10 / 5;
    int modulo = 14 % 3;

    // O que está dentro de parênteses tem prioridade
    int precedenciaExplicita = (10 + 10) - 10;

    /*
      A soma e subtração tem menor precedencia perante as
      demais operações, sendo assim, a multiplicação é executada
      antes da soma, resultando em -10 * 10 = -100 + 10 = -90
    */
    int precedenciaInplicita = 10 - 10 * 10;

    System.out.println(precedenciaInplicita);
  }
}
