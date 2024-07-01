package EstruturaSequencial;

public class Casting {
  public static void main(String[] args) {
    int a, b, d;
    double resultado, c;

    a = 10;
    b = 2;

    // Você precisa avisar que você quer o retorno como double
    // Pois ao dividir numeros inteiros, o compilador entende que vc quer
    // outro numero inteiro.
    resultado = (double) a / b;

    System.out.println(resultado);

    c = 5.5;

    // Quando vc atribui um double a uma variavel int
    // vc pode acabar perdendo valores, para que o compilador
    // entenda que você não se importa, é necessário fazer o casting
    // para int
    d = (int) c;

    System.out.println(d);
  }
}
