package java_atividades._07_Sistema_Controle_Animais.Dominio;

public class Funcionario {
    private String nome;
    private long idFuncionario;

    public Funcionario(String nome, long id) {
        this.nome = nome;
        this.idFuncionario = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }
}
