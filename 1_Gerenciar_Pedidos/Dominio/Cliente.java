package Gerenciar_Pedidos.Dominio;

// Importa a classe Scanner para ler dados do usuário.
import java.util.Scanner;

// Classe que representa um cliente do sistema.
public class Cliente {
    // Objeto Scanner usado para entrada de dados.
    Scanner ler = new Scanner(System.in);

    // Armazena o nome do cliente.
    private String nome;
    // Armazena o CPF do cliente.
    private long cpf;

    // Construtor vazio da classe Cliente.
    public Cliente() {

    }

    // Coleta os dados do cliente pelo terminal.
    public void initCliente() {
        System.out.println("Nome do cliente : ");
        this.nome = ler.nextLine().trim();
        System.out.println("Digite o cpf do cliente: ");
        this.cpf = ler.nextLong();

    }

    // Exibe os dados do cliente no console.
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.cpf);

    }

    // Define o nome do cliente.
    public void setNome(String nome) {
        this.nome = nome;

    }

    // Retorna o nome do cliente.
    public String getNome() {
        return nome;
    }

    // Define o CPF do cliente.
    public void setCpf(long cpf) {
        this.cpf = cpf;

    }

    // Retorna o CPF do cliente.
    public long getCpf() {
        return cpf;
    }

}