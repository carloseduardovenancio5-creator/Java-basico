package java_atividades._06_Seminarios_Associacao.Dominio;

// Classe que representa um professor responsável por seminários.
public class Professor {
    // Vários seminários podem estar associados a um professor.
    private String nome;
    private String especialidade;
    private Seminario[] seminarios; // Associação entre professor e seminários.

    // Construtor que recebe nome e especialidade do professor.
    public Professor(String nome, String especialidade) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    // Construtor que recebe nome, especialidade e lista de seminários.
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    // Exibe os dados do professor e os títulos dos seminários associados.
    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Detalhes de " + this.nome);
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
        }
    }

    // Define a especialidade do professor.
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Define o nome do professor.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define os seminários associados ao professor.
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    // Retorna o nome do professor.
    public String getNome() {
        return nome;
    }

    // Retorna a especialidade do professor.
    public String getEspecialidade() {
        return especialidade;
    }

    // Retorna os seminários associados ao professor.
    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
