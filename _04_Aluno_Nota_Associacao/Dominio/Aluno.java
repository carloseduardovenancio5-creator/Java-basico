package java_atividades._04_Aluno_Nota_Associacao.Dominio;

// Define a classe Aluno com os dados básicos do aluno.
public class Aluno {
    // Armazena o nome do aluno.
    private String nome;
    // Armazena a idade do aluno.
    private int idade;
    // Armazena as notas associadas ao aluno.
    private Nota[] notas;
    // Armazena a média do aluno.
    private double media;

    // Exibe no console os dados do aluno.
    public void mostrarDados() {
        // Mostra o nome do aluno.
        System.out.println("Aluno: " + getNome());
        // Mostra a idade do aluno.
        System.out.println("Idade: " + getIdade());
        // Mostra a média do aluno.
        System.out.println("Media: " + getMedia());
    }

    // Define a média do aluno.
    public void setMedia(double media) {
        this.media = media;
    }

    // Define as notas do aluno.
    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    // Define a idade do aluno.
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Define o nome do aluno.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna a idade do aluno.
    public int getIdade() {
        return idade;
    }

    // Retorna o nome do aluno.
    public String getNome() {
        return nome;
    }

    // Retorna a média do aluno.
    public double getMedia() {
        return media;
    }

    // Retorna as notas do aluno.
    public Nota[] getNotas() {
        return notas;
    }

}
