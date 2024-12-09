import java.util.ArrayList;

public class maqVendas {
    private ArrayList<String> produtos = new ArrayList<String>();
    private ArrayList<String> produtosVendaveis = new ArrayList<String>();


    public ArrayList<String> getProdutosVendaveis() {
        System.out.println(produtosVendaveis);
        return produtosVendaveis;

    }

    public void setProdutosVendaveis() {
        produtosVendaveis.add("Água com gás");
        produtosVendaveis.add("Água sem gás");
        produtosVendaveis.add("Snacks");
    }

    public void adicionaProduto(produto){

    }

    public boolean vendeProduto(produto){

    }

    public void mostrarProdutosNaMaquina(){

    }

    public void mostrarProdutosEmFalta(){

    }
}



