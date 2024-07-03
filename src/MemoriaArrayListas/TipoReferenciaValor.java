package MemoriaArrayListas;

public class Produto {}

public class TipoReferenciaValor {
    public static void main(String[] args) {
        /*
        * Variáveis de tipo referencia (CLASSES)
        * - São variáveis que armazem referencias de seus objetos
        * comumente utilizado em classes, uma vez que classes instanciadas
        * geram objetos
        * - Usufrui de todos os recursos de poo
        * - São instanciados no HEAP da memória
        * - Objetos não utilizados são desalocados em um momento proximo
        * pelo garbage collector
        *
        * Variáveis do tipo valor (PRIMITIVO)
        * - São variáveis que armazem o valor da variável e não uma referencia
        * para o valor
        * - são mais simples e performaticos
        * - São instânciados no STACK da memória
        * - São desalocados imediatamente quando seu escopo de execuçã
        * for finalizado
        * */

       Produto p = new Produto(); // tipo referencia
       int idade = 22; // tipo valor
    }
}
