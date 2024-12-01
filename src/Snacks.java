public class Snacks extends produto {
    private int peso;

    @Override
    public boolean VenderProduto() {
        return false;
    }

    @Override
    public int ReporEstoque(int quantidade) {
        return 0;
    }
}
