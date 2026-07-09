package Seminarios_Associacao.Dominio;

// Classe que representa um seminário e os alunos participantes.
public class Seminario {
    // Vários alunos podem participar de um seminário.
    private String titulo;
    private String local;
    private Aluno[] alunos; // Associação entre seminário e alunos.

    // Construtor que recebe título e local do seminário.
    public Seminario(String titulo, String local) {

        this.titulo = titulo;
        this.local = local;

    }

    // Construtor que recebe título, local e lista de alunos.
    public Seminario(String titulo, String local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;

    }

    // Exibe os detalhes do seminário e os nomes dos alunos participantes.
    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Detalhes de " + "'" + this.titulo + "'");
        System.out.println(this.titulo);
        System.out.println(this.local);
        if (alunos == null)
            return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    // Define a lista de alunos participantes do seminário.
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    // Define o local do seminário.
    public void setLocal(String local) {
        this.local = local;
    }

    // Define o título do seminário.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Retorna a lista de alunos participantes do seminário.
    public Aluno[] getAlunos() {
        return alunos;
    }

    // Retorna o local do seminário.
    public String getLocal() {
        return local;
    }

    // Retorna o título do seminário.
    public String getTitulo() {
        return titulo;
    }

}
