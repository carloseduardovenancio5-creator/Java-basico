package java_atividades._09_SistemaEscolar.Dominio;

public enum Serie {
    ENCINO_FUNDAMENTAL_I("Encino Fundamental I"),
    ENCINO_FUNDAMENTAL_II("Encino Fundamental II"),
    ENCINO_MÉDIO("Encino Médio ");

    private String NomeSerie;

    Serie(String NomeSerie) {
        this.NomeSerie = NomeSerie;
    }

    public String getNomeSerie() {
        return NomeSerie;
    }

}
