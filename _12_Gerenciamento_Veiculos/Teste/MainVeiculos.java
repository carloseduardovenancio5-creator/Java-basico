package java_atividades.Gerenciamento_Veiculos.Teste;

import java.util.Scanner;

import java_atividades.Gerenciamento_Veiculos.Dominio.Veiculo;

public class MainVeiculos {
    public static void main(String[] args) {

        // Classe armazena os veiculos em um vetor e faz as consultas necessarias
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos veiculos serão cadastrados? ");
        int quantidade = input.nextInt();

        Veiculo[] veiculos = new Veiculo[quantidade];

        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = new Veiculo();
            veiculos[i].init(input);

        }

        input.nextLine();// parar limpar o espaço
        System.out.println("Qual veiculo deseja consultar? (placa)");
        String placaConsulta = input.nextLine();

        for (int i = 0; i < veiculos.length; i++) {

            if (veiculos[i].getPlaca().equals(placaConsulta)) {

                System.out.println("Modelo: " + veiculos[i].getModelo());

                if (veiculos[i].getKmRodado() <= 100000) {
                    System.out.println("Em condições normais");
                } else {
                    System.out.println("Precisa de manutenção");
                }
            }
        }

        input.close();
    }
}
