package java_atividades._07_Sistema_Controle_Animais.Dominio;

import java.util.Scanner;

public class Cachorro extends GestorAtendimento {

    Scanner input = new Scanner(System.in);

    public Cachorro(long id) {
        this.idAnimal = id;
    }

    // imprime id do cachorro
    public void imprimirId() {
        System.out.println(getIdAnimal());
    }

    // coleta dados basicos do cachorro
    public void initCachorro() {
        initAnimal();// puxa o metodo fonte
    }

    // imprime dados de cachorro
    public void imprimirDadosCachorro() {
        imprimirDados();
    }
}
