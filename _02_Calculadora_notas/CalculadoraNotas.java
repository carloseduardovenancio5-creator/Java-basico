
/*
Receba notas de um aluno. Calcule a média aritmética. 
Se a média for maior ou igual a ao valor estabelecido, exiba "Aprovado".
Se for entre o valor estabelecido, exiba "Recuperação". 
Caso seja menor que o valor estabelecido, exiba "Reprovado".

ADICIONAR A OPIÇÃO DE PONDERADA E ARTIMETICA E ADD SEUS METODOS
VERIFICAÇÕES
SEPARAR COMO UM CODIGO ORGANISADO
*/

// Define o pacote da classe.
package java_atividades._02_Calculadora_notas;

// Importa a classe Scanner para ler dados do usuário.
import java.util.Scanner;

// Importa a classe que contém os métodos de cálculo de média.
import java_atividades._02_Calculadora_notas.metodos.CalculoMedias;

// Classe principal da calculadora de notas.
public class CalculadoraNotas {

    // Método principal que inicia o programa.
    public static void main(String[] args) {

        // Cria um objeto da classe responsável por calcular as médias.
        CalculoMedias tipoNota = new CalculoMedias();

        // Cria um objeto Scanner para capturar entradas do usuário.
        Scanner ler = new Scanner(System.in);
        // Variável para armazenar o tipo de média escolhida.
        char tipo;
        // Variável para guardar o valor da média calculada.
        double media = 0;

        // Solicita ao usuário a quantidade de notas que serão digitadas.
        System.out.println("Quantas notas serão digitadas? ");
        int quantidade = ler.nextInt();

        // Solicita as notas de corte para aprovação e recuperação.
        System.out.println("Qual e a nota de corte para aprovação e recuperação ? (SEPARE POR ESPAÇOS)");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();

        // Loop para garantir que o usuário informe um tipo de média válido.
        do {
            System.out.println("A média será aritimetica ou ponderada? ");
            tipo = ler.next().charAt(0);
            if (tipo != 'a' && tipo != 'A' && tipo != 'p' && tipo != 'P') {
                System.out.print("Caracter invalido, por favor utilise 'A' ou 'P' \n");
            }

        } while (tipo != 'a' && tipo != 'A' && tipo != 'p' && tipo != 'P');

        // Verifica o tipo de média escolhido e chama o método correspondente.
        if (tipo == 'a' || tipo == 'A') {
            media = tipoNota.aritimetica(quantidade, ler);
        } else if (tipo == 'p' || tipo == 'P') {
            media = tipoNota.ponderada(quantidade, ler);
        }

        // Exibe a média calculada.
        System.out.printf("A média do aluno é %.2f \n", media);

        // Analisa o resultado da média e informa o status do aluno.
        if (media >= n1) {
            System.out.println("Status: Aprovado");
        } else if (media >= n2) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
        // Fecha o Scanner ao final do programa.
        ler.close();
    }
}
