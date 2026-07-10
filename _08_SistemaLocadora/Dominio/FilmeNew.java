package java_atividades._08_SistemaLocadora.Dominio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FilmeNew {

    Scanner input = new Scanner(System.in);

    private String titulo;
    private long codeId;
    private GeneroNew genero;
    private StatusNew status;
    private Cliente cliente;

    public FilmeNew() {
    }

    public FilmeNew(String titulo, long codeId, GeneroNew genero) {
        this.titulo = titulo;
        this.codeId = codeId;
        this.genero = genero;
        this.status = StatusNew.DISPONIVEL;
    }

    public void exibirDisponiveis() {

    }

    public void cadastrarFilme() {
        System.out.println("INICIANDO CADASTRO DE FILME");

        System.out.println("Digite o título do filme para cadastrar");
        this.titulo = input.nextLine();

        System.out.println("Digite o código do filme para cadastrar");
        this.codeId = input.nextLong();
        input.nextLine(); // limpa o ENTER que sobrou do nextLong()

        boolean generoValido;
        do {
            System.out.println("Digite o genero do filme para cadastrar (MAIUSCULO e separado por '_')");
            String generoFilme = input.nextLine().trim().toUpperCase();
            try {
                this.genero = GeneroNew.valueOf(generoFilme);
                generoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Gênero inválido. Tente novamente.");
                generoValido = false;
            }
        } while (!generoValido);
        /*
         * try e catch são usados em Java para tratar erros que podem acontecer enquanto
         * o programa roda.
         * try contém o código que pode gerar uma exceção.
         * catch pega essa exceção e permite tratar o problema sem quebrar o programa.
         */

        this.status = StatusNew.DISPONIVEL;
    }

    public void alugarfilme() {

        if (this.status.equals(StatusNew.ALUGADO)) {
            System.out.println("Filme já alugado");
            JOptionPane.showMessageDialog(null, "Filme já alugado");
            return;
        } else {

            System.out.println("Nome do Cliente alugador: ");
            String nomeCliente = input.nextLine();
            this.cliente = new Cliente(nomeCliente);
            disponibilidade();
        }

    }

    public void disponibilidade() {

        if (status.equals(StatusNew.DISPONIVEL)) {
            System.out.println("Alterando disponibilidade do filme " + this.titulo);
            this.status = StatusNew.ALUGADO;
        }
    }

    public void consultarDados() {
        System.out.println("--------------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Codigo de identificação: " + this.codeId);
        System.out.println("Gênero: " + this.genero);
        System.out.println("StatusNew: " + this.status);
        if (this.cliente != null) {
            System.out.println("Cliente: " + this.cliente.getNome());
        } else {
            System.out.println("Cliente: Nenhum cliente alugou este filme.");
        }
        System.out.println("--------------------------");

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }

    public void setStatus(StatusNew status) {
        this.status = status;
    }

    public void setGenero(GeneroNew genero) {
        this.genero = genero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getCodeId() {
        return codeId;
    }

    public GeneroNew getGenero() {
        return genero;
    }

    public StatusNew getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
