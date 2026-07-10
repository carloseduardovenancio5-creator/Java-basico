package java_atividades._07_Sistema_Controle_Animais.Dominio;

import javax.swing.JOptionPane;

public class GestorAtendimento extends Animal {
    // classe dedicada a comandos de atendimentos

    protected Animal[] filaDeAtendimento;

    public GestorAtendimento() {

    }

    public GestorAtendimento(Animal[] filaDeAtendimento) {
        this.filaDeAtendimento = filaDeAtendimento;
    }

    protected void initAnimal() {
        JOptionPane.showMessageDialog(null, "A seguir insira os dados do animal");

        System.out.println("Insira o tipo de animal (C=cachorro G=gato)");
        this.tipoAnimal = input.next().charAt(0);
        // next().charAt(0) pega somente o primeiro caracter
        input.nextLine();
        System.out.println("Insira o nome do animal: ");
        this.nome = input.nextLine();
        System.out.println("Insira a idade do animal: ");
        this.idade = input.nextDouble();
        System.out.println("Insira o peso do animal: ");
        this.peso = input.nextDouble();
        input.nextLine(); // consumir newline restante antes do nextLine()
        System.out.println("Insira o nome do funcionario responsavel");
        String nomeFuncionario = input.nextLine();
        System.out.println("Insira o id do funcionario responsavel");
        Long idFuncionario = input.nextLong();
        this.funcionario = new Funcionario(nomeFuncionario, idFuncionario);
    }

    protected void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Exibindo dados de " + this.idAnimal);
        String nomeFunc = (funcionario != null ? funcionario.getNome() : "N/A");
        JOptionPane.showMessageDialog(null,
                "ID: " + this.idAnimal + "\n" +
                        "Tipo de Animal : " + this.tipoAnimal + "\n" +
                        "Nome: " + this.nome + "\n" +
                        "Idade: " + this.idade + "\n" +
                        "Peso: " + this.peso + "\n" +
                        "Funcionario responsavel: " + nomeFunc + "\n" +
                        "Atendido? " + this.atendido);
    }

    public void verificarAtendimento(long animalatendido) {
        for (int i = 0; i < filaDeAtendimento.length; i++) {
            int realizado = 0;
            if (animalatendido == filaDeAtendimento[i].getIdAnimal()) {
                if (filaDeAtendimento[i].getAtendimento() == false) {
                    filaDeAtendimento[i].setAtendimento(true);
                    realizado = 1;
                    /*- Atendimento realizado
                    - Funcionário: <nome>
                    - Animal: <nome do animal>
                    - Aguardando atendimento: <quantidade> */
                    System.out.println(
                            "Atendimento realizado com SUCESSO \n Animal atendido: " + filaDeAtendimento[i].getNome()
                                    + "\n Funcionario responsavel:" + filaDeAtendimento[i].getFuncionario()
                                    + "\n Aguardando atendimento : " + (filaDeAtendimento.length - 1) + "\n Atendido: "
                                    + filaDeAtendimento[i].getAtendimento());
                    JOptionPane.showMessageDialog(null,
                            "Atendimento realizado com SUCESSO \n Animal atendido: " + filaDeAtendimento[i].getNome()
                                    + "\n Funcionario responsavel:" + filaDeAtendimento[i].funcionario.getNome()
                                    + "\n Aguardando atendimento : " + (filaDeAtendimento.length - 1) + "\n Atendido: "
                                    + filaDeAtendimento[i].getAtendimento());

                }
            }
            if (realizado == 0) {
                /*- Atendimento não realizado
                - Aguardando atendimento: <quantidade> */
                System.out.println("Atendimento não realizado \n Aguardando atendimento: " + filaDeAtendimento.length);

            }
        }
    }

}
