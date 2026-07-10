package java_atividades._07_Sistema_Controle_Animais.Dominio;

import java.util.Scanner;

public class Animal {
    // classe principal com todos dados de animais e todos comandos que devem ser
    // executados
    Scanner input = new Scanner(System.in);

    protected long idAnimal;
    protected char tipoAnimal;
    protected String nome;
    protected double idade;
    protected double peso;
    protected boolean atendido = false;
    protected Funcionario funcionario;

    public Animal() {

    }

    public void setTipoAnimal(char tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setAtendimento(boolean atendido) {
        this.atendido = atendido;
    }

    public char getTipoAnimal() {
        return tipoAnimal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    protected long getIdAnimal() {
        return idAnimal;
    }

    public double getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getAtendimento() {
        return atendido;
    }
}