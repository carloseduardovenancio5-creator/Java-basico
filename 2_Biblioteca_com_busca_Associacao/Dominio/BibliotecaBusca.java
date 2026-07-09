package Biblioteca_com_busca_Associacao.Dominio;

public class BibliotecaBusca {
    private Livro[] livros;

    {

    }

    public BibliotecaBusca(Livro[] livro) {
        this.livros = livro;
    }

    // verifica se o livro consta na biblioteca
    public void buscarLivro(String nome) {
        int encontrado = 0;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i].getNome().equals(nome)) {
                System.out.println("Livro encontrado");
                encontrado = 1;
                break;
            }
        }
        if (encontrado == 0) {
            System.out.println("Livro não encontrado");
        }
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
