public class Vestido extends Roupa {

  private String tipoDecote;

  public Vestido(String _nome, String _marca, String _tamanho, String _cor, String _tipoDecote) {
    super(_nome, _marca, _tamanho, _cor);
    this.tipoDecote = _tipoDecote;
  }

  public String getTipoDecote() {
    return this.tipoDecote;
  }

  @Override
  public double calcularPrecoFinal(double acrescimo) {
    double desconto = (this.getPreco() * 0.2);

    return this.getPreco() - desconto + acrescimo;
  }
}