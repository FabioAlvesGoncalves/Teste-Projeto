public abstract class Produto implements ProdutosParaVenda {
    private  int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade){
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    }

    @Override
    public boolean venderProduto() {
        if (quantidade > 0){
            quantidade--;
            return true;
        }
        return false;
    }

    @Override
    public void reporEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public String mostraProduto() {


        return "";
    }
}
