package java_atividades._09_SistemaEscolar.Dominio;

public class Aluno extends Pessoa {

    private Serie serie;

    public Aluno(String nome, int idade, long cpf, Serie serie) {
        super(nome, idade, cpf);
        this.serie = serie;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cursando : " + serie.getNomeSerie());

    }

    public Serie getSerie() {
        return serie;
    }

}
