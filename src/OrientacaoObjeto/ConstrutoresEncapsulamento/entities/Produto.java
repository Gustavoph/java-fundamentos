package OrientacaoObjeto.ConstrutoresEncapsulamento.entities;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto() {}

  public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double valorTotalEmEstoque() {
    return preco * quantidade;
  }

  public void adicionarProdutos(int quantidade) {
    this.quantidade += quantidade;
  }

  public void removerProdutos(int quantidade) {
    this.quantidade -= quantidade;
  }

  @Override
  public String toString() {
    return "Nome: "
          + this.nome
          + ", preço: $"
          + String.format("%.2f", this.preco)
          + ", unidades: "
          + this.quantidade
          + ", Total: $"
          + String.format("%.2f", this.valorTotalEmEstoque());
  }
}
