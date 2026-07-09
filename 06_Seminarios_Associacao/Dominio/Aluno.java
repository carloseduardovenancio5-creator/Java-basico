package Seminarios_Associacao.Dominio;

// Classe que representa um aluno participante de seminários.
public class Aluno {
    // Um seminário por aluno.
    private String nome;
    private int idade;
    private Seminario seminario; // Associação entre aluno e seminário.

    // Construtor que recebe nome e idade do aluno.
    public Aluno(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    // Construtor que recebe nome, idade e seminário associado.
    public Aluno(String nome, int idade, Seminario seminario) {
        this.idade = idade;
        this.nome = nome;
        this.seminario = seminario;
    }

    // Exibe os detalhes do aluno e do seminário associado.
    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Detalhes de " + this.nome);
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(seminario.getTitulo());
    }

    // Define a idade do aluno.
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Define o nome do aluno.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define o seminário associado ao aluno.
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    // Retorna a idade do aluno.
    public int getIdade() {
        return idade;
    }

    // Retorna o nome do aluno.
    public String getNome() {
        return nome;
    }

    // Retorna o seminário associado ao aluno.
    public Seminario getSeminario() {
        return seminario;
    }
}
