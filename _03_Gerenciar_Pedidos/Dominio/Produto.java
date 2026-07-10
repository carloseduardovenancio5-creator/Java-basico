package java_atividades._03_Gerenciar_Pedidos.Dominio;

// Classe que representa um produto comercial.
public class Produto {
    // Armazena o nome do produto.
    private String nome;
    // Armazena o valor unitário do produto.
    private float valor;
    // Armazena a quantidade disponível em estoque.
    private int quantidade;

    // Construtor que recebe os dados principais do produto.
    public Produto(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    // Exibe as informações do produto no console.
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.valor);
        System.out.println(this.quantidade);

    }

    // Reduz a quantidade disponível do produto.
    public void diminuirQuantidade(int unidades) {
        this.quantidade -= unidades;
    }

    // Define o nome do produto.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define a quantidade disponível do produto.
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Define o valor do produto.
    public void setValor(float valor) {
        this.valor = valor;
    }

    // Retorna o nome do produto.
    public String getNome() {
        return nome;
    }

    // Retorna a quantidade disponível do produto.
    public int getQuantidade() {
        return quantidade;
    }

    // Retorna o valor do produto.
    public float getValor() {
        return valor;
    }
}
