package java_atividades.Gerenciamento_Veiculos.Dominio;

import java.util.Scanner;

public class Veiculo {

    private String modelo;
    private String placa;
    private double kmRodado;

    public Veiculo() {
    }

    public Veiculo(String modelo, String placa, double kmRodado) {
        this.modelo = modelo;
        this.placa = placa;
        this.kmRodado = kmRodado;
    }

    public void init(Scanner input) {
        input.nextLine();
        System.out.println("modelo do veículo: ");
        this.modelo = input.nextLine();
        System.out.println("Placa do veículo: ");
        this.placa = input.nextLine();
        System.out.println("Quantidade de km rodados: ");
        this.kmRodado = input.nextDouble();
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getKmRodado() {
        return kmRodado;
    }

}
