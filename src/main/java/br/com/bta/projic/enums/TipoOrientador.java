package br.com.bta.projic.enums;

public enum TipoOrientador {
    ORIENTADOR(0),
    CO_ORIENTADOR(1);
    
    public int value;

    TipoOrientador(int valueArg) {
        value = valueArg;
    }
}
