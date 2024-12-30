import java.util.ArrayList;
import java.util.List;


public class maqVendas {
    private List<Produto> produtos = new ArrayList<>();
    private List<String> produtosVendaveis = List.of("Agua com Gas", "Agua sem Gas", "Snacks");

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public String mostrarProdutosNaMaquina() {
        String resultado = "Produtos na Maquina: \n";
        for(Produto produto : produtos) {
            resultado += produto.mostrarProduto() + "\n";
        }
        return resultado;
    }
    public String mostrarProdutosEmFalta() {
        String resultado = "Produtos em Falta: \n";
        for (String produtoVendavel : produtosVendaveis) {
            boolean encontrado = false;
            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(produtoVendavel)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                resultado += produtoVendavel + "\n";
            }
        }
        return resultado;
    }



public boolean vendeProduto(int id) { //ID utilizado para a venda do item
    for(Produto produto : produtos){
        if (produto.getId() == id && produto.venderProduto()) {
            return true; //venda realizada com sucesso
        }
    }
    return false; //id nao encontrado ou sem stock
}
}



