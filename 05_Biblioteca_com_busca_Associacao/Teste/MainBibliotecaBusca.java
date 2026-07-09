package Biblioteca_com_busca_Associacao.Teste;

import java.util.Scanner;

import Biblioteca_com_busca_Associacao.Dominio.Livro;
import Biblioteca_com_busca_Associacao.Dominio.BibliotecaBusca;

public class MainBibliotecaBusca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livro livro01 = new Livro();
        Livro livro02 = new Livro("O GLORIOSO SÃO JOSE", 2008, 1);
        Livro livro03 = new Livro("CORTE DE GELO E ESTRELAS", 2024, 26);
        Livro livro04 = new Livro("HARRY POTTER E A PEDRA FILOSOFAL", 1997, 1);
        Livro livro05 = new Livro("JAVA UMA ABORDAGEM SOBRE PROGAMAÇÃO JAVA", 2014, 1);

        // array de livros
        Livro[] livros = { livro01, livro02, livro03, livro04, livro05 };

        livro01.initLivro(input);

        // Cria a associação e liga a biblioteca com os livros
        BibliotecaBusca biblioteca = new BibliotecaBusca(livros);

        livro01.exibeDados();
        livro02.exibeDados();
        livro03.exibeDados();
        livro04.exibeDados();
        livro05.exibeDados();

        // Lê qual livro deve ser encontrado
        System.out.println("Digite o nome do livro que deseja buscar (EM MAIUSCULA) : ");
        biblioteca.buscarLivro(input.nextLine());

        input.close();
    }
}
