package java_atividades._06_Seminarios_Associacao.Teste;

// Importa as classes do pacote de domínio.
import java_atividades._06_Seminarios_Associacao.Dominio.Aluno;
import java_atividades._06_Seminarios_Associacao.Dominio.Professor;
import java_atividades._06_Seminarios_Associacao.Dominio.Seminario;

// Classe principal que testa a associação entre alunos, seminários e professor.
public class Main {

    // Método principal que inicia a execução do programa.
    public static void main(String[] args) {

        // Cria um professor.
        Professor professora01 = new Professor("Vanessinha", "Letras");

        // Cria três seminários.
        Seminario seminario01 = new Seminario("Automatisação do mundo moderno", "E.E 'Prof. Homero Calvoso'");
        Seminario seminario02 = new Seminario("A vida animal prejudicada em Marte", "Rua dos seus sonhos - 001");
        Seminario seminario03 = new Seminario("Um tema bem aleatorio", "Rua dos seus sonhos - 123");

        // Cria três alunos e associa o primeiro a um seminário.
        Aluno aluno01 = new Aluno("Cadu", 18, seminario01);
        Aluno aluno02 = new Aluno("Fulaninho", 19);
        Aluno aluno03 = new Aluno("Beltena", 17);

        // Cria arrays de alunos para associar aos seminários.
        Aluno[] alunosSeminario02 = { aluno03 };
        Aluno[] alunosSeminario01 = { aluno01, aluno02 };
        Seminario[] seminarios = { seminario01, seminario02 };

        // Associa os alunos aos seminários.
        aluno03.setSeminario(seminario02);
        seminario02.setAlunos(alunosSeminario02);
        seminario01.setAlunos(alunosSeminario01);
        aluno02.setSeminario(seminario01);

        // Associa os seminários ao professor.
        professora01.setSeminarios(seminarios);

        // Exibe os dados de cada aluno.
        aluno01.imprimir();
        aluno02.imprimir();
        aluno03.imprimir();

        // Exibe os dados do professor.
        professora01.imprimir();

        // Exibe os dados dos seminários.
        seminario01.imprimir();
        seminario02.imprimir();
        seminario03.imprimir();

    }
}