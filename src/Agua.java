public class Agua extends Produto {
    private String tipoAgua;

    public Agua(int id, String nome, double preco, int quantidade, String tipoAgua) {
        super(id, nome, preco, quantidade);
    }
    //override e necessario para mostrar o tipo da agua
    @Override
    public String mostrarProduto(){
        return super.mostrarProduto() + " Tipo: " + tipoAgua;
    }
}





