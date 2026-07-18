package java_atividades._11_Sistema_de_Funcionarios_Associacao.Teste;

import java.util.Scanner;

import java_atividades._11_Sistema_de_Funcionarios_Associacao.Dominio.Empresa;
import java_atividades._11_Sistema_de_Funcionarios_Associacao.Dominio.Funcionario;

public class MainFuncionario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaSalario = 0;

        Funcionario[] funcionario = new Funcionario[5];
        Empresa empresa = new Empresa("imobiaria fachado", funcionario);

        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i] = new Funcionario();// Cria o objeto
            funcionario[i].cadastrarFuncionario();// inicialisza o objeto
            funcionario[i].setEmpresa(empresa);
        }

        // exibir dados dos funcionarios
        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i].exebirDados();
        }

        // calculo da media
        for (int i = 0; i < funcionario.length; i++) {
            mediaSalario += funcionario[i].getSalario();
        }
        mediaSalario /= 5;
        System.out.println("Média salarial: " + mediaSalario);

        // verificação de acima da média
        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i].getSalario() >= mediaSalario) {
                System.out.println("Funcionário " + funcionario[i].getNome() +
                        " tem um salário maior que a média salárial");
            }
        }

        input.close();
    }
}
