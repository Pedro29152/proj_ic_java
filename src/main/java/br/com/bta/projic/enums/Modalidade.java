package br.com.bta.projic.enums;

public enum Modalidade {
    ARTIGO_CIENTIFICO(0),
    RELATORIO_TECNICO(1),
    MONOGRAFIA(2),
    RELATORIO_TECNICO_DE_ATIVIDADES_DE_PORTIFOLIO(3),
    RESUMO(4),
    GDD(5);

    public int value;

    Modalidade(int valueArg) {
        value = valueArg;
    }
}
