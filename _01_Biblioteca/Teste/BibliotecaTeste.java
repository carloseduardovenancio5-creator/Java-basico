package java_atividades._01_Biblioteca.Teste;

// Importa a classe Scanner para ler dados do usuário.
import java.util.Scanner;
import java_atividades._01_Biblioteca.Dominio.Biblioteca;

// Classe principal para testar a lógica da biblioteca.
public class BibliotecaTeste {

    // Método principal que inicia a execução do programa.
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler as entradas do usuário.
        Scanner ler = new Scanner(System.in);
        // Variável para armazenar a opção escolhida pelo usuário.
        char opição;

        // Cria quatro objetos do tipo Biblioteca para representar os livros.
        Biblioteca livro01 = new Biblioteca();
        Biblioteca livro02 = new Biblioteca();
        Biblioteca livro03 = new Biblioteca();
        Biblioteca livro04 = new Biblioteca();

        // Define os dados dos livros cadastrados.
        livro01.titulo = "O Alienista";
        livro01.autor = "Machado de Assis";
        livro01.disponibilidade = 'D';

        livro02.titulo = "Harry Potter";
        livro02.autor = "J. K. Rowling";
        livro02.disponibilidade = 'D';

        livro03.titulo = "Biblioteca da Meia Noite";
        livro03.autor = "Matt Haig";
        livro03.disponibilidade = 'D';

        livro04.titulo = "O Gambito da Rainha ";
        livro04.autor = "Walter Tevis";
        livro04.disponibilidade = 'D';

        // Pergunta ao usuário se ele deseja emprestar ou devolver um livro.
        System.out.println("Olá, seja bem vindo a Grande Biblioteca!");
        do {
            System.out.println("Voce deseja emprestar ou devolver um livro ? (Por favor utilize 'E' ou 'D' )");
            opição = ler.next().charAt(0);
            if (opição != 'e' && opição != 'E' && opição != 'd' && opição != 'D') {
                System.out.print("Caracter invalido, por favor utilise 'E' ou 'D' \n");
            }

        } while (opição != 'e' && opição != 'E' && opição != 'd' && opição != 'D');

        // Se a opção for emprestar, mostra os livros e altera a disponibilidade.
        if (opição == 'e' || opição == 'E') {
            int num;
            do {
                System.out.println("Selecione o livro que voce deseja emprestar : ");
                System.out.println("[1]  " + livro01.titulo + "\n" +
                        "[2]  " + livro02.titulo + "\n" +
                        "[3]  " + livro03.titulo + "\n" +
                        "[4]  " + livro04.titulo);
                num = ler.nextInt();
                switch (num) {
                    case 1:
                        livro01.disponibilidade = livro01.EmprestarDisponibilidade(livro01.disponibilidade);
                        break;
                    case 2:
                        livro02.disponibilidade = livro02.EmprestarDisponibilidade(livro02.disponibilidade);
                        break;
                    case 3:
                        livro03.disponibilidade = livro03.EmprestarDisponibilidade(livro03.disponibilidade);
                        break;
                    case 4:
                        livro04.disponibilidade = livro04.EmprestarDisponibilidade(livro04.disponibilidade);
                        break;
                    default:
                        System.out.println("Opição invalida");
                        break;
                }
            } while (num < 1 || num > 4);
        } else if (opição == 'd' || opição == 'D') {
            // Se a opção for devolver, mostra os livros e altera a disponibilidade para
            // disponível.
            int num;
            do {
                System.out.println("Selecione o livro que voce deseja devolver : ");
                System.out.println("[1]  " + livro01.titulo + "\n" +
                        "[2]  " + livro02.titulo + "\n" +
                        "[3]  " + livro03.titulo + "\n" +
                        "[4]  " + livro04.titulo);
                num = ler.nextInt();
                switch (num) {
                    case 1:
                        livro01.disponibilidade = livro01.DevolverDisponibilidade(livro01.disponibilidade);
                        break;
                    case 2:
                        livro02.disponibilidade = livro02.DevolverDisponibilidade(livro02.disponibilidade);
                        break;
                    case 3:
                        livro03.disponibilidade = livro03.DevolverDisponibilidade(livro03.disponibilidade);
                        break;
                    case 4:
                        livro04.disponibilidade = livro04.DevolverDisponibilidade(livro04.disponibilidade);
                        break;
                    default:
                        System.out.println("Opição invalida");
                        break;
                }
            } while (num < 1 || num > 4);

            // Fecha o Scanner após o uso.
            ler.close();

        }
    }

}
