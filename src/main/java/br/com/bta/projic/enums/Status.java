package br.com.bta.projic.enums;

public enum Status {
    Novo(0),
    Aceito(1),
    Recusado(2);
    
    public int value;

    Status(int valueArg) {
        value = valueArg;
    }
}
