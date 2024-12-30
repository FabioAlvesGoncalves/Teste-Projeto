import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        maqVendas maquina = new maqVendas(); //criaçao da maquina de vendas
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha a opção desejada");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Vender Produto");
            System.out.println("3 - Mostrar Stock da Maquina");
            System.out.println("4 - Mostrar Stock não existente");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    System.out.println("Indique o tipo de produto desejado (1 - Agua, 2- Snacks)");
                    int tipo = scanner.nextInt();
                    System.out.println("Insira, individualmente, o ID, Nome, Preço e Quantidade, por esta ordem");
                    int id = scanner.nextInt();
                    String nome = scanner.next();
                    double preco = scanner.nextDouble();
                    int quantidade = scanner.nextInt();

                    if (tipo == 1){
                        System.out.println("Indique o tipo de agua (com gas/sem gas)");
                        String tipoAgua = scanner.next();
                        maquina.adicionarProduto(new Agua(id,nome,preco,quantidade,tipoAgua));
                        }
                    else if (tipo == 2) {
                        System.out.println("Digite o peso do snack (gramas)");
                        int peso = scanner.nextInt();
                        maquina.adicionarProduto(new Snacks(id,nome,preco,quantidade,peso));
                    }
                    break;

                case 2:
                    System.out.println("Insira o ID do produto a vender");
                    int idVenda = scanner.nextInt();
                    if(maquina.vendeProduto(idVenda)){
                        System.out.println("Produto vendido com sucesso");
                    }
                    else{
                        System.out.println("Produto nao existente ou sem stock");
                    }
                    break;

                case 3:
                    System.out.println(maquina.mostrarProdutosNaMaquina());
                    break;

                case 4:
                    System.out.println(maquina.mostrarProdutosEmFalta());
                    break;

                case 5:
                    System.out.println("A sair do programa...");
                    return;

                default:
                    System.out.println("Opçao invalida");
            }
        }


    }
}