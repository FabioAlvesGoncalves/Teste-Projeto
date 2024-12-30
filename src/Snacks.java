public class Snacks extends Produto {
    private int peso;

    public Snacks(int id, String nome, double preco, int quantidade, int peso) {
        super(id, nome, preco, quantidade);
    }
    //override e necessario para mostrar o peso do snack
    @Override
    public String mostrarProduto(){
        return super.mostrarProduto() + " Peso: " + peso + "g";
    }
}
