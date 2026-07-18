package java_atividades._11_Sistema_de_Funcionarios_Associacao.Dominio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionario {
    Scanner input = new Scanner(System.in);

    private String nome;
    private double salario;
    private Empresa empresa;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public void cadastrarFuncionario() {
        System.out.println("----------INICIANDO CADASTRO----------");
        System.out.println("Insira o nome do(a) funcionario(a): ");
        this.nome = input.nextLine();
        System.out.println("Insira o salario do(a) funcionario(a): ");
        this.salario = input.nextDouble();
        input.nextLine();
        System.out.println();
    }

    public void exebirDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nSalário: " + this.salario);
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

}
