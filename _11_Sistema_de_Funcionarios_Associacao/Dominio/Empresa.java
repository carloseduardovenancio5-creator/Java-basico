package java_atividades._11_Sistema_de_Funcionarios_Associacao.Dominio;

public class Empresa {

    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

}
