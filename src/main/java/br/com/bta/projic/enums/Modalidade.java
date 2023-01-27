package br.com.bta.projic.enums;

public enum Modalidade {
    ArtigoCientifico(0),
    RelatorioTecnico(1),
    Monografia(2),
    RelatorioTecnicoDeAtividadesDePorfolio(3),
    Resumo(4),
    GDD(5);

    public int value;

    Modalidade(int valueArg) {
        value = valueArg;
    }
}
