
// Importa a classe Scanner para ler entrada do usuário.
import java.util.Scanner;

// Importa as classes Cliente e Produto do pacote de domínio.
import java_atividades._03_Gerenciar_Pedidos.Dominio.Cliente;
import java_atividades._03_Gerenciar_Pedidos.Dominio.Produto;

// Classe principal para simular um processo de compra.
public class PedidosTeste {

    // Método principal que inicia a execução do programa.
    public static void main(String[] args) {

        // Cria um objeto Scanner para coletar entradas do usuário.
        Scanner ler = new Scanner(System.in);
        // Variáveis para controlar quantidade de produtos e unidades compradas.
        int quantidade;
        int unidades;

        // Cria um cliente e alguns produtos pré-cadastrados.
        Cliente cliente = new Cliente();
        Produto produto1 = new Produto("Tixam", 15, 82);
        Produto produto2 = new Produto("Nescau", 7, 75);
        Produto produto3 = new Produto("café", 30, 89);
        Produto[] produtos = { produto1, produto2, produto3 };

        // Exibe a mensagem inicial do sistema.
        System.out.println("Seja bem vindo(a) ao Mini Mercado");

        // Solicita os dados do cliente.
        cliente.initCliente();

        // Pergunta quantos tipos de produtos o cliente deseja comprar.
        System.out.println("Por favor informe quantos tipo de produtos deseja comprar !");
        quantidade = ler.nextInt();

        // Cria vetores para armazenar os produtos escolhidos e seus valores.
        String[] carrinho = new String[quantidade];
        float[] valor = new float[quantidade];

        // Loop para controlar a seleção de produtos.
        int opicao = 0;
        for (int i = 0; i < quantidade; i++) {
            do {
                System.out.println("==============================");
                System.out.println("Selecione o produto desejado: ");
                for (int x = 0; x < produtos.length; x++) {
                    System.out.println("[" + (x + 1) + "]" + produtos[x].getNome() + " " + produtos[x].getValor() + " "
                            + produtos[x].getQuantidade());
                }
                System.out.println("[4] Finalizar compra");

                opicao = ler.nextInt();

                // Trata a opção escolhida pelo usuário.
                switch (opicao) {
                    case 1:
                        if (produto1.getQuantidade() == 0) {
                            System.out.println("PRODUTO INDISPONIVEL");
                            i--;
                        } else {
                            System.out.println("Quantos unidades deste produto deseja comprar ?");
                            unidades = ler.nextInt();

                            if (unidades > produto1.getQuantidade()) {
                                System.out.println("QUANTIDADE INDISPONIVEL");
                                i--;
                            } else {
                                System.out.println("Produto adicionado ao carrinho");
                                carrinho[i] = produto1.getNome();
                                valor[i] = unidades * produto1.getValor();
                                produto1.diminuirQuantidade(unidades);
                            }
                        }
                        break;

                    case 2:
                        if (produto2.getQuantidade() == 0) {
                            System.out.println("PRODUTO INDISPONIVEL");
                            i--;
                        } else {
                            System.out.println("Quantos unidades deste produto deseja comprar ?");
                            unidades = ler.nextInt();

                            if (unidades > produto2.getQuantidade()) {
                                System.out.println("QUANTIDADE INDISPONIVEL");
                                i--;
                            } else {
                                System.out.println("Produto adicionado ao carrinho");
                                carrinho[i] = produto2.getNome();
                                valor[i] = unidades * produto2.getValor();
                                produto2.diminuirQuantidade(unidades);
                            }
                        }
                        break;

                    case 3:
                        if (produto3.getQuantidade() == 0) {
                            System.out.println("PRODUTO INDISPONIVEL");
                            i--;
                        } else {
                            System.out.println("Quantos unidades deste produto deseja comprar ?");
                            unidades = ler.nextInt();

                            if (unidades > produto3.getQuantidade()) {
                                System.out.println("QUANTIDADE INDISPONIVEL");
                                i--;
                            } else {
                                System.out.println("Produto adicionado ao carrinho");
                                carrinho[i] = produto3.getNome();
                                valor[i] = unidades * produto3.getValor();
                                produto3.diminuirQuantidade(unidades);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Finalizando");
                        break;

                    default:
                        System.out.println("opição invalida ");
                        break;
                }
                System.out.println(" ");

            } while (opicao < 1 || opicao > 4);

            if (opicao == 4) {
                break;
            }

        }

        // Calcula e exibe o valor total da compra.
        float valorTotal = 0;
        for (int j = 0; j < carrinho.length; j++) {
            if (carrinho[j] != null) {
                System.out.println(carrinho[j] + "     " + valor[j]);
                valorTotal += valor[j];
            }
        }
        System.out.printf("Valor total da compra : %.2f", valorTotal);

        /*
         * produto1.imprimir();
         * produto2.imprimir();
         * produto3.imprimir();
         * 
         * cliente.imprimir();
         */
        ler.close();
    }

}