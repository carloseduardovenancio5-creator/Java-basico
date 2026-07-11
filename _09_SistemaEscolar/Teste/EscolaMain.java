package java_atividades._09_SistemaEscolar.Teste;

import java_atividades._09_SistemaEscolar.Dominio.Aluno;
import java_atividades._09_SistemaEscolar.Dominio.Formacao;
import java_atividades._09_SistemaEscolar.Dominio.Professor;
import java_atividades._09_SistemaEscolar.Dominio.Serie;

public class EscolaMain {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Beltrano", 17, 548623001, Serie.ENCINO_MÉDIO);
        Professor professor01 = new Professor("Liana", 27, 742159638, Formacao.INGLÊS);

        aluno01.imprimirDados();
        professor01.imprimirDados();

    }
}