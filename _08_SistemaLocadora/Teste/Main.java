
package java_atividades._08_SistemaLocadora.Teste;

import java.util.Scanner;

import java_atividades._08_SistemaLocadora.Dominio.Filme;
import java_atividades._08_SistemaLocadora.Dominio.Genero;
import java_atividades._08_SistemaLocadora.Dominio.Status;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Filme[] filmes = new Filme[10];

        filmes[0] = new Filme("O Poderoso Chefão", 1, Genero.DRAMA);
        filmes[1] = new Filme("Star Wars: Uma Nova Esperança", 2, Genero.FICÇÃO_CIENTÍFICA);
        filmes[2] = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 3, Genero.AVENTURA);
        filmes[3] = new Filme("Pulp Fiction: Tempo de Violência", 4, Genero.POLICIAL);
        filmes[4] = new Filme("A Origem", 5, Genero.FICÇÃO_CIENTÍFICA);
        filmes[5] = new Filme("O Silêncio dos Inocentes", 6, Genero.TERROR);
        filmes[6] = new Filme("Forrest Gump: O Contador de Histórias", 7, Genero.DRAMA);
        filmes[7] = new Filme("Matrix", 8, Genero.FICÇÃO_CIENTÍFICA);
        filmes[8] = new Filme("O Grande Lebowski", 9, Genero.COMÉDIA);
        filmes[9] = new Filme();

        filmes[9].cadastrarFilme();

        filmes[0].consultarDados();
        filmes[1].consultarDados();
        filmes[2].consultarDados();
        filmes[3].consultarDados();
        filmes[4].consultarDados();
        filmes[5].consultarDados();
        filmes[6].consultarDados();
        filmes[7].consultarDados();
        filmes[8].consultarDados();
        filmes[9].consultarDados();

        char opcao;
        do {
            System.out.println("--------------------------");
            System.out.println("Deseja alugar um filme? S ou N");
            opcao = input.next().charAt(0);

            if (opcao == 's' || opcao == 'S') {

                System.out.println("--------------------------");

                for (Filme exibir : filmes) {
                    if (exibir.getStatus() == Status.DISPONIVEL) {
                        System.out.println(exibir.getTitulo());
                    }
                }
                System.out.println("--------------------------");

                System.out.println("Qual filme deseja alugar ? ");
                String alugar = input.nextLine();

                for (int i = 0; i < filmes.length; i++) {
                    if (alugar == filmes[i].getTitulo()) {
                        filmes[i].alugarfilme();
                    }
                }
            } else if (opcao != 's' || opcao != 'S' || opcao != 'n' || opcao != 'N') {
                System.out.println("Opição invalida");
            }
        } while (opcao == 'n' || opcao == 'N');

        input.close();
    }

}
