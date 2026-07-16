package java_atividades._10_SistemaTransporte.Teste;

import java_atividades._10_SistemaTransporte.Dominio.Caminhao;
import java_atividades._10_SistemaTransporte.Dominio.Carro;
import java_atividades._10_SistemaTransporte.Dominio.Moto;
import java_atividades._10_SistemaTransporte.Dominio.Camionete;

public class TransporteMain {

    public static void main(String[] args) {

        // Iniciação de objetos
        Carro carro = new Carro("Honda", "SUV", 2020);
        Moto moto = new Moto("Yamaha", "Bross 160", 2021);
        Caminhao caminhao = new Caminhao("Volvo", "truck", 2025);
        Camionete caminete = new Camionete("Goiani", "Trassado", 2023);
        Carro carro2 = new Carro();

        carro2.CadastrarVeiculos();

        System.out.println(carro);
        System.out.println("-------------");
        System.out.println(moto);
        System.out.println("-------------");
        System.out.println(caminhao);
        System.out.println("-------------");
        System.out.println(caminete);
        System.out.println("-------------");
        System.out.println(carro2);
        System.out.println("-------------");

        caminete.desligarVeiculo();
        moto.desligarVeiculo();

    }
}
