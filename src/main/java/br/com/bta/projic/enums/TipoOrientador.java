package br.com.bta.projic.enums;

public enum TipoOrientador {
    Orientador(0),
    CoOrientador(1);
    
    public int value;

    TipoOrientador(int valueArg) {
        value = valueArg;
    }
}
