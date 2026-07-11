package java_atividades._09_SistemaEscolar.Dominio;

public class Professor extends Pessoa {

    private Formacao formacao;

    public Professor(String nome, int idade, long cpf, Formacao formacao) {
        super(nome, idade, cpf);
        this.formacao = formacao;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Formação : " + this.formacao.getNomeSerie());
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Formacao getFormacao() {
        return formacao;
    }
}
