package Sistema_Controle_Animais.Dominio;

public class Gato extends GestorAtendimento {

    public Gato(long id) {
        this.idAnimal = id;
    }

    // imprime id do gato
    public void imprimirId() {
        System.out.println(getIdAnimal());
    }

    // coleta dados basicos do gato
    public void initGato() {
        initAnimal();// puxa o metodo fonte
    }

    // imprime dados de gato
    public void imprimirDadosGato() {
        imprimirDados();
    }
}
