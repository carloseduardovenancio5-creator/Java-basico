package java_atividades._05_Biblioteca_com_busca_Associacao.Dominio;

import java.util.Scanner;

public class Livro {
    private String nome;
    private int anoDeLancamento;
    private int numDaEdicao;

    {

    }

    public Livro() {

    }

    public Livro(String nome, int anoDeLancamento, int numDaEdicao) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.numDaEdicao = numDaEdicao;
    }

    // metodo para cadastro de um livro
    public void initLivro(Scanner inputs) {
        Scanner input = inputs;

        System.out.println("Digite o nome do livro que deseja cadastrar (EM LETRAS MAIUSCULAS)");
        this.setNome(input.nextLine().trim());
        System.out.println("Digite o ano de lançamento do livro que deseja cadastrar");
        this.setAnoDeLancamento(input.nextInt());
        System.out.println("Digite o número da edição do livro");
        this.setNumDaEdicao(input.nextInt());
        // Esse problema nao deixava eu rodar o programa
        input.nextLine(); // limpa o ENTER sobrando

    }

    // metodo para exibir os dados de um livro
    public void exibeDados() {
        System.out.println("=====================");
        System.out.println("Titulo: " + this.nome);
        System.out.println("Edição: " + this.numDaEdicao);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("=====================");
        System.out.println(" ");
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumDaEdicao(int numDaEdicao) {
        this.numDaEdicao = numDaEdicao;
    }

    public int getNumDaEdicao() {
        return numDaEdicao;
    }
}
