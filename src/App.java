public class App {
    public static void main(String[] args) throws Exception {

        Calca calca = new Calca("Calça de Shopping", "Looney Tonneys", "36", "Azul claro", "Jeans");
        calca.setPreco(129.90);
        double calcaValorFinal = calca.calcularPrecoFinal(15);

        System.out.printf("CALÇA \n Nome: %s \n Marca: %s \n Tamanho: %s \n Cor: %s \n Tipo: %s \n Valor Final: %.2f \n\n",
                calca.getNome(), calca.getMarca(), calca.getTamanho(), calca.getCor(), calca.getTipo(),
                calcaValorFinal);

        Vestido vestido = new Vestido("Miney verão", "Disney", "P", "Vemelho e Branco", "V");
        vestido.setPreco(88.90);
        double vestidoValorFinal = vestido.calcularPrecoFinal(0);

        System.out.printf(
                "VESTIDO \n Nome: %s \n Marca: %s \n Tamanho: %s \n Cor: %s \n Tipo Decote: %s \n Valor Final: %.2f \n\n",
                vestido.getNome(), vestido.getMarca(), vestido.getTamanho(), vestido.getCor(), vestido.getTipoDecote(),
                vestidoValorFinal);

        Camisa camisa = new Camisa("Agostinho Carrara", "Tabajara", "G", "Amarelo e Preto", "Longa");
        camisa.setPreco(70.50);
        double camisaValorFinal = camisa.calcularPrecoFinal(5);

        System.out.printf(
                "CAMISA \n Nome: %s \n Marca: %s \n Tamanho: %s \n Cor: %s \n Tipo Mnaga: %s \n Valor Final: %.2f \n\n",
                camisa.getNome(), camisa.getMarca(), camisa.getTamanho(), camisa.getCor(), camisa.getTipoManga(),
                camisaValorFinal);

    }
}