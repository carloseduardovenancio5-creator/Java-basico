package java_atividades._10_SistemaTransporte.Dominio;

import java.util.Scanner;

//classe base para todos veiculos 
public abstract class Veiculos {
    // Ler dados do usuario
    Scanner input = new Scanner(System.in);

    private String marca;
    private String modelo;
    private int ano;
    private Status status;

    // construtor vazio
    public Veiculos() {
        this.status = Status.LIGADO;
    }

    // contrutor com as informações
    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.status = Status.LIGADO;
    }

    // metodo para cadastrar um veiculo
    public void CadastrarVeiculos() {

        System.out.println("---cadastrando veiculo---");
        System.out.println("Insira a marca do veiculo: ");
        this.marca = input.nextLine();
        System.out.println("Insira o modelo do veiculo: ");
        this.modelo = input.nextLine();
        System.out.println("Insira o ano do veiculo: ");
        this.ano = input.nextInt();

    }

    // metodo para desligar veiculo
    public void desligarVeiculo() {
        if (this.status.equals(Status.DESLIGADO)) {
            System.out.println("Veiculo já desligado");
        } else {
            this.status = Status.DESLIGADO;
            System.out.println("Veiculo desligado");
        }
    }

    // metodo para ligar veiculo
    public void ligarVeiculo() {
        if (this.status.equals(Status.LIGADO)) {
            System.out.println("Veiculo já ligado");
        } else {
            this.status = Status.LIGADO;
            System.out.println("Veiculo ligado");
        }
    }

    @Override
    public String toString() {
        return ("Marca: " + this.marca + " Modelo: " + this.modelo
                + " Ano: " + this.ano + "Status: " + this.status);
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
