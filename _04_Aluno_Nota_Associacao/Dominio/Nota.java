package java_atividades._04_Aluno_Nota_Associacao.Dominio;

// Define a classe Nota para armazenar os valores das notas.
public class Nota {
    // Armazena as notas em um array de doubles.
    private double[] valorNota;

    // Construtor vazio da classe Nota.
    public Nota() {

    }

    // Construtor que recebe um array de notas.
    public Nota(double[] valorNota) {
        // Atribui o array recebido ao atributo da classe.
        this.valorNota = valorNota;

    }

    // Calcula a média das notas armazenadas.
    public double calcularMedia() {
        // Inicializa a variável de soma com zero.
        double somaNota = 0;
        // Percorre todas as notas do array.
        for (double nota : valorNota) {
            // Soma cada nota ao total.
            somaNota += nota;
        }
        // Calcula a média dividindo a soma pelo total de notas.
        double media = somaNota / valorNota.length;

        // Retorna a média calculada.
        return media;
    }

    // Define um novo array de notas.
    public void setValorNota(double[] valorNota) {
        this.valorNota = valorNota;
    }

    // Retorna o array de notas.
    public double[] getValorNota() {
        return valorNota;
    }
}
