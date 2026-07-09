package Sistema_Controle_Animais.Teste;

import java.util.Scanner;

import Sistema_Controle_Animais.Dominio.Animal;
import Sistema_Controle_Animais.Dominio.Cachorro;
import Sistema_Controle_Animais.Dominio.Gato;
import Sistema_Controle_Animais.Dominio.GestorAtendimento;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cachorro cachorro01 = new Cachorro(2541);
        Cachorro cachorro02 = new Cachorro(2541);
        Cachorro cachorro03 = new Cachorro(2541);
        Cachorro cachorro04 = new Cachorro(2541);

        Gato gato01 = new Gato(1684);
        Gato gato02 = new Gato(1684);
        Gato gato03 = new Gato(1684);
        Gato gato04 = new Gato(1684);

        Animal[] animais = { cachorro01, cachorro02, cachorro03, cachorro04,
                gato01, gato02, gato03, gato04 };
        GestorAtendimento filaDeAtendimento = new GestorAtendimento(animais);

        cachorro01.initCachorro();
        cachorro01.imprimirDadosCachorro();
        cachorro02.initCachorro();
        cachorro02.imprimirDadosCachorro();
        cachorro03.initCachorro();
        cachorro03.imprimirDadosCachorro();
        cachorro04.initCachorro();
        cachorro04.imprimirDadosCachorro();

        gato01.initGato();
        gato01.imprimirDadosGato();
        gato02.initGato();
        gato02.imprimirDadosGato();
        gato03.initGato();
        gato03.imprimirDadosGato();
        gato04.initGato();
        gato04.imprimirDadosGato();

        System.out.println("Qual animal vai ser atendido ? (Codigo) ");
        long animalatendido = input.nextLong();

        filaDeAtendimento.verificarAtendimento(animalatendido);

        input.close();
    }
}