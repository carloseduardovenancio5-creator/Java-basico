package Calculadora_notas.metodos;

// Importa a classe Scanner para ler entradas do usuário.
import java.util.Scanner;

// Classe responsável por calcular médias aritméticas e ponderadas.
public class CalculoMedias {

    // Calcula a média aritmética das notas informadas.
    public double aritimetica(int quantidade, Scanner ler) {

        // Variável para controlar se o usuário quer corrigir alguma nota.
        char verificacao;
        // Variável que guarda a média calculada.
        double media = 0;

        // Cria um vetor para armazenar as notas digitadas.
        double[] notas = new double[quantidade];
        // Percorre todas as posições do vetor.
        for (int i = 0; i < notas.length; i++) {
            // Solicita a nota da posição atual.
            System.out.printf("Digite a %dª nota: ", i + 1);
            // Armazena a nota informada.
            notas[i] = ler.nextDouble();

            // Exibe a nota digitada.
            System.out.println("nota: " + notas[i]);

            // Loop para permitir correção da nota, se desejado.
            do {
                do {
                    // Pergunta se o usuário deseja corrigir o valor.
                    System.out.println("Deseja corrijir o valore ? ('S' ou 'N') ");
                    verificacao = ler.next().charAt(0);

                    // Valida a opção informada.
                    if (verificacao != 's' && verificacao != 'S' && verificacao != 'n' && verificacao != 'N') {
                        System.out.println("Caracter invalido! Por favor utilize 's' ou 'n' ");
                    }

                    // Se a opção for corrigir, lê a nova nota.
                    if (verificacao == 's' || verificacao == 'S') {
                        System.out.printf("Digite a %dª nota:\n", i + 1);
                        notas[i] = ler.nextDouble();

                        System.out.println("nota: " + notas[i]);
                    }

                } while (verificacao == 's' || verificacao == 'S');

            } while (verificacao != 's' && verificacao != 'S' && verificacao != 'n' && verificacao != 'N');

        }
        // Soma todas as notas.
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }

        // Divide a soma pelo total de notas para obter a média.
        media = media / quantidade;

        // Retorna a média calculada.
        return media;

    }

    // Calcula a média ponderada das notas informadas.
    public double ponderada(int quantidade, Scanner ler) {

        // Variável para controlar se o usuário quer corrigir os valores.
        char verificacao;
        // Variável para armazenar a soma dos pesos multiplicados pelas notas.
        double pesoXnota = 0;
        // Variável para armazenar a soma dos pesos.
        double somaPeso = 0;
        // Variável que guarda a média ponderada calculada.
        double media = 0;
        // Vetores para armazenar notas e pesos.
        double[] notas = new double[quantidade];
        double[] peso = new double[quantidade];

        // Percorre todos os itens informados pelo usuário.
        for (int i = 0; i < notas.length; i++) {
            // Solicita o peso e a nota da posição atual.
            System.out.printf("Digite o %d° peso e a %dª nota:\n", i + 1, i + 1);
            peso[i] = ler.nextDouble();
            notas[i] = ler.nextDouble();

            // Exibe o peso e a nota informados.
            System.out.println("peso: " + peso[i] + " " + "nota: " + notas[i]);

            // Loop para permitir correção dos valores, se desejado.
            do {
                do {
                    // Pergunta se o usuário deseja corrigir os valores.
                    System.out.println("Deseja corrijir os valores ? ('S' ou 'N') ");
                    verificacao = ler.next().charAt(0);

                    // Valida a opção informada.
                    if (verificacao != 's' && verificacao != 'S' && verificacao != 'n' && verificacao != 'N') {
                        System.out.println("Caracter invalido! Por favor utilize 's' ou 'n' ");
                    }

                    // Se a opção for corrigir, lê os novos valores.
                    if (verificacao == 's' || verificacao == 'S') {
                        System.out.printf("Digite o %d° peso e a %dª nota:\n", i + 1, i + 1);
                        peso[i] = ler.nextDouble();
                        notas[i] = ler.nextDouble();

                        System.out.println("peso: " + peso[i] + " " + "nota: " + notas[i]);
                    }

                } while (verificacao == 's' || verificacao == 'S');

            } while (verificacao != 's' && verificacao != 'S' && verificacao != 'n' && verificacao != 'N');
        }
        // Calcula a soma do produto entre peso e nota e a soma dos pesos.
        for (int i = 0; i < notas.length; i++) {
            pesoXnota += peso[i] * notas[i];
            somaPeso += peso[i];

        }

        // Calcula a média ponderada dividindo pela soma dos pesos.
        media = pesoXnota / somaPeso;

        // Retorna a média ponderada calculada.
        return media;
    }
}
