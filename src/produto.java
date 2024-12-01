public class produto implements ProdutosParaVenda {
    private static int id;
    private static String nome;
    private float preco;
    private int quantidade;

    @Override
    public boolean VenderProduto() {
        return false;
    }

    @Override
    public int ReporEstoque(int quantidade) {
        return 0;
    }

    public int mostraProduto() {
        return 0;
    }
}
