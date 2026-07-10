
package java_atividades._08_SistemaLocadora.Teste;

import java.util.Scanner;

import java_atividades._08_SistemaLocadora.Dominio.FilmeNew;
import java_atividades._08_SistemaLocadora.Dominio.GeneroNew;
import java_atividades._08_SistemaLocadora.Dominio.StatusNew;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FilmeNew[] filmes = new FilmeNew[10];

        filmes[0] = new FilmeNew("O Poderoso Chefão", 1, GeneroNew.DRAMA);
        filmes[1] = new FilmeNew("Star Wars: Uma Nova Esperança", 2, GeneroNew.FICÇÃO_CIENTÍFICA);
        filmes[2] = new FilmeNew("O Senhor dos Anéis: A Sociedade do Anel", 3, GeneroNew.AVENTURA);
        filmes[3] = new FilmeNew("Pulp Fiction: Tempo de Violência", 4, GeneroNew.POLICIAL);
        filmes[4] = new FilmeNew("A Origem", 5, GeneroNew.FICÇÃO_CIENTÍFICA);
        filmes[5] = new FilmeNew("O Silêncio dos Inocentes", 6, GeneroNew.TERROR);
        filmes[6] = new FilmeNew("Forrest Gump: O Contador de Histórias", 7, GeneroNew.DRAMA);
        filmes[7] = new FilmeNew("Matrix", 8, GeneroNew.FICÇÃO_CIENTÍFICA);
        filmes[8] = new FilmeNew("O Grande Lebowski", 9, GeneroNew.COMÉDIA);
        filmes[9] = new FilmeNew();

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

                for (FilmeNew exibir : filmes) {
                    if (exibir.getStatus() == StatusNew.DISPONIVEL) {
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
