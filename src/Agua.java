public class Agua extends produto {
    private String tipoAgua;

    @Override
    public boolean VenderProduto() {
        return false;
    }

    @Override
    public int ReporEstoque(int quantidade) {
        return 0;
    }
}





