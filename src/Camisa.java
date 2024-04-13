public class Camisa extends Roupa {

  private String tipoManga;

  public Camisa(String _nome, String _marca, String _tamanho, String _cor, String _tipoManga) {
    super(_nome, _marca, _tamanho, _cor);
    this.tipoManga = _tipoManga;
  }

  public String getTipoManga() {
    return this.tipoManga;
  }

  @Override
  public double calcularPrecoFinal(double acrescimo) {
    double desconto = (this.getPreco() * 0.1);

    return this.getPreco() - desconto + acrescimo;
  }
}