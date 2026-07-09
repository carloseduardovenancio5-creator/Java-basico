package Biblioteca.Dominio;

// Classe que representa um livro da biblioteca.
public class Biblioteca {

    // Armazena o título do livro.
    public String titulo;
    // Armazena o autor do livro.
    public String autor;
    // Armazena a disponibilidade do livro, com D para disponível e I para
    // indisponível.
    public char disponibilidade;

    // Método que tenta emprestar o livro e altera sua disponibilidade.
    public char EmprestarDisponibilidade(char disponibilidade) {
        // Verifica se o livro está disponível.
        if (disponibilidade == 'D' || disponibilidade == 'd') {
            // Exibe uma mensagem de sucesso ao emprestar.
            System.out.println("O livro " + titulo + " foi emprestado com sucesso");
            // Altera a disponibilidade para indisponível.
            disponibilidade = 'I';
        } else if (disponibilidade == 'I' || disponibilidade == 'i') {
            // Exibe uma mensagem se o livro já estiver indisponível.
            System.out.println("O livro " + titulo + " Esta indisponivel para emprestimo");
            // Mantém o estado como indisponível.
            disponibilidade = 'I';
        }

        // Retorna o novo estado de disponibilidade.
        return disponibilidade;
    }

    // Método que realiza a devolução do livro e altera sua disponibilidade.
    public char DevolverDisponibilidade(char disponibilidade) {
        // Verifica se o livro está indisponível para devolver.
        if (disponibilidade == 'I' || disponibilidade == 'i') {
            // Exibe uma mensagem de devolução realizada.
            System.out.println("O livro " + titulo + " foi devolvido com sucesso");
            // Altera a disponibilidade para disponível.
            disponibilidade = 'D';
        } else if (disponibilidade == 'D' || disponibilidade == 'd') {
            // Exibe uma mensagem se o livro já estiver disponível.
            System.out.println("O livro " + titulo + " Esta indisponivel para devolução");
            // Mantém o estado como disponível.
            disponibilidade = 'D';
        }

        // Retorna o novo estado de disponibilidade.
        return disponibilidade;
    }

}
