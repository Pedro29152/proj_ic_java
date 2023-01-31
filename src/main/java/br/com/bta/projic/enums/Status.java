package br.com.bta.projic.enums;

public enum Status {
    NOVO(0),
    ACEITO(1),
    RECUSADO(2);
    
    public int value;

    Status(int valueArg) {
        value = valueArg;
    }
}
