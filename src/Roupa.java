public abstract class Roupa implements Produto {

  private String nome;
  private double preco;
  private String marca;
  private String tamanho;
  private String cor;

  public Roupa(String _nome, String _marca, String _tamanho, String _cor) {
    this.nome = _nome;
    this.marca = _marca;
    this.tamanho = _tamanho;
    this.cor = _cor;
  }

  @Override
  public String getMarca() {
    return this.marca;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public double getPreco() {
    return this.preco;
  }

  @Override
  public void setPreco(double _preco) {
    this.preco = _preco;
  }

  public String getTamanho() {
    return this.tamanho;
  }

  public String getCor() {
    return this.cor;
  }
  
  public abstract double calcularPrecoFinal(double acrescimo);
}