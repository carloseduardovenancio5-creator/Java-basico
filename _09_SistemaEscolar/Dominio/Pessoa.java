package java_atividades._09_SistemaEscolar.Dominio;

public abstract class Pessoa {
    // Todas possuem nome, idade e CPF, CPF não deve ser alterado.
    private String nome;
    private int idade;
    private long cpf;

    public Pessoa(String nome, int idade, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}