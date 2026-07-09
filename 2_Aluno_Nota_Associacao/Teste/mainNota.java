package Aluno_Nota_Associacao.Teste;

// Importa a classe Aluno do pacote de domínio.
import Aluno_Nota_Associacao.Dominio.Aluno;
// Importa a classe Nota do pacote de domínio.
import Aluno_Nota_Associacao.Dominio.Nota;

// Define a classe principal do programa.
public class mainNota {
    // Método principal que inicia a execução do programa.
    public static void main(String[] args) {

        // Cria um objeto Aluno para o primeiro aluno.
        Aluno aluno1 = new Aluno();
        // Define o nome do primeiro aluno.
        aluno1.setNome("Cadu");
        // Define a idade do primeiro aluno.
        aluno1.setIdade(18);

        // Cria um objeto Nota com três valores para o primeiro aluno.
        Nota notaAluno1 = new Nota(new double[] { 8.5, 8.5, 8.5 });
        // double[] notasAluno01 = { 8.5, 8.5, 8.5 };
        // Nota[] notasAluno1 = { new Nota(notasAluno01) };

        // Calcula a média das notas do primeiro aluno.
        double mediaAluno1 = notaAluno1.calcularMedia(); // Acessa o primeiro elemento do array

        // Define a média calculada no objeto aluno1.
        aluno1.setMedia(mediaAluno1);
        // Associa as notas do primeiro aluno ao objeto aluno1.
        aluno1.setNotas(new Nota[] { notaAluno1 });

        // Mostra os dados do primeiro aluno.
        aluno1.mostrarDados();

        // Cria um objeto Aluno para o segundo aluno.
        Aluno aluno2 = new Aluno();
        // Define o nome do segundo aluno.
        aluno2.setNome("Marta");
        // Define a idade do segundo aluno.
        aluno2.setIdade(19);

        // Cria um objeto Nota com três valores para o segundo aluno.
        Nota notaAluno2 = new Nota(new double[] { 6.5, 8.0, 7.5 });
        // Calcula a média das notas do segundo aluno.
        double mediaAluno2 = notaAluno2.calcularMedia();

        // Define a média calculada no objeto aluno2.
        aluno2.setMedia(mediaAluno2);
        // Associa as notas do segundo aluno ao objeto aluno2.
        aluno2.setNotas(new Nota[] { notaAluno2 });

        // Mostra os dados do segundo aluno.
        aluno2.mostrarDados();

    }

}
