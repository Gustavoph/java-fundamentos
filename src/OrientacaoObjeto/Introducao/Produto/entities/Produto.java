package OrientacaoObjeto.Introducao.Produto.entities;

public class Produto {
  public String nome;
  public double preco;
  public int quantidade;

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
