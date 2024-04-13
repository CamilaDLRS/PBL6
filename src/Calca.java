public class Calca extends Roupa {

  private String tipo;

  public Calca(String _nome, String _marca, String _tamanho, String _cor, String _tipo) {
    super(_nome, _marca, _tamanho, _cor);
    this.tipo = _tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  @Override
  public double calcularPrecoFinal(double acrescimo) {
    double desconto = (this.getPreco() * 0.15);

    return this.getPreco() - desconto + acrescimo;
  }
}