package java_atividades._09_SistemaEscolar.Dominio;

public enum Formacao {
    PORTUGUÊS("Português"), MATEMÁTICA("Matemática"),
    INGLÊS("Inglês"), EDUCACAO_FÍSICA("Educação Física"),
    GEOGRAFIA("Geografia"), HISTÓRIA("História"),
    ARTES("Artes"), BIOLOGIA("Biologia"),
    QUÍMICA("Química"), FÍSICA("Física");

    private String nomeMateria;

    Formacao(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getNomeSerie() {
        return nomeMateria;
    }

}
